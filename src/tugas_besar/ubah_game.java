/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_besar;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author Salman Faris A
 */
public class ubah_game extends javax.swing.JFrame {

    koneksi dbsetting;
    String driver,database,user,pass;
    Object tabel;
    
    public ubah_game() {
        initComponents();
        
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");    
    }
    
    private javax.swing.table.DefaultTableModel tableModel = getDefaultTableModel();
    private javax.swing.table.DefaultTableModel getDefaultTableModel() {
        return new javax.swing.table.DefaultTableModel (new Object[] [] {}, new String [] {"ID", "Nama Game", "Developer", "Genre", "Harga"}) 
        {
            boolean[] canEdit = new boolean[] {
                false, false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    

    public void membersihkan_teks() {
        txt_id.setText("");
        txt_nama_game.setText("");
        txt_developer.setText("");
        txt_genre.setText("");
        txt_harga.setText("");
    }   
    
    
 
    /**
     * Creates new form ubah_game
     */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        btn_reset = new tugas_besar.G_FButton_1();
        btn_submit = new tugas_besar.G_FButton_0();
        jPanel10 = new javax.swing.JPanel();
        transaksi = new tugas_besar.G_FButton_2();
        data = new tugas_besar.G_FButton_2();
        index = new tugas_besar.G_FButton_2();
        logout = new tugas_besar.G_FButton_2();
        txt_id = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        txt_nama_game = new javax.swing.JTextField();
        nama_game = new javax.swing.JLabel();
        txt_genre = new javax.swing.JTextField();
        harga = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        genre1 = new javax.swing.JLabel();
        txt_developer = new javax.swing.JTextField();
        developer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(44, 47, 51));

        btn_reset.setText("Reset");
        btn_reset.setFillOriginal(new java.awt.Color(238, 75, 3));
        btn_reset.setFillOver(new java.awt.Color(238, 50, 3));
        btn_reset.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.setToolTipText("");
        btn_submit.setFillClick(new java.awt.Color(80, 80, 229));
        btn_submit.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        jPanel10.setBackground(new java.awt.Color(80, 113, 229));

        transaksi.setText("Transaction");
        transaksi.setFillClick(new java.awt.Color(80, 80, 229));
        transaksi.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });

        data.setText("Data");
        data.setFillClick(new java.awt.Color(80, 80, 229));
        data.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataActionPerformed(evt);
            }
        });

        index.setText("Index");
        index.setFillClick(new java.awt.Color(80, 80, 229));
        index.setFocusable(false);
        index.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        index.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indexActionPerformed(evt);
            }
        });

        logout.setText("Log Out");
        logout.setFillClick(new java.awt.Color(80, 80, 229));
        logout.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(index, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txt_id.setBackground(new java.awt.Color(72, 72, 72));
        txt_id.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_id.setCaretColor(new java.awt.Color(239, 239, 239));

        ID.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setText("ID");

        txt_nama_game.setBackground(new java.awt.Color(72, 72, 72));
        txt_nama_game.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txt_nama_game.setForeground(new java.awt.Color(255, 255, 255));
        txt_nama_game.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_nama_game.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_nama_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_gameActionPerformed(evt);
            }
        });

        nama_game.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        nama_game.setForeground(new java.awt.Color(255, 255, 255));
        nama_game.setText("Game Name");

        txt_genre.setBackground(new java.awt.Color(72, 72, 72));
        txt_genre.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txt_genre.setForeground(new java.awt.Color(255, 255, 255));
        txt_genre.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_genre.setCaretColor(new java.awt.Color(239, 239, 239));

        harga.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        harga.setForeground(new java.awt.Color(255, 255, 255));
        harga.setText("Price");
        harga.setToolTipText("");

        txt_harga.setBackground(new java.awt.Color(72, 72, 72));
        txt_harga.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txt_harga.setForeground(new java.awt.Color(255, 255, 255));
        txt_harga.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_harga.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        genre1.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        genre1.setForeground(new java.awt.Color(255, 255, 255));
        genre1.setText("Genre");
        genre1.setToolTipText("");

        txt_developer.setBackground(new java.awt.Color(72, 72, 72));
        txt_developer.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        txt_developer.setForeground(new java.awt.Color(255, 255, 255));
        txt_developer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txt_developer.setCaretColor(new java.awt.Color(239, 239, 239));

        developer.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        developer.setForeground(new java.awt.Color(255, 255, 255));
        developer.setText("Developer");
        developer.setToolTipText("");

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nama_game, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nama_game)
                            .addComponent(txt_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(developer))
                        .addGap(144, 144, 144)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harga)
                            .addComponent(genre1)
                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(298, 298, 298))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(ID)
                .addGap(4, 4, 4)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_game, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genre1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama_game, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_genre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(developer, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_developer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 1279, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        membersihkan_teks();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        String id = txt_id.getText();
        String nama = txt_nama_game.getText();
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
                Statement stt = kon.createStatement();
                String SQL = "UPDATE `game`" 
                            + "SET `ID`='"+id+"',"
                            + "`Nama`='"+nama+"',"
                            + "`Developer`='"+developer+"',"
                            + "`Genre`='"+genre+"',"
                            + "`Harga`='"+harga+"'"
                            + "WHERE "
                            + "`ID`='"+id+"';";

                data[0]=txt_id.getText();
                data[1]=txt_nama_game.getText();
                data[2]=txt_developer.getText();
                data[3]=txt_genre.getText();
                data[4]=txt_harga.getText();
                if(stt.executeUpdate(SQL) > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                }
                else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Diubah");
                }

                stt.close();
                kon.close();
                
                daftar_game game = new daftar_game();
                game.setVisible(true);
                
                this.setVisible(false);
            }
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        transaction_frm trans = new transaction_frm();
        trans.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_transaksiActionPerformed

    private void indexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indexActionPerformed
        // TODO add your handling code here:
        daftar_game game = new daftar_game();
        game.setVisible(true);

        this.setVisible(false);
    }//GEN-LAST:event_indexActionPerformed

    private void txt_nama_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_gameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_gameActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        frm_login_admin admin = new frm_login_admin();
        admin.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataActionPerformed
        // TODO add your handling code here:
        frm_select_data data = new frm_select_data();
        data.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_dataActionPerformed

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
            java.util.logging.Logger.getLogger(ubah_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ubah_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ubah_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ubah_game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ubah_game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ID;
    private tugas_besar.G_FButton_1 btn_reset;
    private tugas_besar.G_FButton_0 btn_submit;
    private tugas_besar.G_FButton_2 data;
    private javax.swing.JLabel developer;
    private javax.swing.JLabel genre1;
    private javax.swing.JLabel harga;
    private tugas_besar.G_FButton_2 index;
    private javax.swing.JPanel jPanel10;
    private tugas_besar.G_FButton_2 logout;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel nama_game;
    private tugas_besar.G_FButton_2 transaksi;
    public javax.swing.JTextField txt_developer;
    public javax.swing.JTextField txt_genre;
    public javax.swing.JTextField txt_harga;
    public javax.swing.JTextField txt_id;
    public javax.swing.JTextField txt_nama_game;
    // End of variables declaration//GEN-END:variables
}