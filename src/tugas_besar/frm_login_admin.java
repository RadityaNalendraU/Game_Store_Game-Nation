/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_besar;

/**
 *
 * @author radit
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.*;
public class frm_login_admin extends javax.swing.JFrame {
    koneksi dbsetting;
    String driver,database,user,pass;
    Statement stat;
    
   
    public frm_login_admin() {
        initComponents();
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_password_admin = new javax.swing.JPasswordField();
        txt_email_admin = new javax.swing.JTextField();
        btn_login = new tugas_besar.U_FButton1();
        admin_gambar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("admin_login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));
        jPanel1.setForeground(new java.awt.Color(239, 239, 239));

        jPanel2.setBackground(new java.awt.Color(80, 113, 229));

        jLabel1.setBackground(new java.awt.Color(18, 18, 18));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(239, 239, 239));
        jLabel1.setText("Sign In With Admin Account");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(18, 18, 18));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(239, 239, 239));
        jLabel3.setText("Email");

        jLabel4.setBackground(new java.awt.Color(18, 18, 18));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        txt_password_admin.setBackground(new java.awt.Color(72, 72, 72));
        txt_password_admin.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        txt_password_admin.setForeground(new java.awt.Color(255, 255, 255));
        txt_password_admin.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_password_admin.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_password_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password_adminActionPerformed(evt);
            }
        });

        txt_email_admin.setBackground(new java.awt.Color(72, 72, 72));
        txt_email_admin.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        txt_email_admin.setForeground(new java.awt.Color(239, 239, 239));
        txt_email_admin.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_email_admin.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_email_admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_email_adminActionPerformed(evt);
            }
        });

        btn_login.setForeground(new java.awt.Color(239, 239, 239));
        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password_admin)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email_admin)
                    .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_password_admin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        admin_gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas_besar/Samurai.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(admin_gambar)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(admin_gambar)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_password_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password_adminActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        frm_utama utama = new frm_utama();
        utama.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void txt_email_adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_email_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_email_adminActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();
            if((txt_email_admin.getText().isEmpty()) || (txt_password_admin.getText().isEmpty())){
                JOptionPane.showMessageDialog(null, "Email Atau Password Tidak Boleh Kosong");
            }
            else{
            String SQL = "SELECT * FROM admin_data WHERE "
            + "email='"+txt_email_admin.getText()+
            "' AND password='"+txt_password_admin.getText()+"'";
            ResultSet res = stt.executeQuery(SQL);

            if(res.next()){
                if(txt_email_admin.getText().equals(res.getString("email")) && txt_password_admin.getText().equals(res.getString("password"))){
                    
                    daftar_game game = new daftar_game();
                    game.setVisible(true);
                    
                    this.setVisible(false);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "email atau password salah");
            }
            kon.close();
            res.close();
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(frm_login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_login_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_login_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin_gambar;
    private tugas_besar.U_FButton1 btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_email_admin;
    private javax.swing.JPasswordField txt_password_admin;
    // End of variables declaration//GEN-END:variables
}
