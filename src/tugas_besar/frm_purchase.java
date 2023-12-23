/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_besar;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author radit
 */
public class frm_purchase extends javax.swing.JFrame {
    koneksi dbsetting;
    String driver,database,user,pass;
    Statement stat;
    /**
     * Creates new form frm_purchase
     */
    
    public frm_purchase() {
        initComponents();
        
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
        txt_id.setEditable(false);
        txt_developer.setEditable(false);
        txt_game.setEditable(false);
        txt_genre.setEditable(false);
        txt_harga.setEditable(false);
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
        email3 = new javax.swing.JLabel();
        txt_user_mail = new javax.swing.JTextField();
        txt_developer = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_genre = new javax.swing.JTextField();
        txt_game = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fButton21 = new tugas_besar.U_FButton2();
        fButton41 = new tugas_besar.U_FButton4();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 47, 51));

        jPanel2.setBackground(new java.awt.Color(80, 113, 229));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas_besar/icons8-user-48.png"))); // NOI18N

        email3.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        email3.setForeground(new java.awt.Color(239, 239, 239));
        email3.setText("Email");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(email3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(email3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        txt_user_mail.setBackground(new java.awt.Color(72, 72, 72));
        txt_user_mail.setForeground(new java.awt.Color(239, 239, 239));
        txt_user_mail.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_user_mail.setCaretColor(new java.awt.Color(239, 239, 239));

        txt_developer.setBackground(new java.awt.Color(72, 72, 72));
        txt_developer.setForeground(new java.awt.Color(239, 239, 239));
        txt_developer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_developer.setCaretColor(new java.awt.Color(239, 239, 239));

        txt_harga.setBackground(new java.awt.Color(72, 72, 72));
        txt_harga.setForeground(new java.awt.Color(239, 239, 239));
        txt_harga.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_harga.setCaretColor(new java.awt.Color(239, 239, 239));

        txt_genre.setBackground(new java.awt.Color(72, 72, 72));
        txt_genre.setForeground(new java.awt.Color(239, 239, 239));
        txt_genre.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_genre.setCaretColor(new java.awt.Color(239, 239, 239));

        txt_game.setBackground(new java.awt.Color(72, 72, 72));
        txt_game.setForeground(new java.awt.Color(239, 239, 239));
        txt_game.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_game.setCaretColor(new java.awt.Color(239, 239, 239));

        txt_id.setBackground(new java.awt.Color(72, 72, 72));
        txt_id.setForeground(new java.awt.Color(239, 239, 239));
        txt_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_id.setCaretColor(new java.awt.Color(239, 239, 239));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(239, 239, 239));
        jLabel2.setText("Genre");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 239, 239));
        jLabel4.setText("Email User");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(239, 239, 239));
        jLabel5.setText("Developer");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(239, 239, 239));
        jLabel6.setText("ID Game");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(239, 239, 239));
        jLabel7.setText("Nama Game");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(239, 239, 239));
        jLabel8.setText("Harga");

        fButton21.setBackground(new java.awt.Color(80, 113, 229));
        fButton21.setText("Purchase");
        fButton21.setFillClick(new java.awt.Color(80, 80, 229));
        fButton21.setFillOver(new java.awt.Color(83, 95, 238));
        fButton21.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        fButton21.setLineOver(new java.awt.Color(83, 95, 238));
        fButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton21ActionPerformed(evt);
            }
        });

        fButton41.setForeground(new java.awt.Color(239, 239, 239));
        fButton41.setText("Back");
        fButton41.setFillClick(new java.awt.Color(238, 50, 83));
        fButton41.setFillOver(new java.awt.Color(238, 75, 83));
        fButton41.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        fButton41.setLineOver(new java.awt.Color(238, 75, 83));
        fButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_user_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_game, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(fButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(fButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_game, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton21ActionPerformed
        // TODO add your handling code here:
        
        
        String id = txt_id.getText();
        String nama = txt_game.getText();
        String developer = txt_developer.getText();
        String genre = txt_genre.getText();
        String harga = txt_harga.getText();
        
        String data[] = new String[5];
        if((id.isEmpty()) | (nama.isEmpty())) {
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong, Silahkan Dilengkapi");
            txt_id.requestFocus();
        }
        else {
            try {
                Class.forName(driver);
                Connection kon = DriverManager.getConnection(database, user, pass);
                DatabaseMetaData metaData = kon.getMetaData();
                ResultSet tables = metaData.getTables(null, null,"`"+ txt_user_mail.getText()+ "`", null);
                
                if(tables.next()){
                
                Statement stt = kon.createStatement();
                String SQL = "INSERT INTO `"+ txt_user_mail.getText() 
                             +"` (`ID`, `NamaGame`, `Developer`, `Genre`) VALUES"
                             +" ('"+ id+"', '"+ nama+"', '"+ developer+"', '"+ genre+"'); ";

                
                data[0]=txt_id.getText();
                data[1]=txt_game.getText();
                data[2]=txt_developer.getText();
                data[3]=txt_genre.getText();
                data[4]=txt_harga.getText();
                
                if (stt.executeUpdate(SQL) > 0){
                    String SQL2= "INSERT INTO `transaction` (`ID`, `Nama`, `Genre`, `Developer` , `Harga`, `Waktu`) VALUES ('"+ id 
                                  +"', ' "+ nama +" ', ' "+ genre +" ', ' "+ developer +" ', ' "+ harga +" ', NOW());";
                    
                    
                    if(stt.executeUpdate(SQL2) > 0){
                        JOptionPane.showMessageDialog(this, "Transaksi Berhasil");
                        
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Transaksi Gagal");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "Transaksi Gagal");
                }
                
                stt.close();
                kon.close();
                
                
                
                this.setVisible(false);
             }
                else{
                    JOptionPane.showMessageDialog(this, "User " + txt_user_mail.getText() + " Tidak Ditemukan");
                }
            }
            catch (SQLException ex) {
                if (ex.getErrorCode()== 1062  ){
                    JOptionPane.showMessageDialog(this, "Anda Sudah Mempunyai Game Ini");}
                else{
                    JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frm_purchase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_fButton21ActionPerformed

    private void fButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton41ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_fButton41ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_purchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel email3;
    private tugas_besar.U_FButton2 fButton21;
    private tugas_besar.U_FButton4 fButton41;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txt_developer;
    public javax.swing.JTextField txt_game;
    public javax.swing.JTextField txt_genre;
    public javax.swing.JTextField txt_harga;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_user_mail;
    // End of variables declaration//GEN-END:variables
}