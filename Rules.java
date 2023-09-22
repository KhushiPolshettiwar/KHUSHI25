
package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
       this.name=name;
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
        JLabel heading=new JLabel("Welcome   "+ name );
        heading.setBounds(50,20,400,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
        "<html>"+
                "1. There are total ten question.Select the correct answer"+"<br><br>" +
                "2. They will be given 15 seconds for each question"+"<br><br>" +
                "3. Will be awarded 5 marks for each correct answer "+ "<br><br>"+
                "4. All questions are compulsory with no negative markings"+"<br><br>"+
                "5. The Quiz need to be completed in one sitting,uninterrupted"+ "<br><br>"+
                "6. Question will be asked on the basis of Java" + "<br><br>" +
                "7. May you know more than what John Snow knows, GOOD LUCK" + "<br><br>" +
                "<html>"
        );
        add(rules);
        
        back =new JButton("Back");
        back.setBounds(250,450,100,30);
        back.addActionListener(this);
        add(back);
        
        start=new JButton("Start");
        start.setBounds(400,450,100, 30);
        start.addActionListener(this);
        add(start);
        
       
       setSize(700,550);
       setLocation(250,100);
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
           new Quizz(name);
        }else{
            setVisible(false);
            new login();
        }
    }
     
    
    
    public static void main(String[] args){
        new Rules("User");
    }

    
    
    
}
