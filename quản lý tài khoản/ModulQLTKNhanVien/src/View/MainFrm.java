/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author TUYETTRAN
 */
public class MainFrm extends JFrame implements ActionListener {
    private JButton btnAdd;
    private JButton btnSearch;

    public MainFrm() {
        super("User-MVC");
        btnAdd = new JButton("Add");
        btnSearch = new JButton("Delete/Edit");
        JPanel content = new JPanel();
        content.setLayout(new GridLayout(1,2,5,5));
        content.add(btnAdd);     content.add(btnSearch);
        
        btnAdd.addActionListener( this);
        btnSearch.addActionListener( this);
        this.setContentPane(content);
        this.pack();
        
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn.equals(btnAdd)){
            AddUserFrm auf = new AddUserFrm();
            auf.setVisible(true);
        }else if(btn.equals(btnSearch)){
            SearchUserFrm suf = new SearchUserFrm();
            suf.setVisible(true);
        }   
    }
    
}
