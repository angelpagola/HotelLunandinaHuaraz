/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;


/**
 *
 * @author PAUCAR
 */
public class PantallaCarga extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCarga
     */    
    public static LoginAcceso la = new LoginAcceso();
    public static int x = 0;
    
    public PantallaCarga() {
        initComponents();
        this.setLocationRelativeTo(null);
        barraProgreso.setForeground(new Color(248,177,57));
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
        logo = new javax.swing.JLabel();
        lbProgreso = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(13, 39, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lunandina/logoOriginal.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 130));

        lbProgreso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbProgreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProgreso.setText("jLabel2");
        jPanel1.add(lbProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 230, 100, 30));

        barraProgreso.setBackground(new java.awt.Color(13, 39, 70));
        barraProgreso.setForeground(new java.awt.Color(248, 177, 57));
        jPanel1.add(barraProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 430, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 300));

        setBounds(0, 0, 466, 339);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCarga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        PantallaCarga load=new PantallaCarga();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                load.setVisible(true);
            }
        });
        try {
            while(x <= 100){ //suma de 5 en 5
                Thread.sleep(40);
                load.lbProgreso.setText(x + " %");
                load.barraProgreso.setValue(x);
                x+=5;
            };
            /* //suma de 1 en 1
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                load.lbProgreso.setText(i + " %");
                load.barraProgreso.setValue(i);
            }
            */
        } catch (Exception e) {
        }
        //l.setVisible(false);
        la.setVisible(true);
        load.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar barraProgreso;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbProgreso;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
