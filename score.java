
package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class score extends JFrame implements ActionListener {
    
    score(String name,int score){
         
        setBounds(200,80,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("score.png"));
        Image i2 =i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(60,100,300,300);
        add(image);
        
        
        JLabel heading =new JLabel("Thank you " + name + " for playing Simple Minds" );
        heading.setBounds(190,20,750,70);
        heading.setFont(new Font("Tahoma",Font.BOLD,24));
        add(heading);
        
        
        JLabel lblscore =new JLabel(" Your score is  " + score );
        lblscore.setBounds(490,150,850,70);
        lblscore.setFont(new Font("Tahoma",Font.BOLD,24));
        add(lblscore);
        
        
        JButton submit =new JButton("Play Again");
        submit.setBounds(510,270,160,35);
        submit.setEnabled(true);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true); 
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        login l = new login();
        l.init();
    }
    
    public static void main(String[] args){
        new score("user",0);
    }

   
}
