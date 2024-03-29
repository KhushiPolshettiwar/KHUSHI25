
package quizapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quizz extends JFrame implements ActionListener {
    
    String questions[][]=new String[10][5];
    String answers[][]=new String[10][2];
    String useranswers[][]= new String[10][1];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer =15; 
    public static int ans_given=0;
    ButtonGroup groupoptions;
    public static int count=0; 
    JButton lifeline, next, submit;
    public static int score=0;
    String name;
    
    Quizz(String name){
        this.name=name;
        setBounds(70,0,1140,750);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("D2.JPG"));
       JLabel image=new JLabel(i1);
       image.setBounds(0,30,1150,200);
        add(image);
        
        
        qno =new JLabel();
        qno.setBounds(80,250,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(qno);
        
        question =new JLabel();
        question.setBounds(120,250,800,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,18));
        add(question);
        
        
        questions[0][0] ="Which is used to find and fix bugs in the Java Programming ?";
        questions[0][1] ="JVM";
        questions[0][2] ="JDB";
        questions[0][3] ="JDK";
        questions[0][4] ="JRE";
        
        
          
        questions[1][0] ="What is the return type of the hashCode() method in the Object Class?";
        questions[1][1] ="int";
        questions[1][2] ="object";
        questions[1][3] ="long";
        questions[1][4] ="void";
        
         
        
        questions[2][0] ="Which package contains the random class?";
        questions[2][1] ="java.util package";
        questions[2][2] ="java.lang package";
        questions[2][3] ="java.awt package";
        questions[2][4] ="java. io package";
        
        
        
        questions[3][0] ="An interface with no fields or methods is known as?";
        questions[3][1] ="Runnable Interface";
        questions[3][2] ="Abstract Interface";
        questions[3][3] ="Marker Interface";
        questions[3][4] ="Charsequence Interface";
        
        
        
        questions[4][0] ="In which memory a String is stored,when we create astring new operator?";
        questions[4][1] ="Stack";
        questions[4][2] ="String memory";
        questions[4][3] ="Random storage space";
        questions[4][4] ="Heap memory";
        
        
        
        questions[5][0] ="Which of the following is a marker interface?";
        questions[5][1] ="Runnable Interface";
        questions[5][2] ="Remote Interface";
        questions[5][3] ="Readable Interface";
        questions[5][4] ="Result Interface";
        
        
        
        questions[6][0] ="Which keyword is used for accessing the features of a package?";
        questions[6][1] ="import";
        questions[6][2] ="package";
        questions[6][3] ="extends";
        questions[6][4] ="export";
        
        
        
        questions[7][0] ="In java,jar stands for?";
        questions[7][1] ="Java Archive Runner";
        questions[7][2] ="Java Archive";
        questions[7][3] ="Java Application Resource";
        questions[7][4] ="Java Apllication Runner";
        
        
        
        questions[8][0] ="Which of the following is a mutable class in Java?";
        questions[8][1] ="java.lang.StringBuilder";
        questions[8][2] ="java.lang.Short";
        questions[8][3] ="java.lang.Byte";
        questions[8][4] ="java.lang.String";
        
        
        
        questions[9][0] ="Which of the following option leads to the portability and security of Java?";
        questions[9][1] ="Bytecode is executed by JVM";
        questions[9][2] ="The applet makes the Java code secure and portable";
        questions[9][3] ="Use of exception handling";
        questions[9][4] ="Dyanamic binding between objects";
        
        
        
        answers[0][1]="JDB";
        answers[1][1]="int";
        answers[2][1]="java.util package";
        answers[3][1]="Marker Interface";
        answers[4][1]=" Heap Memory";
        answers[5][1]="Remote interface";
        answers[6][1]="import";
        answers[7][1]="Java Archive";
        answers[8][1]="java.lang.StringBuilder";
        answers[9][1]="Bytercode is executed by JVM";
       
        opt1 = new JRadioButton();
        opt1.setBounds(100,320,650,30);
        opt1.setFont(new Font("Dialog",Font.PLAIN, 20));
        add(opt1);
        
        
        opt2 = new JRadioButton();
        opt2.setBounds(100,360,650,30);
        opt2.setFont(new Font("Dialog",Font.PLAIN, 20));
        add(opt2);
        
        
        opt3 = new JRadioButton();
        opt3.setBounds(100,400,650,30);
        opt3.setFont(new Font("Dialog",Font.PLAIN, 20));
        add(opt3);
        
        
        
        opt4 = new JRadioButton();
        opt4.setBounds(100,440,650,30);
        opt4.setFont(new Font("Dialog",Font.PLAIN, 20));
        add(opt4);
        
        
        groupoptions =new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        
        
        lifeline =new JButton("50-50 Lifeline");
        lifeline.setBounds(850,310,160,35);
        lifeline.addActionListener(this);
        add(lifeline);
        
        
        next =new JButton("Next");
        next.setBounds(850,360,160,35);
        next.addActionListener(this);
        add(next);
        
        
        submit =new JButton("Submit");
        submit.setBounds(850,410,160,35);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        
        start(count);
        
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==next){
        repaint();
        opt1.setEnabled(true);
        opt2.setEnabled(true);
        opt3.setEnabled(true);
        opt4.setEnabled(true);
        
        ans_given=1;
         if(groupoptions.getSelection()==null){
               useranswers[count][0]=""; 
            }else{
               useranswers[count][0]= groupoptions.getSelection().getActionCommand();
            }
         
         if(count ==8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
        
        count++;
        start(count);
    }else if(ae.getSource() == lifeline){
        if (count ==2 || count ==4 || count==6 || count ==8 || count ==9){
            opt2.setEnabled(false);
            opt3.setEnabled(false);
        }else{
            opt1.setEnabled(false);
            opt4.setEnabled(false);
        }
        lifeline.setEnabled(false);
    }else if(ae.getSource()==submit){
        ans_given=1;
        if(groupoptions.getSelection()==null){
               useranswers[count][0]=""; 
            }else{
               useranswers[count][0]= groupoptions.getSelection().getActionCommand();
            }
                
               for(int i=0;i<useranswers.length;i++){
                   if(useranswers[i][0].equals(answers[i][1])){
                       score +=10;
                   }else{
                       score +=0;
                   }
               }
               setVisible(false);
               new score(name,score);
    }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time ="Time life  " + timer + "  seconds";       //15
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,20));
        
        if(timer >0){
            g.drawString(time,860,310);
        }else{
             g.drawString("Times up!!",860,310);
        }
        
        timer--;                                               //14
        
        try{
            Thread.sleep(1000);                          //1 sec=1000millisec
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given==1){
            ans_given =0;
            timer=15;
        }else if(timer<0){
            timer=15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count ==8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
            if(count ==9){                                   //submit
                if(groupoptions.getSelection()==null){
               useranswers[count][0]=""; 
            }else{
               useranswers[count][0]= groupoptions.getSelection().getActionCommand();
            }
                
               for(int i=0;i<useranswers.length;i++){
                   if(useranswers[i][0].equals(answers[i][1])){
                       score +=10;
                   }else{
                       score +=0;
                   }
               }
               setVisible(false);
               new score(name,score);
            }else{                                           //nextbutton
                if(groupoptions.getSelection()==null){
               useranswers[count][0]=""; 
            }else{
               useranswers[count][0]= groupoptions.getSelection().getActionCommand();
            }
            
            count++;                                          //0  //1
            start(count);
            }
            
        }
        
        
    }
    
    public void start(int count){
        qno.setText(" "+ (count+1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args){
        new Quizz("user");
    }

    
    
}
