/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author noman
 */
public class search extends javax.swing.JFrame {

    /**
     * Creates new form search
     */
    static String bnamesearch; 
    static String anamesearch; 
      static String tnamesearch;
    public search() {
        setTitle("Search Page For Users");
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
       String query1= "select * from author";
   
                 PreparedStatement preparedStmt = conn.prepareStatement(query1);
                preparedStmt.execute();
                 ResultSet rs1 = preparedStmt.getResultSet();
                 
                 String query2= " select * from type ";
                 PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
                 preparedStmt2.execute();
                 ResultSet rs2 = preparedStmt2.getResultSet();
                 
                
                      while(rs1.next())
                      {
                   
                   
                   String aname=rs1.getString("author_name");
                   com_aname.addItem(aname);
                   
                      
                      }
                       while(rs2.next())
                      {
                  String tname=rs2.getString("type_name");
                 //int id =Integer.parseInt(b_name);
                   com_tname.addItem(tname);
                      
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
        l_bname = new javax.swing.JLabel();
        tx_bname = new javax.swing.JTextField();
        bt_bname = new javax.swing.JButton();
        l_aname = new javax.swing.JLabel();
        com_aname = new javax.swing.JComboBox();
        bt_aname = new javax.swing.JButton();
        l_tname = new javax.swing.JLabel();
        com_tname = new javax.swing.JComboBox();
        bt_tname = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        bt_next = new javax.swing.JButton();
        bt_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(102, 102, 255));
        l1.setText("                                   Do You Like Books ??");

        l2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(102, 102, 255));
        l2.setText("                  Please Search Here !!!!");

        l_bname.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        l_bname.setForeground(new java.awt.Color(0, 51, 204));
        l_bname.setText("Search By Book Name     :");

        tx_bname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        bt_bname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_bname.setForeground(new java.awt.Color(0, 204, 102));
        bt_bname.setText("Search");
        bt_bname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bnameActionPerformed(evt);
            }
        });

        l_aname.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        l_aname.setForeground(new java.awt.Color(0, 51, 204));
        l_aname.setText("Select Author Name         :");

        com_aname.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        com_aname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Author Name" }));

        bt_aname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_aname.setForeground(new java.awt.Color(0, 204, 102));
        bt_aname.setText("Search");
        bt_aname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_anameActionPerformed(evt);
            }
        });

        l_tname.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        l_tname.setForeground(new java.awt.Color(0, 51, 204));
        l_tname.setText("Select Type                       :");

        com_tname.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        com_tname.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Type" }));

        bt_tname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_tname.setForeground(new java.awt.Color(0, 204, 102));
        bt_tname.setText("Search");
        bt_tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tnameActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 51, 204));
        l3.setText("Would You Like To Borrow Book");

        bt_next.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_next.setForeground(new java.awt.Color(0, 153, 102));
        bt_next.setText("Yes");
        bt_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nextActionPerformed(evt);
            }
        });

        bt_back.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bt_back.setForeground(new java.awt.Color(0, 153, 102));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(l_tname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(l_aname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(com_aname, 0, 140, Short.MAX_VALUE)
                            .addComponent(com_tname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tx_bname)
                            .addComponent(bt_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bt_bname, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(bt_aname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_tname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bt_back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_bname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_aname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_tname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(com_tname)
                        .addComponent(bt_tname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_next, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_bnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bnameActionPerformed
        // TODO add your handling code here:
       bnamesearch = tx_bname.getText();
          Search1 a = new Search1();
          a.setVisible(true);   
    }//GEN-LAST:event_bt_bnameActionPerformed

    private void bt_anameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_anameActionPerformed
        // TODO add your handling code here:
         anamesearch = com_aname.getSelectedItem().toString();
          Book_search2 b = new Book_search2();
          b.setVisible(true);  
    }//GEN-LAST:event_bt_anameActionPerformed

    private void bt_tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tnameActionPerformed
        // TODO add your handling code here:
         tnamesearch = com_tname.getSelectedItem().toString();
          Book_search3 c = new  Book_search3();
          c.setVisible(true);      
    }//GEN-LAST:event_bt_tnameActionPerformed

    private void bt_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nextActionPerformed
        // TODO add your handling code here:
        book_issue an=new book_issue();
        an.book_issue();  
    }//GEN-LAST:event_bt_nextActionPerformed

    private void bt_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_bt_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_aname;
    private javax.swing.JButton bt_back;
    private javax.swing.JButton bt_bname;
    private javax.swing.JButton bt_next;
    private javax.swing.JButton bt_tname;
    private javax.swing.JComboBox com_aname;
    private javax.swing.JComboBox com_tname;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l_aname;
    private javax.swing.JLabel l_bname;
    private javax.swing.JLabel l_tname;
    private javax.swing.JTextField tx_bname;
    // End of variables declaration//GEN-END:variables
}
