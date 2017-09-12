/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author noman
 */
public class book_issue extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField tf1, tf2,tf3,tf4, tf5, tf6, tf7,tf8;
    JButton btn1,btn2,btn3;
   public void book_issue()
    {  
        
        setTitle("book issue page");
        setVisible(true);
        setSize(800,700);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        
        l1 = new JLabel("Your Issue Form ");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        
        l2 = new JLabel("Student Id : ");
        l3 = new JLabel("Book ID    : ");
        l4 = new JLabel("date       : ");
        l5 =  new JLabel ("N.B Your date format should be  ( year / month / day ) ");
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        
      
        
       

        
        l1.setBounds(100, 30, 400, 30);
        l3.setBounds(80, 70, 200, 30);
        l4.setBounds(80, 110, 200, 30);
        
        l5.setBounds(100, 250, 500, 30);
        l5.setForeground(Color.blue);
        l5.setFont(new Font("Serif", Font.BOLD, 20));
        //l4.setBounds(80, 150, 200, 30);
       

        tf2.setBounds(300, 70, 200, 30);
        tf3.setBounds(300, 110, 200, 30);
        //tf3.setBounds(300, 150, 200, 30);
       
      
        btn1 = new JButton("Submit");
        btn1.setBounds(50, 200, 100, 30);
         btn2 = new JButton("Back");
        btn2.setBounds(300, 200, 100, 30);
       

        add(l1);
        //add(l2);
        add(l3);
        add(l4);
        add(l5);
        
      
       // add(tf1);
        add(tf2);
        add(tf3);
       
        add(btn1);
        add(btn2);
           
        btn1.addActionListener(this);
         btn2.addActionListener(this);
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    
      public void actionPerformed(ActionEvent e) {
           String str1,str2,str3,str4,str5,astr6,bstr7,tstr8,str9,submit,insert,back;
           submit = e.getActionCommand();
           back = e.getActionCommand();
           
           //str1=tf1.getText();//for student_id
           str2=tf2.getText(); //for book_id
           str3=tf3.getText(); //for date
           
           
     try
        {
            
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query="insert into book_issue(student_id,book_id,date)"+"values('"+Loginform.stdid+"','"+str2+"','"+str3+"')"; //for aythor
        
        if(str2.equals("")||str3.equals(""))
           {
             if ("Submit".equals(submit)) {

            JOptionPane.showMessageDialog(null,"fill up the  form!");
             }
        }
        if("Submit".equals(submit))
        {
         PreparedStatement preparedStmt = conn.prepareStatement(query);
                ResultSet rs = preparedStmt.getResultSet();
                 preparedStmt.execute();
                 
                  tf1.setText("");
                  tf2.setText("");
                  tf3.setText("");
                  //System.out.println(query);
                  
        }
        if("Back".equals(back))
        {
        setVisible(false);
        }
        
        conn.close();
    }
    catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got book_issue exception!");
    }
    }
    
    }

