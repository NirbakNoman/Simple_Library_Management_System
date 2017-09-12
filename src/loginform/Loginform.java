/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author noman
 */
public class Loginform extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField tf1;
    JButton btn1;
    JButton btn2;
    JPasswordField p1;
    JPanel pn;
    static int stdid;

    /**
     * @param args the command line arguments
     */
    Loginform() {

        setTitle(" library management ");

        //setBackground(Color.blue);

        setVisible(true);
        setSize(800, 700);
        setLayout(null);


        l1 = new JLabel("Login Form for library management:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("monospaced", Font.BOLD, 20));

        l2 = new JLabel("User Name:");
        l3 = new JLabel("Enter Password:");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Login");
        btn2 = new JButton("sign up");
        getContentPane().setBackground(Color.CYAN);
        //l1.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
        int w = 100, x = 30, y = 400, z = 30;
        l1.setBounds(w + 100, x - 10, y + 100, z);
        l2.setBounds(w, 70, 200, 30);
        l3.setBounds(w, 110, 200, 30);
        tf1.setBounds(200, 70, 200, 30);
        p1.setBounds(200, 110, 200, 30);
        btn1.setBounds(150, 160, 100, 30);
        btn2.setBounds(350, 160, 100, 30);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(p1);
        add(btn1);
        add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);

    }

    public void showData() throws ClassNotFoundException {

        JFrame f1 = new JFrame();
        JLabel l, l0, l1,l2,l3,l4,l5,l6;
        JButton bt1, bt2, bt3;

        String str1 = tf1.getText();
        char[] p = p1.getPassword();
        String str2 = new String(p);
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "";
        try {

            //Class.forName("oracle.jdbc.driver.OracleDriver");
            //Connection con = DriverManager.getConnection("jdbc:oracle:thin:@mcndesktop07:1521:xe", "sandeep", "welcome");
            // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:@mcndesktop07:1521:xe", "sandeep", "welcome");
            admine r = new admine();
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
            
            PreparedStatement ps = conn.prepareStatement("select name,student_id from reg1 where name='" + str1 + "' and pass='" + str2 + "'");
            //PreparedStatement ps2 = conn.prepareStatement("select name from reg where name='"+str1 +"' and pass='"+admin_pass +"'");
//            ps.setString(1, str1);
//            ps.setString(2, str2);


            ResultSet rs = ps.executeQuery();
            //ResultSet rs2 = ps2.executeQuery();
            
            if (str1.equals("noman") &&str2.equals("min")) {
                 r.admin();  
                
            } else if (rs.next()) {
                stdid=rs.getInt("student_id");
                f1.setTitle("welcome to noman's library");
                f1.setVisible(true);
                f1.setSize(800, 700);
                f1.setLayout(null);
                f1.getContentPane().setBackground(Color.BLUE);
               
                l0 = new JLabel("you are succefully logged in..");
                l0.setForeground(Color.GREEN);
                l0.setFont(new Font("Serif", Font.BOLD, 30));
                l0.setBounds(120, 100, 400, 40);
                
                l2=new JLabel("there are three types of books here ");
                l2.setBounds(40,180,550,40);
                l2.setForeground(Color.red);
                l2.setFont(new Font("Serif",Font.BOLD,30));
                
                l3=new JLabel(" 1:story ");
                l3.setBounds(180,230,200,40);
                l3.setForeground(Color.green);
                l3.setFont(new Font("Serif",Font.BOLD,30));
                
                l4=new JLabel(" 2:science fiction");
                l4.setBounds(180,280,240,40);
                l4.setForeground(Color.green);
                l4.setFont(new Font("Serif",Font.BOLD,30));
                
                l5=new JLabel(" 3:poem");
                l5.setBounds(180,330,200,40);
                l5.setForeground(Color.green);
                l5.setFont(new Font("Serif",Font.BOLD,30));
                
               
                
                l = new JLabel();
                l.setText("Welcome " + rs.getString(1));
                l.setBounds(250, 50, 400, 30);
                l.setForeground(Color.red);
                l.setFont(new Font("Serif", Font.BOLD, 30));
                
                 l1 = new JLabel("books are");
                l1.setFont(new Font("monospaced", Font.BOLD, 30));
                l1.setForeground(Color.CYAN);
                l1.setBounds(60, 380, 200, 30);
                
                l6 = new JLabel("Query Implementation page");
                l6.setFont(new Font("monospaced", Font.BOLD, 30));
                l6.setForeground(Color.CYAN);
                l6.setBounds(50, 500, 450, 30);
                
                bt1 = new JButton("here");
                bt1.setBounds(260, 380, 200, 30);
                
                bt2 = new JButton("Go");
                bt2.setBounds(510, 500, 100, 30);
                
                f1.add(bt1);
                f1.add(bt2);
                
                f1.add(l);
                f1.add(l0);
                f1.add(l1);
                f1.add(l2);
                f1.add(l3);
                f1.add(l4);
                f1.add(l5);
                f1.add(l6);
                
                bt1.addActionListener(this);
                bt2.addActionListener(this);
                


            } else {
                JOptionPane.showMessageDialog(null,
                        "Incorrect email-Id or password..Try Again with correct detail");
                // System.out.println("Welcome");
            }
            conn.close();


        } catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);
        }
    }
//  @Override
//      public void actionPerformed (ActionEvent ae)
//                {
//                    
//                    if(ae.getActionCommand()=="here")
//                    {
//                       users u= new users(); 
//                    }
//                } 

    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        Sign ab = new Sign();
        //users b = new users();
        if (e.getActionCommand() == "Login") {
            try {
                showData();
                tf1.setText("");
                p1.setText("");
                
              // System.out.println(query);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getActionCommand() == "sign up") {

            ab.Login();
        } 
        else if (e.getActionCommand() == "here") {
            //b.main_p();
             search s = new search();
              s.setVisible(true);
        }
        
        else if (e.getActionCommand() == "Go") {
            //b.main_p();
             query_search s = new query_search();
              s.setVisible(true);
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        Loginform s = new Loginform();

    }
}
