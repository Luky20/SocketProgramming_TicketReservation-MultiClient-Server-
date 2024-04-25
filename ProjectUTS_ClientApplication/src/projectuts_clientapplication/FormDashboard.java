/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuts_clientapplication;

import java.io.*;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

/**
 *
 * @author Luky
 */
public class FormDashboard extends javax.swing.JFrame {

    FormSignIn form;
    public FormDashboard() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelKiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelLine = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        button_home = new javax.swing.JLabel();
        button_home1 = new javax.swing.JLabel();
        panelKanan = new javax.swing.JPanel();
        panelNavbar = new keeptoo.KGradientPanel();
        panelDasar = new javax.swing.JPanel();
        panelUtama = new javax.swing.JPanel();
        panelUtama1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnPlaneTickets = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnTrainTickets = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnShip = new javax.swing.JButton();
        btnCar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelKiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        panelLine.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLineLayout = new javax.swing.GroupLayout(panelLine);
        panelLine.setLayout(panelLineLayout);
        panelLineLayout.setHorizontalGroup(
            panelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelLineLayout.setVerticalGroup(
            panelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(68, 160, 141));
        kGradientPanel1.setkStartColor(new java.awt.Color(9, 54, 55));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        jLabel2.setText("Book n Go");

        button_home.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Home Icon.png"))); // NOI18N
        button_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_homeMouseExited(evt);
            }
        });

        button_home1.setBackground(new java.awt.Color(255, 255, 255));
        button_home1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        button_home1.setForeground(new java.awt.Color(255, 255, 255));
        button_home1.setText("Home");
        button_home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_home1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_home1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(button_home, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_home1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_home, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_home1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1032, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelKiriLayout = new javax.swing.GroupLayout(panelKiri);
        panelKiri.setLayout(panelKiriLayout);
        panelKiriLayout.setHorizontalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKiriLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelKiriLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)))
                .addGap(26, 26, 26))
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelKiriLayout.setVerticalGroup(
            panelKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKiriLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(122, 122, 122)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelKiri, java.awt.BorderLayout.LINE_START);

        panelKanan.setBackground(new java.awt.Color(204, 204, 255));
        panelKanan.setLayout(new java.awt.BorderLayout());

        panelNavbar.setkEndColor(new java.awt.Color(68, 160, 141));
        panelNavbar.setkStartColor(new java.awt.Color(9, 54, 55));

        javax.swing.GroupLayout panelNavbarLayout = new javax.swing.GroupLayout(panelNavbar);
        panelNavbar.setLayout(panelNavbarLayout);
        panelNavbarLayout.setHorizontalGroup(
            panelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1415, Short.MAX_VALUE)
        );
        panelNavbarLayout.setVerticalGroup(
            panelNavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        panelKanan.add(panelNavbar, java.awt.BorderLayout.PAGE_START);

        panelDasar.setBackground(new java.awt.Color(250, 250, 250));
        panelDasar.setPreferredSize(new java.awt.Dimension(800, 1032));

        panelUtama.setBackground(new java.awt.Color(255, 255, 255));

        panelUtama1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Please select your service");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Hello!");

        btnPlaneTickets.setBackground(new java.awt.Color(0, 51, 51));
        btnPlaneTickets.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPlaneTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaneTickets.setText("Plane");
        btnPlaneTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaneTicketsActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 204, 0));
        jLabel8.setForeground(new java.awt.Color(102, 204, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/ship.png"))); // NOI18N

        btnTrainTickets.setBackground(new java.awt.Color(0, 51, 51));
        btnTrainTickets.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTrainTickets.setForeground(new java.awt.Color(255, 255, 255));
        btnTrainTickets.setText("Train");
        btnTrainTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainTicketsActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 204, 0));
        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Desain tanpa judul - 2024-04-05T145445.143.png"))); // NOI18N

        jLabel10.setBackground(new java.awt.Color(0, 204, 0));
        jLabel10.setForeground(new java.awt.Color(102, 204, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/train.png"))); // NOI18N

        jLabel11.setBackground(new java.awt.Color(0, 204, 0));
        jLabel11.setForeground(new java.awt.Color(102, 204, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/car.png"))); // NOI18N
        jLabel11.setToolTipText("");

        btnShip.setBackground(new java.awt.Color(0, 51, 51));
        btnShip.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnShip.setForeground(new java.awt.Color(255, 255, 255));
        btnShip.setText("Ship");
        btnShip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShipActionPerformed(evt);
            }
        });

        btnCar.setBackground(new java.awt.Color(0, 51, 51));
        btnCar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCar.setForeground(new java.awt.Color(255, 255, 255));
        btnCar.setText("Car");
        btnCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUtama1Layout = new javax.swing.GroupLayout(panelUtama1);
        panelUtama1.setLayout(panelUtama1Layout);
        panelUtama1Layout.setHorizontalGroup(
            panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtama1Layout.createSequentialGroup()
                .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlaneTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelUtama1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnShip, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnTrainTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtama1Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)))
                            .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(315, 315, 315))
                    .addGroup(panelUtama1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(panelUtama1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(1250, Short.MAX_VALUE)))
        );
        panelUtama1Layout.setVerticalGroup(
            panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtama1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtama1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlaneTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUtama1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTrainTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShip, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(panelUtama1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelUtama1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel7)
                    .addContainerGap(672, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelUtama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUtama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelDasarLayout = new javax.swing.GroupLayout(panelDasar);
        panelDasar.setLayout(panelDasarLayout);
        panelDasarLayout.setHorizontalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDasarLayout.setVerticalGroup(
            panelDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelUtama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(600, Short.MAX_VALUE))
        );

        panelKanan.add(panelDasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelKanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_homeMouseExited
        panelMain.setBackground(new Color(255,255,255));
        panelLine.setBackground(new Color(255,255,255));       // TODO add your handling code here:
    }//GEN-LAST:event_button_homeMouseExited

    private void button_homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_homeMouseEntered
        panelMain.setBackground(new Color(250,250,250));
        panelLine.setBackground(new Color(1, 121, 111));
    }//GEN-LAST:event_button_homeMouseEntered

    private void btnPlaneTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaneTicketsActionPerformed
        FormCariTiketPesawat form = new FormCariTiketPesawat();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnPlaneTicketsActionPerformed

    private void btnTrainTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainTicketsActionPerformed
        FormCariTiketKereta form = new FormCariTiketKereta();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnTrainTicketsActionPerformed

    private void button_home1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_home1MouseEntered
        
    }//GEN-LAST:event_button_home1MouseEntered

    private void button_home1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_home1MouseExited
        
    }//GEN-LAST:event_button_home1MouseExited

    private void btnShipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShipActionPerformed
        FormCariTiketKapal form = new FormCariTiketKapal();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnShipActionPerformed

    private void btnCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarActionPerformed
        FormCariTiketMobil form = new FormCariTiketMobil();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FormDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDashboard().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCar;
    private javax.swing.JButton btnPlaneTickets;
    private javax.swing.JButton btnShip;
    private javax.swing.JButton btnTrainTickets;
    private javax.swing.JLabel button_home;
    private javax.swing.JLabel button_home1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel panelDasar;
    private javax.swing.JPanel panelKanan;
    private javax.swing.JPanel panelKiri;
    private javax.swing.JPanel panelLine;
    private javax.swing.JPanel panelMain;
    private keeptoo.KGradientPanel panelNavbar;
    private javax.swing.JPanel panelUtama;
    private javax.swing.JPanel panelUtama1;
    // End of variables declaration//GEN-END:variables
}
