/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentresultmanagementportal;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class adminIndex extends javax.swing.JFrame {

    /**
     * Creates new form adminIndex
     */
    public adminIndex() {
        initComponents();
        icon();
    }
    private void icon(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("rms_logo.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        ShowPasswordCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1539, 845));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UsernameLabel.setBackground(new java.awt.Color(0, 0, 0));
        UsernameLabel.setFont(new java.awt.Font("Palatino Linotype", 3, 30)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("Username :");
        getContentPane().add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 160, 50));

        PasswordLabel.setFont(new java.awt.Font("Palatino Linotype", 3, 30)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password :");
        PasswordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, 160, 50));

        UsernameTextField.setFont(new java.awt.Font("Cambria", 2, 20)); // NOI18N
        UsernameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UsernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, 250, 40));

        PasswordTextField.setFont(new java.awt.Font("Cambria", 2, 20)); // NOI18N
        PasswordTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, 250, 40));

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 150, 50));

        BackButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 150, 50));

        ShowPasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        ShowPasswordCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        ShowPasswordCheckBox.setText("Show Password");
        ShowPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordCheckBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 440, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentresultmanagementportal/BGM_teal_new.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1640, 870));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTextFieldActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String username = UsernameTextField.getText();
        String password = PasswordTextField.getText();
        if (username.equals("root") && password.equals("12345")){
            setVisible(false);
            new courses().setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Username or Password is Incorrect");
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
        
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ShowPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordCheckBoxActionPerformed
        // TODO add your handling code here:
        if (ShowPasswordCheckBox.isSelected()){
            PasswordTextField.setEchoChar((char)0);
        }
        else{
            PasswordTextField.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordCheckBoxActionPerformed

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
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JCheckBox ShowPasswordCheckBox;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
