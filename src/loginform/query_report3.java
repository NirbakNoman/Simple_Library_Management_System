/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author noman
 */
public class query_report3 extends javax.swing.JFrame {

    /**
     * Creates new form query_report3
     */
     // String add1;
      String text;
    public query_report3() {
        initComponents();
        Update_table();
        setTitle("Query table 3");
//        try {
//            String url = "jdbc:mysql://localhost:3306/student";
//            String user = "root";
//            String password = "";
//            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
//
//            DefaultTableModel model = (DefaultTableModel) BookList.getModel();
//
//            String query2 = " SELECT   a.book_name ,   b.author_name ,   c.type_name   from  book  a LEFT  JOIN  author  b  ON    a.author_id = b.author_id   LEFT   JOIN   TYPE   c  ON   a.type_id  =  c.type_id    WHERE   a.author_id = 1  AND    c.type_id = 1 ";
//
//            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
//            preparedStmt2.execute();
//            ResultSet rs2 = preparedStmt2.getResultSet();
//
////  model.setRowCount(0);
//
//            while (rs2.next()) {
//                //System.out.println(rs2.getString("book_name"));
//                model.addRow(new Object[]{rs2.getString("a.book_name"), rs2.getString("b.author_name"),rs2.getString("c.type_name")});
//
//            }
//            conn.close();
//        } catch (SQLException | HeadlessException ex) {
//            //System.out.println("Welcome");
//            System.out.println(ex);
//
//        }
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
     private void Update_table()
    {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);

            DefaultTableModel model = (DefaultTableModel) BookList.getModel();

            String query2 = "SELECT   a.book_name ,   b.author_name ,   c.type_name   from  book  a LEFT  JOIN  author  b  ON    a.author_id = b.author_id   LEFT   JOIN   TYPE   c  ON   a.type_id  =  c.type_id    WHERE   a.author_id = 1  AND    c.type_id = 1  ";

            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
            preparedStmt2.execute();
            ResultSet rs2 = preparedStmt2.getResultSet();
             model.setRowCount(0);

            while (rs2.next()) {
                //System.out.println(rs2.getString("book_name"));
                 model.addRow(new Object[]{rs2.getString("a.book_name")});

            }
            
            conn.close();
        } 
        
        catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);

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

        jScrollPane1 = new javax.swing.JScrollPane();
        BookList = new javax.swing.JTable();
        bt_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookList.setAutoCreateRowSorter(true);
        BookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book_name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        BookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookListMouseClicked(evt);
            }
        });
        BookList.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BookListPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(BookList);

        bt_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_delete.setForeground(new java.awt.Color(204, 0, 0));
        bt_delete.setText("DELETE");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(bt_delete)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bt_delete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListMouseClicked
        // TODO add your handling code here:
        
               int row = BookList.getSelectedRow();
        int column = BookList.getSelectedColumn();
        if(row!=-1 && column!=-1)
        {
         text = BookList.getValueAt(row, column).toString(); 
         //System.out.println(text);
        }
         
    }//GEN-LAST:event_BookListMouseClicked

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
          int d = JOptionPane.showConfirmDialog(null,"Do you Really want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(d==0)
        {
            
            
          String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
           
        String  query = "delete from book where book_name = '"+text+"'";
       try
       {
          Connection conn = (Connection) DriverManager.getConnection(url, user, password); 
        PreparedStatement preparedStmt2 = conn.prepareStatement(query);
           
            //ResultSet rs = preparedStmt2.getResultSet();
          //pst = conn.prepareStatement(sql);
        // preparedStmt2.setString(1, add1.getText());
        //   preparedStmt2.setString(1, tx_bname.getText());
          preparedStmt2.execute();
          JOptionPane.showMessageDialog(null,"Deleted");
        }
    catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);

        }
       Update_table();
    }                      
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void BookListPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BookListPropertyChange
        // TODO add your handling code here:
        String book_name1;
                DefaultTableModel model = (DefaultTableModel) BookList.getModel();
        int row = BookList.getSelectedRow();
        int column = BookList.getSelectedColumn();
        if(row!=-1 && column!=-1)
        {
           book_name1 = BookList.getValueAt(row, column).toString();
            try{
             String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password); 
        //String value1 = tx_sid.getText();
        //int s_id = Integer.parseInt(value1);
         //String value2 = tx_name.getText();
          //String value3 = txt_Surname.getText();
           //String value4 = txt_Age.getText();
         
         String query = "update book set book_name='"+book_name1+"' where book_name='"+text+"' ";
         PreparedStatement preparedStmt2 = conn.prepareStatement(query);
         preparedStmt2.execute();
         ResultSet rs = preparedStmt2.getResultSet();
          model.setRowCount(0);
           Update_table();
           
        // tx_sid.setText("");
         //tx_name.setText("");
        }
       catch (Exception e)
        {
       JOptionPane.showMessageDialog(null,e);
       
       }
           
         }
        
    }//GEN-LAST:event_BookListPropertyChange

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
            java.util.logging.Logger.getLogger(query_report3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(query_report3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(query_report3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(query_report3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new query_report3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookList;
    private javax.swing.JButton bt_delete;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}