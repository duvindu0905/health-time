/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.*;
import controller.LoginController;
import javax.swing.JOptionPane;
/**
 *
 * @author sanug
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        clearError();
        clearTextBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMainHeading = new javax.swing.JLabel();
        lblUseranme1 = new javax.swing.JLabel();
        lblUseranme2 = new javax.swing.JLabel();
        lblMainHeading1 = new javax.swing.JLabel();
        lblHome13 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblHome14 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblHome16 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        lblErrorUsername = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorType = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(11, 60, 77));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/cardiogram (2).png"))); // NOI18N

        lblMainHeading.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMainHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblMainHeading.setText("HealthTime.IO");

        lblUseranme1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUseranme1.setForeground(new java.awt.Color(255, 255, 255));
        lblUseranme1.setText("Be Happy, Be Healthy");

        lblUseranme2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblUseranme2.setForeground(new java.awt.Color(255, 255, 255));
        lblUseranme2.setText("Healthtime.io (Pvt) Ltd.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMainHeading)
                    .addComponent(jLabel1)
                    .addComponent(lblUseranme1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUseranme2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblMainHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUseranme1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUseranme2)
                .addGap(57, 57, 57))
        );

        lblMainHeading1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblMainHeading1.setForeground(new java.awt.Color(11, 60, 77));
        lblMainHeading1.setText("Welcome");

        lblHome13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHome13.setForeground(new java.awt.Color(11, 60, 77));
        lblHome13.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        lblHome14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHome14.setForeground(new java.awt.Color(11, 60, 77));
        lblHome14.setText("Password:");

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        lblHome16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHome16.setForeground(new java.awt.Color(11, 60, 77));
        lblHome16.setText("Type:");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Not Selected--", "Admin", "Nurse" }));
        cmbType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbTypeMouseClicked(evt);
            }
        });

        lblErrorUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorUsername.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorUsername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/error (1).png"))); // NOI18N
        lblErrorUsername.setText("Error!");

        lblErrorPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorPassword.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/error (1).png"))); // NOI18N
        lblErrorPassword.setText("Error!");

        lblErrorType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblErrorType.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/error (1).png"))); // NOI18N
        lblErrorType.setText("Error!");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(11, 60, 77));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 60, 77)));
        btnLogin.setContentAreaFilled(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(11, 60, 77));
        btnRegister.setText("Register");
        btnRegister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(11, 60, 77)));
        btnRegister.setContentAreaFilled(false);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        btnRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegisterKeyPressed(evt);
            }
        });

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/close.png"))); // NOI18N
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHome14, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHome13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblErrorUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHome16, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblErrorType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblErrorPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(lblMainHeading1)))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblClose)
                .addGap(13, 13, 13)
                .addComponent(lblMainHeading1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHome13)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHome14)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(lblErrorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHome16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorType)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        clearError();
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        clearError();
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        clearError();
        if (txtUsername.getText().equals("")) {
            lblErrorUsername.setText("Cannot be null!");
            lblErrorUsername.setVisible(true);
        } else if (txtPassword.getText().equals("")) {
            lblErrorPassword.setText("Cannot be null!");
            lblErrorPassword.setVisible(true);
        } else if (txtPassword.getText().length() < 10) {
            lblErrorPassword.setText("Incorrect Password!");
            lblErrorPassword.setVisible(true);
        } else if (cmbType.getSelectedIndex() == 0) {
            lblErrorType.setText("Make a selection!");
            lblErrorType.setVisible(true);
        } else {
            try {
                String type = "";
                if (cmbType.getSelectedIndex() == 1) {
                    type = "A";
                } else if (cmbType.getSelectedIndex() == 2) {
                    type = "N";
                }
                ResultSet rst = new LoginController().checkLogin(txtUsername.getText(), txtPassword.getText(), type);
                
                if (rst.next() & rst.getString(1).equals(txtUsername.getText()) & rst.getString(2).equals(txtPassword.getText()) & rst.getString(3).equals(type)) {
                    new LoginController().setLogin(rst.getInt(4), rst.getString(5), rst.getString(3));
                    if (type.equals("A")) {
                        new DashBoardView().setVisible(true);
                        this.setVisible(false);
                    } else if (type.equals("N")) {
                        new SchedulleCheckView().setVisible(true);
                        this.setVisible(false);
                    }
                    
                } else {
                    lblErrorType.setText("Wrong username or password!!");
                    lblErrorType.setVisible(true);
                    clearTextBoxes();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void clearError() {
        lblErrorUsername.setVisible(false);
        lblErrorPassword.setVisible(false);
        lblErrorType.setVisible(false);
    }

    private void clearTextBoxes() {
        txtPassword.setText("");
        txtUsername.setText("");
        cmbType.setSelectedIndex(0);
    }

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginKeyPressed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        new UserRegistration().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegisterKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterKeyPressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void cmbTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbTypeMouseClicked
        // TODO add your handling code here:
        clearError();
    }//GEN-LAST:event_cmbTypeMouseClicked

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorType;
    private javax.swing.JLabel lblErrorUsername;
    private javax.swing.JLabel lblHome13;
    private javax.swing.JLabel lblHome14;
    private javax.swing.JLabel lblHome16;
    private javax.swing.JLabel lblMainHeading;
    private javax.swing.JLabel lblMainHeading1;
    private javax.swing.JLabel lblUseranme1;
    private javax.swing.JLabel lblUseranme2;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}