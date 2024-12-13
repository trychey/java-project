/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sabit
 */
public class Companies extends javax.swing.JFrame {

    /**
     * Creates new form Companies
     */
    public Companies() {
        setTitle("Companies");
        initComponents();
        updateTable();
        idFld.setEnabled(false);
        comDelBtn.setEnabled(false);
        comUpdateBtn.setEnabled(false);
        idLbl.setVisible(false);
        idFld.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
        comInsertBtn = new javax.swing.JButton();
        comUpdateBtn = new javax.swing.JButton();
        comDelBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        idLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        comName = new javax.swing.JTextField();
        comNum = new javax.swing.JTextField();
        comMail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        comAddress = new javax.swing.JTextArea();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                                                                                                                    Companies");

        comTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Company Name", "Company Phone", "Company Email", "Company Address"
            }
        ));
        comTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(comTable);

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        comInsertBtn.setText("Insert");
        comInsertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comInsertBtnActionPerformed(evt);
            }
        });

        comUpdateBtn.setText("Update");
        comUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comUpdateBtnActionPerformed(evt);
            }
        });

        comDelBtn.setText("Delete");
        comDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comDelBtnActionPerformed(evt);
            }
        });

        idLbl.setText("Id");

        jLabel3.setText("Name");

        jLabel4.setText("Phone");

        jLabel5.setText("Email");

        jLabel6.setText("Address");

        comAddress.setColumns(20);
        comAddress.setRows(5);
        jScrollPane2.setViewportView(comAddress);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(idLbl))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idFld)
                            .addComponent(comName)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comNum)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(comMail))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLbl)
                    .addComponent(idFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comInsertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comUpdateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comDelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comInsertBtn)
                            .addComponent(comUpdateBtn)
                            .addComponent(comDelBtn))
                        .addGap(42, 42, 42)
                        .addComponent(backBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comInsertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comInsertBtnActionPerformed

        InsertCompany();
    }//GEN-LAST:event_comInsertBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed

        comName.setText("");
        comNum.setText("");
        comMail.setText("");
        comAddress.setText("");

    }//GEN-LAST:event_clearBtnActionPerformed

    private void comTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comTableMouseClicked
 
        int i = comTable.getSelectedRow();

        DefaultTableModel model = (DefaultTableModel) comTable.getModel();
        idFld.setText(model.getValueAt(i, 0).toString());
        comName.setText(model.getValueAt(i, 1).toString());
        comNum.setText(model.getValueAt(i, 2).toString());
        comMail.setText(model.getValueAt(i, 3).toString());
        comAddress.setText(model.getValueAt(i, 4).toString());
        comDelBtn.setEnabled(true);
        comUpdateBtn.setEnabled(true);
        comInsertBtn.setEnabled(false);


    }//GEN-LAST:event_comTableMouseClicked

    private void comUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comUpdateBtnActionPerformed
  
        updateCompany();
    }//GEN-LAST:event_comUpdateBtnActionPerformed

    private void comDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comDelBtnActionPerformed
   
        deleteCompany();
    }//GEN-LAST:event_comDelBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
   
        MainPage mainpage = new MainPage();
        dispose();
        mainpage.wcLbl.setText("Welcome: " +GlobalConstant.name);
        mainpage.setVisible(true);

    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Companies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Companies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Companies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Companies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Companies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextArea comAddress;
    private javax.swing.JButton comDelBtn;
    private javax.swing.JButton comInsertBtn;
    private javax.swing.JTextField comMail;
    private javax.swing.JTextField comName;
    private javax.swing.JTextField comNum;
    private javax.swing.JTable comTable;
    private javax.swing.JButton comUpdateBtn;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel idLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
public void updateTable() {
        Connection con;

        PreparedStatement ps;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/medical_store", "root", "root");
            ps = con.prepareStatement("SELECT * FROM company");

            ResultSet rs = ps.executeQuery();
            comTable.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {

            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
    String sql = "INSERT INTO company(name,phone,email,address)" + " VALUES (?,?,?,?)";

    public void InsertCompany() {

        Companies com = new Companies();
        Connection con;
        PreparedStatement ps;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/medical_store", "root", "root");
            ps = con.prepareStatement(sql);
            ps.setString(1, comName.getText());
            ps.setString(2, comNum.getText());
            ps.setString(3, comMail.getText());
            ps.setString(4, comAddress.getText());

            int save = ps.executeUpdate();


            if (save > 0) {
 
                JOptionPane.showMessageDialog(null, "saved");
                dispose();
                com.updateTable();
                com.setVisible(true);
                dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Not saved");

            }

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Insert Valid Data");
            dispose();
            com.setVisible(true);
        }

    }

    public void updateCompany() {
        Companies com = new Companies();


        String sql = "UPDATE company SET name='" + comName.getText() + "',phone='" + comNum.getText() + "',email='" + comMail.getText() + "',address='" + comAddress.getText() + "' WHERE id='" + idFld.getText() + "'";

        Connection con;
        PreparedStatement ps;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/medical_store", "root", "root");
            ps = con.prepareStatement(sql);

            int save = ps.executeUpdate();

            System.out.println("executeQuery");

            if (save > 0) {
          
                JOptionPane.showMessageDialog(null, "saved");
                dispose();
                com.updateTable();
                com.setVisible(true);
                dispose();

            } else {
       
                JOptionPane.showMessageDialog(null, "Not saved");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Insert Valid Data");
            dispose();
            com.setVisible(true);
        }

    }

    public void deleteCompany() {
        Companies com = new Companies();

        String sql = "DELETE FROM  company  WHERE id='" + idFld.getText() + "'";

        Connection con;
        PreparedStatement ps;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost/medical_store", "root", "root");
            ps = con.prepareStatement(sql);

            int save = ps.executeUpdate();

            System.out.println("executeQuery");

            if (save > 0) {
          
                JOptionPane.showMessageDialog(null, "Deleted");
                dispose();
                com.updateTable();
                com.setVisible(true);
                dispose();

            } else {

                JOptionPane.showMessageDialog(null, "Not Deleted");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Deleted Valid Data");
            dispose();
            com.setVisible(true);
        }

    }

}
