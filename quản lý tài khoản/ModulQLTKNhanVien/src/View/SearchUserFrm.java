/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UserDAO;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TUYETTRAN
 */
public class SearchUserFrm extends JFrame implements ActionListener{
    private JTextField txtUsername;
    private JButton btnSearch;
    private JTable tblResult;
    DefaultTableModel model = new DefaultTableModel();
    private String[] colName = {"id","usename","password","fullname","position","Delete","Edit"};
    
    public SearchUserFrm() {
        super("Search User-MVC");
        txtUsername = new JTextField(15);
        btnSearch = new JButton("Search");
        setLayout(new BorderLayout());

        JPanel searchContent = new JPanel(new GridLayout(1,3,5,5));
        searchContent.add(new JLabel("Username: ")); searchContent.add(txtUsername);
        searchContent.add(btnSearch);
        this.add(searchContent,BorderLayout.CENTER);
        
        JPanel result = new JPanel(new BorderLayout(10,10));
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(colName);
        tblResult = new JTable(model);
        result.add(new JScrollPane(tblResult));
        this.add(result,BorderLayout.PAGE_END);
        
        btnSearch.addActionListener(this);
        this.pack();
        setVisible(true);
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public void btnSearch_actionperformed() {
        UserDAO uc = new UserDAO();
        ResultSet rs = uc.getUsers(txtUsername.getText());
        loadTable(rs);
}
    public void loadTable(ResultSet rs){
        Object[][] data1 = null;
        int rows = 0;// so hang cua rs
        try {
            rs.last();
            rows = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        try {
            int dem = 0;
            String[][] arr = new String[rows][7];
            while(rs.next()){
                for(int i = 0; i < 5;i++){
                    arr[dem][i] = rs.getString(i+1);
                }
                arr[dem][5] = "Delete";
                arr[dem][6] = "Edit";
                dem++;
            }
            String[][] arr1 = new String[dem][7];
            arr1 = arr;
            data1 = arr1;
            
        } catch (SQLException ex) {
            
        }
        model = new DefaultTableModel(data1, colName);            
        tblResult.setModel(model);  
        Action delete = new AbstractAction(){
            public void actionPerformed(ActionEvent e)
            {
                tblResult = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                System.out.println(modelRow);
                int id = Integer.parseInt((String)((DefaultTableModel)tblResult.getModel()).getValueAt(modelRow,0));
                
                JOptionPane jp = new JOptionPane();
                int choiced = jp.showConfirmDialog(null, "Are you sure ?", null, JOptionPane.YES_NO_OPTION);
                if(choiced == JOptionPane.YES_OPTION){
                    UserDAO uc = new UserDAO();
                    uc.deleteUser(id);
                    ((DefaultTableModel)tblResult.getModel()).removeRow(modelRow);
                }else{
                    
                }
                
            }
        };
 
        Action edit = new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tblResult = (JTable)e.getSource();
                int modelRow = Integer.valueOf( e.getActionCommand() );
                System.out.println(modelRow);
                int id = Integer.parseInt((String)((DefaultTableModel)tblResult.getModel()).getValueAt(modelRow,0));
                System.out.println(id);
                
                EditUserFrm euf = new EditUserFrm(id);
                euf.setVisible(true);
            }
            
        };
        ButtonColumn buttonColumn = new ButtonColumn(tblResult, delete, 5);
        ButtonColumn buttonColumn1 = new ButtonColumn(tblResult, edit, 6);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
    }
       
        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn.equals(btnSearch)){
            btnSearch_actionperformed();
        }
            
    }
    
}
