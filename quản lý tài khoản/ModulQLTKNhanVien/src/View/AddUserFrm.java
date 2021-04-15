/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


/**
 *
 * @author TUYETTRAN
 */

import Controller.UserDAO;
import Model.User;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddUserFrm extends JFrame implements ActionListener{
    private JTextField txtID;
    private JTextField txtUsename;
    private JTextField txtPassword;
    private JTextField txtFullname;
    private JTextField txtPosition;
    private JButton btnSubmit;
    private JButton btnReset;
    
    public AddUserFrm(){
        super("Add User-MVC");
        
        txtID = new JTextField(15);
        txtUsename= new JTextField(15);
        txtPassword = new JTextField(15);
        txtFullname = new JTextField(15);
        txtPosition= new JTextField(15);
        btnSubmit = new JButton("Submit");
        btnReset = new JButton("Reset");
        
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
    
    
    
    public void showMessage(String msg){
        JOptionPane.showMessageDialog(this, msg);
    }
    
    public boolean numberException(String id){
            try{
              Integer.parseInt(id);
              return true;
                
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("ERR: Ban quen chua nhap!");
                return false;
            }
            catch(NumberFormatException e){
                System.out.println("ERR: Sai kieu!");
                return false;
            }
    }
    
    public void btnSubmit_actionperformed() {
        UserDAO ud = new  UserDAO();
        User user = new User();
        if(numberException(txtID.getText())== true && ud.userExited(Integer.parseInt(txtID.getText()))){
            JOptionPane.showMessageDialog(this, "User ID exited!");
        }
        else if(numberException(txtID.getText())== false){
            JOptionPane.showMessageDialog(this, "User ID isn't a number");
        }
        else if(txtUsename.getText().length() == 0 || txtPassword.getText().length() == 0 || 
                txtFullname.getText().length() == 0 || txtPosition.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Let filling out user form fully! ");
        }
                        
        else {
            user.setId(Integer.parseInt(txtID.getText()));
            user.setUsename(txtUsename.getText());
            user.setPassword(txtPassword.getText());
            user.setFullname(txtFullname.getText());
            user.setPosition(txtPosition.getText());
            UserDAO uc = new UserDAO();
            uc.addUser(user);
            JOptionPane.showMessageDialog(this, "Add user successfullly!");
            btnReset_actionperformed();
        }
        
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
    
    public void btnReset_actionperformed() {
        txtID.setText("");
        txtUsename.setText("");
        txtPassword.setText("");
        txtFullname.setText("");
        txtPosition.setText("");
    }
}
