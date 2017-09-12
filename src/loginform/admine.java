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
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author noman
 */
public class admine extends JFrame implements ActionListener {
     JMenu jmenuFile, jmenuHelp,edit;
    JMenuItem help,about,exit,standard,scientific,color,pink;
    JMenuBar bar =new JMenuBar();
    JPanel panel=new JPanel();
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9,l12,l20,l21,l22,l23,l24;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,atx8,btx9,ttx10,u_tx4;;
    void admin()
    {
        int x=100,y=50,w=100,z=40;
        setTitle("Admin page");
        setVisible(true);
     
        setSize(800,700);
        setLayout(null);
        getContentPane().setBackground(Color.CYAN);
        
         
        l1 = new JLabel(" this is not for you viewers !!! ");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 40));
        l1.setBounds(180, 20, 500, 80);
        
        
        l2=new JLabel("Auther Id:");
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("Serif",Font.BOLD,20));
        l2.setBounds(x-40,y+70,w+10,z);
        l3=new JLabel("Author name");
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setBounds(x+230,y+70,w+10,z);
        tx1=new JTextField("  ");
        tx2=new JTextField("  ");
        tx1.setBounds(x+80,y+70,w+20,z);
        tx2.setBounds(x+350,y+70,w+20,z);
        b1=new JButton("Insert_1");
        b1.setBounds(x+500,y+70,w,z);
        b1.setForeground(Color.blue);
        
        
        
        l4=new JLabel("Type Id ");
        l4.setBounds(x-40,y+150,w+10,z);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.BLUE);
        l5=new JLabel("Type name");
        l5.setBounds(x+230,y+150,w+10,z);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.BLUE);
        tx5=new JTextField("   ");
        tx5.setBounds(x+80,y+150,w+20,z);
        tx3=new JTextField("   ");
        tx3.setBounds(x+350,y+150,w+20,z);
        b2=new JButton("Insert_2");
        b2.setForeground(Color.blue);
        b2.setBounds(x+500,y+150,w,z);
        
        l6=new JLabel("Author Id ");
        l6.setBounds(x-40,y+230,w+10,z);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setForeground(Color.BLUE);
        l7=new JLabel("Book name");
        l7.setBounds(x+230,y+230,w+10,z);
        l7.setFont(new Font("Serif",Font.BOLD,20));
        l7.setForeground(Color.BLUE);
        l8=new JLabel("Type Id");
        l8.setBounds(x-40,y+300,w+10,z);
        l8.setFont(new Font("Serif",Font.BOLD,20));
        l8.setForeground(Color.BLUE);
        atx8=new JTextField("  ");
        btx9=new JTextField("  ");
        ttx10=new JTextField("  ");
        atx8.setBounds(x+80,y+230,w+20,z);
        btx9.setBounds(x+350,y+230,w+40,z);
        ttx10.setBounds(x+80,y+300,w+20,z);
        b3=new JButton("Insert_3");
        b3.setForeground(Color.blue);
        b3.setBounds(x+500,y+300,w,z);
        
        l9=new JLabel("For Deleting please !!!");
        l9.setBounds(x+250,y+380,w+300,z);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.BLUE);
        
        b4=new JButton("Go");
        b4.setForeground(Color.red);
        b4.setBounds(x+500,y+380,w,z);
        
        l22=new JLabel("For Updating please !!!");
        l22.setBounds(x+250,y+480,w+300,z);
        l22.setFont(new Font("Serif",Font.BOLD,20));
        l22.setForeground(Color.BLUE);
        
        b5=new JButton("Here");
        b5.setForeground(Color.green);
        b5.setBounds(x+500,y+480,w,z);
        b6=new JButton("Back");
        b6.setForeground(Color.green);
        b6.setBounds(x+50,y+510,w,z);
//        tx4=new JTextField("   ");
//        tx4.setBounds(x+80,y+380,w+500,z+10);
       
        
       
//        u_tx4=new JTextField("  ");
//        u_tx4.setBounds(x+80,y+500,w+30,z); 
        
        
        
        
       
       
    
       add(l1);
       add(l2);
       add(l3);
       add(l4);
       add(l5);
       add(l5);
       add(l6);
       add(l7);
       add(l8);
       add(l9);
       add(l22);
      
        add(tx1);
        add(tx2);
        add(tx3);
        add(tx5);
        add(atx8);
        add(btx9);
        add(ttx10);
        //add(tx4);
        //add(u_tx4);
       
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        
       setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      
       
    }
       public void actionPerformed(ActionEvent e) {
           String str1,str2,str3,str4,str5,astr6,bstr7,tstr8,str9,insert1,insert2,insert3,back;
           
           insert1 = e.getActionCommand();
           insert2 = e.getActionCommand();
           insert3 = e.getActionCommand();
           back=e.getActionCommand();
           //delete = e.getActionCommand();
           str1=tx1.getText();//for author
           str2=tx2.getText(); //for author
           str5=tx5.getText(); //for type
           str3=tx3.getText();//for type
           astr6=atx8.getText(); //for book
           bstr7=btx9.getText(); //for book
           tstr8=ttx10.getText(); //for book
           
           //str4=tx4.getText(); //fordelete
          
    try
    {
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query1="insert into author(author_id ,author_name)"+"values('"+str1+"','"+str2+"')"; //for aythor
        String query2="insert into type(type_id,type_name)"+"values('"+str5+"','"+str3+"')"; //for type
        String query3="insert into book(author_id,book_name,type_id)"+"values('"+astr6+"','"+bstr7+"','"+tstr8+"')";
        //String query4="delete  from book  where book_name= '"+str4+"' ";
          if("Back".equals(back))
        {
         
            setVisible(false);
                   
                  }
        if("Insert_1".equals(insert1))
        {
         PreparedStatement preparedStmt1 = conn.prepareStatement(query1);
                ResultSet rs1 = preparedStmt1.getResultSet();
                 preparedStmt1.execute();
                  tx1.setText("");
                  tx2.setText("");
                  //System.out.println(query1);
                  
        }
        if("Insert_2".equals(insert2))
        {
         PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                ResultSet rs2 = preparedStmt2.getResultSet();
                 preparedStmt2.execute();
                  tx5.setText("");
                  tx3.setText("");
                   
                  
        }
        if("Insert_3".equals(insert3))
        {
         PreparedStatement preparedStmt3 = conn.prepareStatement(query3);
                ResultSet rs3 = preparedStmt3.getResultSet();
                 preparedStmt3.execute();
                  atx8.setText("");
                  btx9.setText("");
                 ttx10.setText("");
               
        }
       else if(e.getActionCommand() == "Go")
        {
//         PreparedStatement preparedStmt4= conn.prepareStatement(query4);
//                ResultSet rs4 = preparedStmt4.getResultSet();
//                 preparedStmt4.execute();
//                  tx4.setText(" ");
            admin1 d = new admin1();
              d.setVisible(true);
                  
        }
         else if(e.getActionCommand() == "Here")
        {
//         PreparedStatement preparedStmt4= conn.prepareStatement(query4);
//                ResultSet rs4 = preparedStmt4.getResultSet();
//                 preparedStmt4.execute();
//                  tx4.setText(" ");
            admin2 r = new admin2();
              r.setVisible(true);
                  
        }
        conn.close();
    }
    catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got an exception in insertion!");
    }
    }
    
}
