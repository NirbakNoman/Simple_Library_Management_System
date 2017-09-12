/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

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
import javax.swing.JTextField;

/**
 *
 * @author noman
 */
public class Sign extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField tf1, tf2, tf5, tf6, tf7,tf8;
    JButton btn1, btn2;
    JPasswordField p1, p2;

    public void Login() {
        getContentPane().setBackground(Color.cyan);
        setVisible(true);
        setSize(800, 700);
        setLayout(null);
        setTitle("welcome to NOMAN's library");
        l1 = new JLabel("Registration Form ");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2 = new JLabel("User name   :");
        l3 = new JLabel("Email-ID    :");
        l4 = new JLabel("Create Passowrd :");
        l5 = new JLabel("Confirm Password :");
        l6=new JLabel("Student_ID  :");
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8=  new JTextField();
        btn1 = new JButton("Submit");
        btn2 = new JButton("Back");

        btn1.addActionListener(this);
        btn2.addActionListener(this);


        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 240,200,30);

        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        p1.setBounds(300, 150, 200, 30);
        p2.setBounds(300, 190, 200, 30);
        tf8.setBounds(300,240,200,30);

        btn1.setBounds(50, 400, 100, 30);
        btn2.setBounds(300, 400, 100, 30);

        add(l1);
        add(l2);
        add(l6);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(p1);
        add(l5);
        add(p2);
        add(tf8);

        add(btn1);
        add(btn2);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String name, confirmpassword, password, email, submit,back,s_id;
        int id;
        submit = ae.getActionCommand();
        back=ae.getActionCommand();
        name = tf1.getText();
         
        password = p1.getText();
//         if(password.equals(""))
//        {
//            JOptionPane.showMessageDialog(null,"fill up the password!");
//        }
        confirmpassword = p2.getText();
        s_id= tf8.getText();
//        if(s_id.equals(""))
//        {
//            JOptionPane.showMessageDialog(null,"fill up the id!");
//        }
     
        email = tf2.getText();
//        if(email.equals(""))
//        {
//            JOptionPane.showMessageDialog(null,"fill up the email!");
//        }
        int l = email.length();
         
        int i = 0, atfound = 0,atfoundpos=0,dotfoundpos=0, dotfound = 0, emailtrue = 0,j;
        while(i!=l)
        {
            if(email.charAt(i)=='@')
            {
                atfound = 1;
                atfoundpos =i;
            }
            i++;
        }
     
          i = 0;
        while(i!=l)
        {
            if(email.charAt(i)=='.')
            {
                dotfound = 1;
                dotfoundpos = i;
            }
            i++;
        }
        
        int strcount =0;
        if(atfoundpos>dotfoundpos)
            emailtrue = 0;
        else if(dotfoundpos-atfoundpos==1||atfound == 0 ||dotfound==0)
            emailtrue = 0;
        else
        {
            for(i=dotfoundpos;i<l;i++)
            {
                strcount++;
            }
            if(strcount>1)
                emailtrue = 1;
        }
     
        
            
    
        try {
               
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String pass = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);

//            //System.out.println("Connected\n");
  
        if(name.equals("")||password.equals("")||s_id.equals("")||email.equals(""))
           {
             if ("Submit".equals(submit)) {

            JOptionPane.showMessageDialog(null,"fill up the full form!");
             }
        }
        else if(s_id.length()!=7)
            JOptionPane.showMessageDialog(null, "Incorrect Student Id!");
        else if (emailtrue == 1) {
                 id =Integer.parseInt(s_id);
                 
                String query2 = "Select * from reg1 where student_id = '"+id+"'";
                PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                preparedStmt2.execute();
                 ResultSet rs2 = preparedStmt2.getResultSet();
                String query3 = "Select * from reg1 where email = '"+email+"'";
                
                PreparedStatement preparedStmt3 = conn.prepareStatement(query3);   
                
                preparedStmt3.execute();
               
                ResultSet rs3 = preparedStmt3.getResultSet();
                int idtaken = 0,emailtaken = 0;
                
                while(rs2.next()) 
                {
                   
                    if(rs2.getString("student_id").equals(s_id))
                    {
                        JOptionPane.showMessageDialog(null, "Id has been taken!");
                        idtaken = 1;
                        break;
                    }
                }
                while(rs3.next()) 
                {
                   
                    if(rs3.getString("email").equals(email))
                    {
                        JOptionPane.showMessageDialog(null, "Email has been taken!");
                        emailtaken = 1;
                        break;
                    }
                }
                if(idtaken==0&&emailtaken==0)
                {
                 String query = " insert into reg1 (student_id, name, email, pass)"
                        + " values ('"+ id +" ','" + name + "', '" + email + "', '" + password + "')";
                if ("Submit".equals(submit)) {
                   
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    ResultSet rs = preparedStmt.getResultSet();
                    if (password == null ? confirmpassword != null : !password.equals(confirmpassword)) {
                        JOptionPane.showMessageDialog(null, "Password not Match");
                    } else {
                      //System.out.println(query);
//                      preparedStmt.setString(1,name);
//                      preparedStmt.setString(2, password);
//                      preparedStmt.setString(3, email);
                        preparedStmt.execute();
                        JOptionPane.showMessageDialog(null, "Your registration is successfully done:)");
                        setVisible(false);
                    }
   
                }
               
                
                }

            }
       
            else
            {
                JOptionPane.showMessageDialog(null, "your Email pattern is wrong!");
            }
          if("Back".equals(back))
                {
                   
                setVisible(false);
                }

            conn.close();
        } catch (SQLException | HeadlessException fe) {
            System.err.println("Got an exception in sign up!");
            System.err.println(fe.getMessage());
        }
//        throw new UnsupportedOperationException("Not supported yet.");
    }
}

