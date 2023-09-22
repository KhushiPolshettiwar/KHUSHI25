
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener{                  //inheritance (JFrame class is under swing package)
    
    JButton rules,back;
    JTextField tfname;
            
    login(){                                        //constructor
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("download.png"));
       JLabel image=new JLabel(i1);
       image.setBounds(40,30,400,400);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(500,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(510,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(510,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,16));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(510,270,120,25);
        rules.addActionListener(this);
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(710,270,120,25);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1000,500);
        setLocation(100,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==back){
            setVisible(false);
        }
        
    }
    
    public static void main(String[] args){
        login l = new login(); //object
        l.init();
    }

    void init() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
