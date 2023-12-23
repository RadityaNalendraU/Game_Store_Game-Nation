/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tugas_besar;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.Component;


/**
 *
 * @author radit
 */
public class frm_user_library extends javax.swing.JFrame {
    koneksi dbsetting;
    String driver,database,user,pass;
    Object tabel;
    /**
     * Creates new form frm_user_library
     */
    
    public frm_user_library() {
        initComponents();
        email2.setText(frm_user_utama.email2);
        
        dbsetting = new koneksi();
        driver = dbsetting.SettingPanel("DBDriver");
        database = dbsetting.SettingPanel("DBDatabase");
        user = dbsetting.SettingPanel("DBUsername");
        pass = dbsetting.SettingPanel("DBPassword");
 
        tabel_user.setModel(tableModel);
        settableload();
        
        
        tabel_user.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 12));
        tabel_user.getTableHeader().setOpaque(false);
        tabel_user.getTableHeader().setBackground(new Color(43,43,48));
        tabel_user.getTableHeader().setForeground(new Color(239,239,239));
        
        btn_libraries.setEnabled(false);
        
    }
    private javax.swing.table.DefaultTableModel tableModel = getDefaultTableModel();
    private javax.swing.table.DefaultTableModel getDefaultTableModel() {
        return new javax.swing.table.DefaultTableModel (new Object[] [] {}, new String [] {"ID", "Nama Game", "Developer", "Genre"}) 
        {
            boolean[] canEdit = new boolean[] {
                false, false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
         };
     }
   String data[] = new String[5];
    private void settableload() {
        
        
        
        String stat = "";
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();
            String SQL = "select * from `"+ email2.getText() +"`";
            ResultSet res = stt.executeQuery(SQL);
            while(res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                tableModel.addRow(data);
                
                DefaultTableCellRenderer centerRenderer = new CenterTableCellRenderer();
                for (int i = 0; i < tabel_user.getColumnCount(); i++) {
                tabel_user.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
}

                
            }
            res.close();
            stt.close();
            kon.close();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            
            System.exit(0);}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btn_home = new tugas_besar.U_FButton1();
        btn_libraries = new tugas_besar.U_FButton1();
        btn_logOut = new tugas_besar.U_FButton1();
        profile = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        btn_searchGame = new tugas_besar.U_FButton2();
        btn_deleteGame = new tugas_besar.U_FButton4();
        txt_searchGame = new tugas_besar.FextField_user();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_user = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(44, 47, 51));

        header.setBackground(new java.awt.Color(80, 113, 229));

        btn_home.setForeground(new java.awt.Color(239, 239, 239));
        btn_home.setText("Home");
        btn_home.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        btn_home.setName(""); // NOI18N
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_libraries.setText("My Libraries");
        btn_libraries.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        btn_libraries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_librariesActionPerformed(evt);
            }
        });

        btn_logOut.setForeground(new java.awt.Color(239, 239, 239));
        btn_logOut.setText("Log Out");
        btn_logOut.setFont(new java.awt.Font("Trebuchet MS", 1, 26)); // NOI18N
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tugas_besar/icons8-user-48.png"))); // NOI18N

        email2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        email2.setForeground(new java.awt.Color(239, 239, 239));
        email2.setText("email2");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(profile))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn_libraries, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_libraries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btn_searchGame.setBackground(new java.awt.Color(80, 113, 229));
        btn_searchGame.setText("Search");
        btn_searchGame.setFillClick(new java.awt.Color(80, 90, 229));
        btn_searchGame.setFillOriginal(new java.awt.Color(80, 113, 229));
        btn_searchGame.setFillOver(new java.awt.Color(80, 113, 229));
        btn_searchGame.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btn_searchGame.setLineOriginal(new java.awt.Color(80, 113, 229));
        btn_searchGame.setLineOver(new java.awt.Color(80, 90, 229));
        btn_searchGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchGameActionPerformed(evt);
            }
        });

        btn_deleteGame.setText("Delete");
        btn_deleteGame.setFillClick(new java.awt.Color(238, 50, 83));
        btn_deleteGame.setFillOver(new java.awt.Color(238, 75, 83));
        btn_deleteGame.setLineOver(new java.awt.Color(238, 75, 83));
        btn_deleteGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteGameActionPerformed(evt);
            }
        });

        txt_searchGame.setForeground(new java.awt.Color(204, 204, 204));
        txt_searchGame.setText("Search");
        txt_searchGame.setCaretColor(new java.awt.Color(239, 239, 239));
        txt_searchGame.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_searchGame.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_searchGameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_searchGameFocusLost(evt);
            }
        });

        tabel_user.setBackground(new java.awt.Color(72, 72, 72));
        tabel_user.setForeground(new java.awt.Color(239, 239, 239));
        tabel_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabel_user.setRowHeight(30);
        jScrollPane1.setViewportView(tabel_user);

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1061, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(txt_searchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_searchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_deleteGame, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_searchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchGame, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_deleteGame, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // TODO add your handling code here:
        frm_user_utama user = new frm_user_utama();
        user.email.setText(email2.getText());
        user.setVisible(true);


        //menghilangkan form utama
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_librariesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_librariesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_librariesActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        // TODO add your handling code here:
        frm_login log = new frm_login();
        log.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void btn_searchGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchGameActionPerformed
        // TODO add your handling code here:
        tableModel.setRowCount(0);
        String cari = txt_searchGame.getText();
        
        if(cari.isEmpty() ) {
            tableModel.setRowCount(0);
            settableload();
        }
        else {
            try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();
            String SQL = "select * from `"+ email2.getText() +"` where NamaGame LIKE '%" + txt_searchGame.getText() + "%' OR ID LIKE '%" 
                         + txt_searchGame.getText() + "%' OR Developer LIKE '%" + txt_searchGame.getText() 
                         + "%' OR Genre LIKE '%" + txt_searchGame.getText() + "%'  ";

            ResultSet res = stt.executeQuery(SQL);
            while(res.next()) {
                data[0] = res.getString(1);
                data[1] = res.getString(2);
                data[2] = res.getString(3);
                data[3] = res.getString(4);
                tableModel.addRow(data);
            }
            res.close();
            stt.close();
            kon.close();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
      }
    }//GEN-LAST:event_btn_searchGameActionPerformed

    private void btn_deleteGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteGameActionPerformed
        // TODO add your handling code here:
        int row = tabel_user.getSelectedRow();
        try {
            Class.forName(driver);
            Connection kon = DriverManager.getConnection(database, user, pass);
            Statement stt = kon.createStatement();
            String SQL = "DELETE From `"+ email2.getText() +"`" 
                            + "Where "
                        + "ID='"+tableModel.getValueAt(row, 0).toString()+"'";
            stt.executeUpdate(SQL);
            tableModel.removeRow(row);
            JOptionPane.showMessageDialog(this, "Game Berhasil Dihapus");
            stt.close();
            kon.close();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_deleteGameActionPerformed

    private void txt_searchGameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchGameFocusGained
        // TODO add your handling code here:
        if(txt_searchGame.getText().equals("Search")) {
            txt_searchGame.setText("");
            txt_searchGame.setForeground(new Color(239,239,239));}
    }//GEN-LAST:event_txt_searchGameFocusGained

    private void txt_searchGameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_searchGameFocusLost
        // TODO add your handling code here:
        if(txt_searchGame.getText().equals("")) {
            txt_searchGame.setText("");
            txt_searchGame.setForeground(new Color(239,239,239));
        }
    }//GEN-LAST:event_txt_searchGameFocusLost

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
            java.util.logging.Logger.getLogger(frm_user_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_user_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_user_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_user_library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_user_library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private tugas_besar.U_FButton4 btn_deleteGame;
    private tugas_besar.U_FButton1 btn_home;
    private tugas_besar.U_FButton1 btn_libraries;
    private tugas_besar.U_FButton1 btn_logOut;
    private tugas_besar.U_FButton2 btn_searchGame;
    public javax.swing.JLabel email2;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel profile;
    private javax.swing.JTable tabel_user;
    private tugas_besar.FextField_user txt_searchGame;
    // End of variables declaration//GEN-END:variables
}
