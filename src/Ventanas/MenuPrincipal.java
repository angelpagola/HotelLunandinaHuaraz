
package Ventanas;

import java.awt.Color;
import javax.swing.JOptionPane;
import Ventanas.*;

public class MenuPrincipal extends javax.swing.JFrame {
    
    /* Ventanas externas */
    DatosUsuario datosUsuario=new DatosUsuario();
    /* Ventanas externas */
    
    
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(6);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnLogOut = new javax.swing.JPanel();
        lbLogOut = new javax.swing.JLabel();
        pnReportes = new javax.swing.JPanel();
        lbReporte = new javax.swing.JLabel();
        pnAdministracion = new javax.swing.JPanel();
        lbadministracion = new javax.swing.JLabel();
        pnServicios = new javax.swing.JPanel();
        lbServicio = new javax.swing.JLabel();
        pnReserva = new javax.swing.JPanel();
        lbReserva = new javax.swing.JLabel();
        pnAlojamiento = new javax.swing.JPanel();
        lbAlojamiento = new javax.swing.JLabel();
        panelEventos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btValidar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelImagenes = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBackground(new java.awt.Color(13, 39, 70));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lunandina/Recurso 3.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 46));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 46));

        pnLogOut.setBackground(new java.awt.Color(13, 39, 70));
        pnLogOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogOut.setBackground(new java.awt.Color(13, 39, 70));
        lbLogOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/userLog_Y.png"))); // NOI18N
        lbLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogOutMouseExited(evt);
            }
        });
        pnLogOut.add(lbLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 76, 46));

        getContentPane().add(pnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, 76, 46));

        pnReportes.setBackground(new java.awt.Color(13, 39, 70));
        pnReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbReporte.setBackground(new java.awt.Color(13, 39, 70));
        lbReporte.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbReporte.setForeground(new java.awt.Color(255, 255, 255));
        lbReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReporte.setText("REPORTES");
        lbReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbReporteMouseExited(evt);
            }
        });
        pnReportes.add(lbReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 46));

        getContentPane().add(pnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 0, 125, 46));

        pnAdministracion.setBackground(new java.awt.Color(13, 39, 70));
        pnAdministracion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbadministracion.setBackground(new java.awt.Color(13, 39, 70));
        lbadministracion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbadministracion.setForeground(new java.awt.Color(255, 255, 255));
        lbadministracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbadministracion.setText("ADMINISTRACION");
        lbadministracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbadministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbadministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbadministracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbadministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbadministracionMouseExited(evt);
            }
        });
        pnAdministracion.add(lbadministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 46));

        getContentPane().add(pnAdministracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 150, 46));

        pnServicios.setBackground(new java.awt.Color(13, 39, 70));
        pnServicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbServicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbServicio.setForeground(new java.awt.Color(255, 255, 255));
        lbServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbServicio.setText("SERVICIOS");
        lbServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbServicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbServicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbServicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbServicioMouseExited(evt);
            }
        });
        pnServicios.add(lbServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 46));

        getContentPane().add(pnServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 125, 46));

        pnReserva.setBackground(new java.awt.Color(13, 39, 70));
        pnReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbReserva.setBackground(new java.awt.Color(153, 255, 153));
        lbReserva.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbReserva.setForeground(new java.awt.Color(255, 255, 255));
        lbReserva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReserva.setText("RESERVAS");
        lbReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbReservaMouseExited(evt);
            }
        });
        pnReserva.add(lbReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 46));

        getContentPane().add(pnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 0, 125, 46));

        pnAlojamiento.setBackground(new java.awt.Color(13, 39, 70));
        pnAlojamiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAlojamiento.setBackground(new java.awt.Color(13, 39, 70));
        lbAlojamiento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAlojamiento.setForeground(new java.awt.Color(255, 255, 255));
        lbAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAlojamiento.setText("ALOJAMIENTO");
        lbAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAlojamientoMouseExited(evt);
            }
        });
        pnAlojamiento.add(lbAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 46));

        getContentPane().add(pnAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 125, 46));

        panelEventos.setBackground(new java.awt.Color(248, 177, 57));
        panelEventos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(248, 177, 57));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 23, 23)), "Reservaciones para hoy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(23, 23, 23)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(23, 23, 23))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"31-01-1995", "Elver Galarva", "165"},
                {"20-12-2016", "Elsa Pato", "168"},
                {"25-10-2018", "Susana Oria", "169"},
                {"20-06-2008", "Alan Brito", "215"},
                {"20-13-2019", "Debora Meltrozo", "218"}
            },
            new String [] {
                "Fecha Reserva", "Nombre Cliente", "N° Habitacion"
            }
        ));
        tabla.setSelectionBackground(new java.awt.Color(0, 122, 255));
        jScrollPane1.setViewportView(tabla);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 490, 460));

        btValidar.setBackground(new java.awt.Color(0, 122, 255));
        btValidar.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        btValidar.setForeground(new java.awt.Color(255, 255, 255));
        btValidar.setText("Validar Alojamiento");
        btValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btValidarActionPerformed(evt);
            }
        });
        jPanel4.add(btValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 490, 40));

        panelEventos.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 522, 570));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(23, 23, 23));
        jLabel2.setText("MENÚ PRINCIPAL");
        panelEventos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        getContentPane().add(panelEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, 580, 730));

        panelImagenes.setBackground(new java.awt.Color(23, 23, 23));
        panelImagenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(248, 177, 57));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("IMAGENES Y ANIMACIONES AQUI");
        panelImagenes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 430, 120));

        getContentPane().add(panelImagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     /*LABEL DE ADMINISTRACION*/
    private void lbadministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbadministracionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbadministracionMouseClicked
    private void lbadministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbadministracionMouseEntered
        pnAdministracion.setBackground(new Color(248,177,57));
        lbadministracion.setForeground(new Color(23,23,23));
        lbadministracion.setFont(new java.awt.Font("Arial", 1, 14));
        lbadministracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbadministracionMouseEntered
    private void lbadministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbadministracionMouseExited
        pnAdministracion.setBackground(new Color(13, 39, 70));
        lbadministracion.setForeground(new Color(255,255,255));
        lbadministracion.setFont(new java.awt.Font("Arial", 0, 14));
        lbadministracion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbadministracionMouseExited

     /*LABEL DE ALOJAMIENTO*/
    private void lbAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAlojamientoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAlojamientoMouseClicked
    private void lbAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAlojamientoMouseEntered
        pnAlojamiento.setBackground(new Color(248,177,57));
        lbAlojamiento.setForeground(new Color(23,23,23));
        lbAlojamiento.setFont(new java.awt.Font("Arial", 1, 14));
        lbAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbAlojamientoMouseEntered
    private void lbAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAlojamientoMouseExited
        pnAlojamiento.setBackground(new Color(13, 39, 70));
        lbAlojamiento.setForeground(new Color(255,255,255));        
        lbAlojamiento.setFont(new java.awt.Font("Arial", 0, 14));
        lbAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbAlojamientoMouseExited

     /*LABEL DE RESERVA*/
    private void lbReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReservaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbReservaMouseClicked
    private void lbReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReservaMouseEntered
        pnReserva.setBackground(new Color(248,177,57));
        lbReserva.setForeground(new Color(23,23,23));
        lbReserva.setFont(new java.awt.Font("Arial", 1, 14));
        lbReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbReservaMouseEntered
    private void lbReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReservaMouseExited
        pnReserva.setBackground(new Color(13, 39, 70));
        lbReserva.setForeground(new Color(255,255,255));
        lbReserva.setFont(new java.awt.Font("Arial", 0, 14));
        lbReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbReservaMouseExited

    /*LABEL DE REPORTES*/
    private void lbReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbReporteMouseClicked
    private void lbReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReporteMouseEntered
        pnReportes.setBackground(new Color(248,177,57));
        lbReporte.setForeground(new Color(23,23,23));
        lbReporte.setFont(new java.awt.Font("Arial", 1, 14));
        lbReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbReporteMouseEntered
    private void lbReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReporteMouseExited
        pnReportes.setBackground(new Color(13, 39, 70));
        lbReporte.setForeground(new Color(255,255,255));
        lbReporte.setFont(new java.awt.Font("Arial", 0, 14));
        lbReporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbReporteMouseExited

    /*LABEL DE LOGOUT*/
    private void lbLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutMouseClicked
        datosUsuario.setVisible(true);
    }//GEN-LAST:event_lbLogOutMouseClicked
    private void lbLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutMouseEntered
        pnLogOut.setBackground(new Color(248,177,57));
        lbLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/userLog_B.png")));
        lbLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbLogOutMouseEntered
    private void lbLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogOutMouseExited
        pnLogOut.setBackground(new Color(13, 39, 70));
        lbLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/userLog_Y.png")));
        lbLogOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbLogOutMouseExited

    /*LABEL DE SERVICIOS*/
    private void lbServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbServicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbServicioMouseClicked
    private void lbServicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbServicioMouseEntered
        pnServicios.setBackground(new Color(248,177,57));
        lbServicio.setForeground(new Color(23,23,23));
        lbServicio.setFont(new java.awt.Font("Arial", 1, 14));
        lbServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248,177,57)));
    }//GEN-LAST:event_lbServicioMouseEntered
    private void lbServicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbServicioMouseExited
        pnServicios.setBackground(new Color(13, 39, 70));
        lbServicio.setForeground(new Color(255,255,255));
        lbServicio.setFont(new java.awt.Font("Arial", 0, 14));
        lbServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_lbServicioMouseExited

    private void btValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btValidarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btValidarActionPerformed
    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btValidar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlojamiento;
    private javax.swing.JLabel lbLogOut;
    private javax.swing.JLabel lbReporte;
    private javax.swing.JLabel lbReserva;
    private javax.swing.JLabel lbServicio;
    private javax.swing.JLabel lbadministracion;
    private javax.swing.JPanel panelEventos;
    private javax.swing.JPanel panelImagenes;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel pnAdministracion;
    private javax.swing.JPanel pnAlojamiento;
    private javax.swing.JPanel pnLogOut;
    private javax.swing.JPanel pnReportes;
    private javax.swing.JPanel pnReserva;
    private javax.swing.JPanel pnServicios;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
