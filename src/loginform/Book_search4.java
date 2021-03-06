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
public class Book_search4 extends javax.swing.JFrame {

    /**
     * Creates new form Book_search4
     */
    public Book_search4() {
        initComponents();
        Update_table();
        setTitle("Query table 2");
//        try {
//            String url = "jdbc:mysql://localhost:3306/student";
//            String user = "root";
//            String password = "";
//            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
//
//            DefaultTableModel model = (DefaultTableModel) BookList.getModel();
//
//            String query2 = " select student_id,  name  from  reg1   r   where  not  exists(select  student_id  from  book_issue  b  where  r.student_id  =  b.student_id) ";
//
//            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
//            preparedStmt2.execute();
//            ResultSet rs2 = preparedStmt2.getResultSet();
//
////  model.setRowCount(0);
//
//            while (rs2.next()) {
//                //System.out.println(rs2.getString("book_name"));
//                model.addRow(new Object[]{rs2.getInt("student_id"), rs2.getString("name")});
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

            String query2 = " select student_id,  name  from  reg1   r   where  not  exists(select  student_id  from  book_issue  b  where  r.student_id  =  b.student_id) ";

            PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
            preparedStmt2.execute();
            ResultSet rs2 = preparedStmt2.getResultSet();
             model.setRowCount(0);

            while (rs2.next()) {
                //System.out.println(rs2.getString("book_name"));
                model.addRow(new Object[]{rs2.getInt("student_id"), rs2.getString("name")});

            }
            conn.close();
        } catch (SQLException | HeadlessException ex) {
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
        l_sid = new javax.swing.JLabel();
        l_name = new javax.swing.JLabel();
        tx_sid = new javax.swing.JTextField();
        tx_name = new javax.swing.JTextField();
        bt_update = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "student_id", "name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
        jScrollPane1.setViewportView(BookList);

        l_sid.setText("student_id");

        l_name.setText("name");

        tx_sid.setEditable(false);

        bt_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_update.setForeground(new java.awt.Color(0, 102, 102));
        bt_update.setText("UPDATE");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_sid, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tx_name, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(tx_sid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_update)
                    .addComponent(bt_delete))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_sid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_update))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_delete))
                .addContainerGap(324, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookListMouseClicked
        // TODO add your handling code here:
         try{
             
          String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password);
        int row = BookList.getSelectedRow();
        String Table_click=(BookList.getModel().getValueAt(row, 0).toString());
      String query  = "select * from reg1 where student_id="+Table_click+" ";
       PreparedStatement preparedStmt2 = conn.prepareStatement(query);
            preparedStmt2.execute();
            ResultSet rs = preparedStmt2.getResultSet();
        if(rs.next())
        {
        String add1 = rs.getString("student_id");
         //int s_id = Integer.parseInt(add1);
        tx_sid.setText(add1);
         
        String add2 = rs.getString("name");
        tx_name.setText(add2);
//        String add3 = rs.getString("surname");
//        txt_Surname.setText(add3);
//        String add4 = rs.getString("age");
//        txt_Age.setText(add4);

         
        }
         }
         catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);

        }
    }//GEN-LAST:event_BookListMouseClicked

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        // TODO add your handling code here:
         try{
             String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
            Connection conn = (Connection) DriverManager.getConnection(url, user, password); 
        String value1 = tx_sid.getText();
        //int s_id = Integer.parseInt(value1);
         String value2 = tx_name.getText();
          //String value3 = txt_Surname.getText();
           //String value4 = txt_Age.getText();

         String query = "update reg1 set name='"+value2+"' where student_id='"+value1+"' ";
         PreparedStatement preparedStmt2 = conn.prepareStatement(query);
         preparedStmt2.execute();
         ResultSet rs = preparedStmt2.getResultSet();
         JOptionPane.showMessageDialog(null,"Updated");
         tx_sid.setText("");
         tx_name.setText("");
        }
       catch (Exception e)
        {
       JOptionPane.showMessageDialog(null,e);
       
       }
Update_table();
    }//GEN-LAST:event_bt_updateActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        // TODO add your handling code here:
         int d = JOptionPane.showConfirmDialog(null,"Do you Really want to Delete","Delete",JOptionPane.YES_NO_OPTION);
        if(d==0)
        {
            
            
          String url = "jdbc:mysql://localhost:3306/student";
            String user = "root";
            String password = "";
           
        String  query = "delete from reg1 where student_id = ?";
       try
       {
          Connection conn = (Connection) DriverManager.getConnection(url, user, password); 
        PreparedStatement preparedStmt2 = conn.prepareStatement(query);
           
            //ResultSet rs = preparedStmt2.getResultSet();
          //pst = conn.prepareStatement(sql);
           preparedStmt2.setString(1, tx_sid.getText());
          preparedStmt2.execute();
          JOptionPane.showMessageDialog(null,"Deleted");
        }
    catch (SQLException | HeadlessException ex) {
            //System.out.println("Welcome");
            System.out.println(ex);

        }
       Update_table();
    }//GEN-LAST:event_bt_deleteActionPerformed
}
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
            java.util.logging.Logger.getLogger(Book_search4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_search4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_search4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_search4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_search4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookList;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_sid;
    private javax.swing.JTextField tx_name;
    private javax.swing.JTextField tx_sid;
    // End of variables declaration//GEN-END:variables
}
