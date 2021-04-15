/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UserDAO;
import Model.User;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author TUYETTRAN
 */
public class EditUserFrm extends JFrame implements ActionListener{
    private JTextField txtID;
    private JTextField txtUsename;
    private JTextField txtPassword;
    private JTextField txtFullname;
    private JTextField txtPosition;
    private JButton btnSubmit;
    private JButton btnReset;
    
    private int id;

    public EditUserFrm(int id) {
        super("Edit User-MVC");
        this.id = id;
        txtID = new JTextField(15);
        txtUsename= new JTextField(15);
        txtPassword = new JTextField(15);
        txtFullname = new JTextField(15);
        txtPosition= new JTextField(15);
        btnSubmit = new JButton("Submit");
        btnReset = new JButton("Reset");
        
        txtID.setEditable(false);
        
        User u = new User();
        UserDAO ud = new UserDAO();
        ResultSet rs = ud.getUsers(id);
        
        System.out.println(id);
        
                u.setId(id);
            try {
                while(rs.next() && rs != null){
                    u.setUsename( rs.getString(2));
                    u.setPassword(rs.getString(3));
                    u.setFullname(rs.getString(4));
                    u.setPosition(rs.getString(5));
                }
                
                System.out.println(u.getUsename());
            } catch (SQLException ex) {
                Logger.getLogger(EditUserFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        txtID.setText(u.getId()+"");
        txtUsename.setText(u.getUsename());
        txtPassword.setText(u.getPassword());
        txtFullname.setText(u.getFullname());
        txtPosition.setText(u.getPosition());
        
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(6,2,5,5));
        content.add(new JLabel("ID:"));     content.add(txtID);
        content.add(new JLabel("Usename:"));     content.add(txtUsename);
        content.add(new JLabel("Password:"));     content.add(txtPassword);
        content.add(new JLabel("Fullname:"));     content.add(txtFullname);
        content.add(new JLabel("Position:"));     content.add(txtPosition);
        content.add(btnReset);     content.add(btnSubmit);
        
        btnSubmit.addActionListener(this);
        btnReset.addActionListener(this);
        this.setContentPane(content);
        this.pack();
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public void btnReset_actionperformed() {
        txtID.setText("");
        txtUsename.setText("");
        txtPassword.setText("");
        txtFullname.setText("");
        txtPosition.setText("");
    }
    public void btnSubmit_actionperformed() {
        UserDAO ud = new UserDAO();
        ud.updateUser(id, getUser());
        JOptionPane.showMessageDialog(this, "Edit user successfullly!");
    }
    public User getUser(){
        User user = new User();
        user.setId(Integer.parseInt(txtID.getText()));
        user.setUsename(txtUsename.getText());
        user.setPassword(txtPassword.getText());
        user.setFullname(txtFullname.getText());
        user.setPosition(txtPosition.getText());
        return user;
    }
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn.equals(btnSubmit)){
            btnSubmit_actionperformed();
        }else if(btn.equals(btnReset)){
            btnReset_actionperformed();
        }    
    }
    
}
