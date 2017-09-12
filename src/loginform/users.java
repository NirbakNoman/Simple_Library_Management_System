/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author noman
 */
public class users extends JFrame implements ActionListener {
     JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
     JTextField tf1,tf2,tf3, tf6, tf7, tf8;
    JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7;
    static String bnamesearch; 
    static String anamesearch; 
      static String tnamesearch;
    public void main_p() {
        setTitle("Users InterFaces");
        setVisible(true);
        setSize(800, 700);
        getContentPane().setBackground( Color.cyan);
        setLayout(null);
        
        btn2 =new JButton("LogOut");
        btn2.setBackground(Color.cyan);
        btn2 .setBounds(600, 20, 100, 30);
        btn2.setForeground(Color.red);
        
        
        l2 = new JLabel("do you like books ??");
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("monospaced", Font.BOLD, 20));
        l2.setBounds(250, 40, 500, 40);
        l3 = new JLabel("Please search here!!!!");
        l3.setForeground(Color.blue);
        l3.setFont(new Font("Serif", Font.BOLD, 40));
        l3.setBounds(200, 80, 500, 40);
        
        l4=new JLabel("search by book name");
        l4.setForeground(Color.BLUE);
        l4.setFont(new Font("Serif", Font.BOLD, 20));
        l4.setBounds(50, 150, 500, 40);
        tf1=new JTextField("");
        tf1.setBounds(250,150,130,40);
        btn4 = new JButton("GO!");
        btn4.setBounds(450, 150, 120, 40);
        btn4.setFont(new Font("monospaced", Font.BOLD, 20));
        btn4.setForeground(Color.green);
        
        l5=new JLabel("search by author name");
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Serif", Font.BOLD, 20));
        l5.setBounds(50, 230, 500, 40);
        tf2=new JTextField("");
        tf2.setBounds(250,230,130,40);
        btn5 = new JButton("ENTER");
        btn5.setBounds(450, 230, 120, 40);
        btn5.setFont(new Font("monospaced", Font.BOLD, 20));
        btn5.setForeground(Color.green);
        
        l6=new JLabel("search by book type");
        l6.setForeground(Color.BLUE);
        l6.setFont(new Font("Serif", Font.BOLD, 20));
        l6.setBounds(50, 310, 500, 40);
        tf3=new JTextField("");
        tf3.setBounds(250,310,130,40);
        btn6 = new JButton("YES");
        btn6.setBounds(450, 310, 120, 40);
        btn6.setForeground(Color.green);
        btn6.setFont(new Font("monospaced", Font.BOLD, 20));
        
        l7=new JLabel("would you like to borrow book");
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Serif", Font.BOLD, 20));
        l7.setBounds(250, 380, 500, 40);
        
        l8=new JLabel("please");
        l8.setForeground(Color.BLUE);
        l8.setFont(new Font("Serif", Font.BOLD, 20));
        l8.setBounds(150, 420, 500, 40);
        btn7 = new JButton("Click");
        btn7.setBounds(250, 420, 110, 40);
        btn7.setFont(new Font("monospaced", Font.BOLD, 20));
        btn7.setForeground(Color.green);
        
        
        btn2.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        
        add(tf1);
        add(tf2);
        add(tf3);
        
        
        add(btn2);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
      public void actionPerformed(ActionEvent ae) {
      book_issue an = new book_issue();
      String value,click;
      value = ae.getActionCommand();
      //click = ae.getActionCommand();
      if("LogOut".equals(value))
      {
          setVisible(false);
          
      }
      if(ae.getActionCommand().equals("GO!"))
      {
          bnamesearch = tf1.getText();
          Search1 a = new Search1();
          a.setVisible(true);        
          
      }
      else if(ae.getActionCommand().equals("ENTER"))
      {
          anamesearch = tf2.getText();
          Search1 a = new Search1();
          a.setVisible(true);        
          
      }
       else if(ae.getActionCommand().equals("YES"))
      {
          tnamesearch = tf3.getText();
          Search1 a = new Search1();
          a.setVisible(true);        
          
      }
        if(ae.getActionCommand() == "Click")
      {
          
       an.book_issue();   
      }
    }
    
}
