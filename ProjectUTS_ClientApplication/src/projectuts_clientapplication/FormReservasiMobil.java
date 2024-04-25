/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projectuts_clientapplication;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.ObjectInputStream;
/**
 *
 * @author Luky
 */
public class FormReservasiMobil extends javax.swing.JFrame {
    FormSignIn form;
    String[] commands;
    public FormReservasiMobil() throws IOException {
       try { 
            initComponents();
            form.msgToServer.writeBytes("AMBILTIKETMOBIL~" + "Tiket Mobil" + "~" +
                    "\n");
            String result; 
            result = form.msgFromServer.readLine();
            commands = result.split("~");
            if (commands[0].equals("KIRIMTIKET")){
                jTextArea1.append("ID: " + commands[1] + "\n");
                jTextArea1.append("Ticket's Name: " + commands[2] + "\n");
                jTextArea1.append("Ticket's Desc: " + commands[3] + "\n");
                jTextArea1.append("Ticket's Date: " + commands[4] + "\n");
                jTextArea1.append("Ticket's Price: " + commands[5] + "\n");
                jTextArea1.append("Created Date: " + commands[6] + "\n");
                jTextArea1.append("Updated Date: " + commands[7] + "\n");
                jTextArea1.append("Nama Mobil:  " + commands[8] + "\n");
                jTextArea1.append("Jenis Seater: " + commands[9] + "\n");
                
            }
            else {
                JOptionPane.showMessageDialog(this, "No Flights Available");
            }
            
        }
        catch (IOException ex) {
            Logger.getLogger(FormSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnReserve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnReserve.setBackground(new java.awt.Color(0, 51, 51));
        btnReserve.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReserve.setForeground(new java.awt.Color(255, 255, 255));
        btnReserve.setText("Reserve");
        btnReserve.setToolTipText("");
        btnReserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReserveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(btnReserve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReserve, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReserveActionPerformed
        try { 
            form.msgToServer.writeBytes("RESERVEMOBIL~" + commands[1] +"\n");
            String result; 
            result = form.msgFromServer.readLine();
            if (result.equals("TRUE")){
                 JOptionPane.showMessageDialog(this, "Reservation Success");
            }
            else {
                JOptionPane.showMessageDialog(this, "Reservation Failed");
            }
            
        }
        catch (IOException ex) {
            Logger.getLogger(FormSignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReserveActionPerformed

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
            java.util.logging.Logger.getLogger(FormReservasiMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormReservasiMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormReservasiMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormReservasiMobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormReservasiMobil().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FormReservasiMobil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReserve;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
