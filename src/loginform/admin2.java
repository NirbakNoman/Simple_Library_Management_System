/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.Color;
import java.awt.Color;
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
public class admin2 extends JFrame  {

    /**
     * Creates new form admin2
     */
    public admin2() {
         setVisible(true);
         setTitle("Updating page");
        getContentPane().setBackground(Color.CYAN);
        initComponents();
        Fillcombo();
         setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
     private void Fillcombo()
{
    try
    {
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
      Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
                 String query1= "select * from reg1";
                 PreparedStatement preparedStmt = conn.prepareStatement(query1);
                 preparedStmt.execute();
                 ResultSet rs1 = preparedStmt.getResultSet();
                 
                 String query2= " select * from book ";
                 PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                 preparedStmt2.execute();
                 ResultSet rs2 = preparedStmt2.getResultSet();
                 
                 String query3= " select * from type ";
                 PreparedStatement preparedStmt3 = conn.prepareStatement(query3);
                 preparedStmt3.execute();
                 ResultSet rs3 = preparedStmt3.getResultSet();
                 
                 String query4= " select * from author ";
                 PreparedStatement preparedStmt4 = conn.prepareStatement(query4);
                 preparedStmt4.execute();
                 ResultSet rs4 = preparedStmt4.getResultSet();
                 
                      while(rs1.next())
                      {
                   String s_id=rs1.getString("name");
                   com_sid.addItem(s_id);
                   
                      }
                      
                       while(rs2.next())
                      {
                  String b_id=rs2.getString("book_name");
                 //int id =Integer.parseInt(b_name);
                   com_bid.addItem(b_id);
                      
                      }
                       
                        while(rs3.next())
                      {
                  String t_id=rs3.getString("type_name");
                 //int id =Integer.parseInt(b_name);
                   com_tid.addItem(t_id);
                      
                      } 
                        
                         while(rs4.next())
                      {
                  String a_id=rs4.getString("author_name");
                 //int id =Integer.parseInt(b_name);
                   com_aid.addItem(a_id);
                      
                      }
                    
                   conn.close();
    }
    catch(SQLException | HeadlessException e)
    {
       System.out.println(e);
    }
   
}
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l_uname = new javax.swing.JLabel();
        tx_uname = new javax.swing.JTextField();
        l_id = new javax.swing.JLabel();
        com_sid = new javax.swing.JComboBox();
        l3 = new javax.swing.JLabel();
        bt_uname = new javax.swing.JButton();
        l_bname = new javax.swing.JLabel();
        tx_bname = new javax.swing.JTextField();
        l_bid = new javax.swing.JLabel();
        com_bid = new javax.swing.JComboBox();
        bt_bname = new javax.swing.JButton();
        l4 = new javax.swing.JLabel();
        l_type = new javax.swing.JLabel();
        tx_type = new javax.swing.JTextField();
        l_tid = new javax.swing.JLabel();
        com_tid = new javax.swing.JComboBox();
        bt_tname = new javax.swing.JButton();
        l5 = new javax.swing.JLabel();
        l_author = new javax.swing.JLabel();
        tx_aname = new javax.swing.JTextField();
        a_id = new javax.swing.JLabel();
        com_aid = new javax.swing.JComboBox();
        bt_aname = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 0));

        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 51, 255));
        l1.setText("                          !!! This Page Is For Update !!!");

        l2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 51, 255));
        l2.setText("Updating  User Name");

        l_uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_uname.setForeground(new java.awt.Color(0, 51, 255));
        l_uname.setText("New  User Name");

        l_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_id.setForeground(new java.awt.Color(0, 51, 255));
        l_id.setText("Select Name");

        com_sid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_sid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S_Name" }));

        l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 255));
        l3.setText("Updating Book Name");

        bt_uname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_uname.setForeground(new java.awt.Color(0, 51, 255));
        bt_uname.setText("Edit");
        bt_uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_unameActionPerformed(evt);
            }
        });

        l_bname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bname.setForeground(new java.awt.Color(0, 51, 204));
        l_bname.setText("New Book Name");

        l_bid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_bid.setForeground(new java.awt.Color(0, 51, 204));
        l_bid.setText("Select Book");

        com_bid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_bid.setForeground(new java.awt.Color(51, 51, 51));
        com_bid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B_Name" }));

        bt_bname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_bname.setForeground(new java.awt.Color(0, 51, 204));
        bt_bname.setText("Edit");
        bt_bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bnameActionPerformed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 51, 204));
        l4.setText("Updating Book Type");

        l_type.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_type.setForeground(new java.awt.Color(0, 51, 204));
        l_type.setText("New Book Type");

        l_tid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_tid.setForeground(new java.awt.Color(0, 51, 204));
        l_tid.setText("Select Type");

        com_tid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_tid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T_Name" }));

        bt_tname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_tname.setForeground(new java.awt.Color(0, 51, 204));
        bt_tname.setText("Edit");
        bt_tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tnameActionPerformed(evt);
            }
        });

        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 51, 204));
        l5.setText("Updating Author Name");

        l_author.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l_author.setForeground(new java.awt.Color(0, 51, 204));
        l_author.setText("New Author Name");

        a_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        a_id.setForeground(new java.awt.Color(0, 51, 204));
        a_id.setText("Select Author");

        com_aid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        com_aid.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A_Name" }));

        bt_aname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_aname.setForeground(new java.awt.Color(0, 51, 204));
        bt_aname.setText("Edit");
        bt_aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_anameActionPerformed(evt);
            }
        });

        bt_back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 204, 153));
        bt_back.setText("Back");
        bt_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(l_author, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tx_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(l_type, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tx_type, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(l_uname)
                                    .addGap(18, 18, 18)
                                    .addComponent(tx_uname)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tx_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(l_bid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(com_bid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(l_tid, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(a_id))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(com_aid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(com_tid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l_id, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(com_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_tname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tx_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_id, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(com_sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_uname)))
                    .addComponent(l_uname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_bid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_bname))
                .addGap(35, 35, 35)
                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_type, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_tid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_tname))
                .addGap(51, 51, 51)
                .addComponent(l5)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_author)
                    .addComponent(tx_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_id)
                    .addComponent(com_aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_aname))
                .addGap(12, 12, 12)
                .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_unameActionPerformed
        // TODO add your handling code here:
            try
    {
        String s_name,st_name;
        st_name = com_sid.getSelectedItem().toString(); 
        s_name = tx_uname.getText(); 
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query1="update reg1 set  name='"+ s_name +"' where name='"+st_name+"' "; //for student
       
         
         //String query2="delete  from book where book_name='"+ b_name +"' "; //for book
        
          
         PreparedStatement preparedStmt = conn.prepareStatement(query1);
              
         //ResultSet rs1 = preparedStmt.getResultSet();
         preparedStmt.execute();
         tx_uname.setText("");
          
     
    conn.close(); 
    }
      
      
       
    
     catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got an exception in update!");
    }  
    }//GEN-LAST:event_bt_unameActionPerformed

    private void bt_bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bnameActionPerformed
        // TODO add your handling code here:
                try
    {
        String b_name,bk_name;
        bk_name = com_bid.getSelectedItem().toString(); 
        b_name = tx_bname.getText(); 
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query1="update book set  book_name='"+ b_name +"' where book_name='"+bk_name+"' "; //for student
       
         
         //String query2="delete  from book where book_name='"+ b_name +"' "; //for book
        
          
         PreparedStatement preparedStmt = conn.prepareStatement(query1);
              
         //ResultSet rs1 = preparedStmt.getResultSet();
         preparedStmt.execute();
           tx_bname.setText("");
          
     
    conn.close(); 
    }
      
      
       
    
     catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got an exception in update!");
    }  
    }//GEN-LAST:event_bt_bnameActionPerformed

    private void bt_tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tnameActionPerformed
        // TODO add your handling code here:
                     try
    {
        String t_name,ty_id;
        ty_id = com_tid.getSelectedItem().toString(); 
        t_name = tx_type.getText(); 
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query1="update type set  type_name='"+ t_name +"' where type_name='"+ty_id+"' "; //for student
       
         
         //String query2="delete  from book where book_name='"+ b_name +"' "; //for book
        
          
         PreparedStatement preparedStmt = conn.prepareStatement(query1);
              
         //ResultSet rs1 = preparedStmt.getResultSet();
         preparedStmt.execute();
           tx_type.setText("");
     
    conn.close(); 
    }
      
      
       
    
     catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got an exception in update!");
    }  
    }//GEN-LAST:event_bt_tnameActionPerformed

    private void bt_anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_anameActionPerformed
        // TODO add your handling code here:
                        try
    {
        String a_name,at_id;
        at_id = com_aid.getSelectedItem().toString(); 
        a_name = tx_aname.getText(); 
        String url="jdbc:mysql://localhost:3306/student";
        String user="root";
        String pass="";
        Connection conn=(Connection)DriverManager.getConnection(url,user,pass);
        String query1="update author set  book_name='"+ a_name +"' where author_name='"+at_id+"' "; //for student
       
         
         //String query2="delete  from book where book_name='"+ b_name +"' "; //for book
        
          
         PreparedStatement preparedStmt = conn.prepareStatement(query1);
              
         //ResultSet rs1 = preparedStmt.getResultSet();
         preparedStmt.execute();
           tx_aname.setText("");
          
     
    conn.close(); 
    }
      
      
       
    
     catch(SQLException | HeadlessException fe)
    {
    
     System.err.println("Got an exception in update!");
    } 
    }//GEN-LAST:event_bt_anameActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        // TODO add your handling code here:
      setVisible(false);
    }//GEN-LAST:event_bt_backActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(admin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new admin2().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a_id;
    private javax.swing.JButton bt_aname;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_bname;
    private javax.swing.JButton bt_tname;
    private javax.swing.JButton bt_uname;
    private javax.swing.JComboBox com_aid;
    private javax.swing.JComboBox com_bid;
    private javax.swing.JComboBox com_sid;
    private javax.swing.JComboBox com_tid;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l_author;
    private javax.swing.JLabel l_bid;
    private javax.swing.JLabel l_bname;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_tid;
    private javax.swing.JLabel l_type;
    private javax.swing.JLabel l_uname;
    private javax.swing.JTextField tx_aname;
    private javax.swing.JTextField tx_bname;
    private javax.swing.JTextField tx_type;
    private javax.swing.JTextField tx_uname;
    // End of variables declaration//GEN-END:variables



    
}

