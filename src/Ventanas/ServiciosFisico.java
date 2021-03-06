package Ventanas;
import Clases.*;
import Clases.Design;
public class ServiciosFisico extends javax.swing.JFrame {
    Controlador control=new Controlador();
    Conexion cnn = new Conexion();
    Design design = new Design();
    
    public ServiciosFisico() {
        initComponents();
        control.LlenarCombo(cboservicio1, "select * from tiposervicio",2);
        design.MoverFrame(jPanel2, this);
        this.setLocationRelativeTo(null);
        lbReiniciar.setVisible(false);
        pnEmpresa.setVisible(false);
        pnClientePersona.setVisible(false);
        pnServicio.setVisible(false);
        btFactura.setVisible(false);
        btBoleta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        pnTipo = new javax.swing.JPanel();
        btPersona = new javax.swing.JButton();
        btEmpresa = new javax.swing.JButton();
        pnClientePersona = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtNumhabit = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pnEmpresa = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtpreciounit4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btFactura = new javax.swing.JButton();
        btBoleta = new javax.swing.JButton();
        lbReiniciar = new javax.swing.JLabel();
        pnServicio = new javax.swing.JPanel();
        cboservicio1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtpreciounit2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtpreciounit3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbCerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMain.setBackground(new java.awt.Color(248, 177, 57));
        pnMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(13, 39, 70), 2));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTipo.setBackground(new java.awt.Color(248, 177, 57));
        pnTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "TIPO DE CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnTipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btPersona.setBackground(new java.awt.Color(111, 168, 183));
        btPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/persona.png"))); // NOI18N
        btPersona.setText("PERSONA");
        btPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPersonaActionPerformed(evt);
            }
        });
        pnTipo.add(btPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 150, 40));

        btEmpresa.setBackground(new java.awt.Color(144, 101, 168));
        btEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/empresa.png"))); // NOI18N
        btEmpresa.setText("EMPRESA");
        btEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmpresaActionPerformed(evt);
            }
        });
        pnTipo.add(btEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 150, 40));

        pnMain.add(pnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3000, 40, 390, 120));

        pnClientePersona.setBackground(new java.awt.Color(248, 177, 57));
        pnClientePersona.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnClientePersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("DNI");
        pnClientePersona.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        txtNumhabit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtNumhabit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumhabit.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtNumhabit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumhabitKeyTyped(evt);
            }
        });
        pnClientePersona.add(txtNumhabit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 200, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("A. Materno");
        pnClientePersona.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("N° de Habitacion");
        pnClientePersona.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 30));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("A. Paterno");
        pnClientePersona.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 85, 120, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Nombres");
        pnClientePersona.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 195, 120, 30));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnClientePersona.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 200, 30));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnClientePersona.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 85, 200, 30));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnClientePersona.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnClientePersona.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 195, 200, 30));

        pnMain.add(pnClientePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3000, 10, 390, 310));

        pnEmpresa.setBackground(new java.awt.Color(248, 177, 57));
        pnEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("RUC");
        pnEmpresa.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("N° Habitación");
        pnEmpresa.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, 30));

        txtpreciounit4.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtpreciounit4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciounit4.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtpreciounit4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciounit4KeyTyped(evt);
            }
        });
        pnEmpresa.add(txtpreciounit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, 30));

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Empresa");
        pnEmpresa.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 30));

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, 30));

        jLabel23.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 200, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Procedencia");
        pnEmpresa.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 30));

        pnMain.add(pnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 390, 310));

        btFactura.setBackground(new java.awt.Color(144, 101, 168));
        btFactura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/pdf.png"))); // NOI18N
        btFactura.setText("Imprimir Factura");
        btFactura.setBorder(null);
        btFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFacturaActionPerformed(evt);
            }
        });
        pnMain.add(btFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 120, 65));

        btBoleta.setBackground(new java.awt.Color(111, 168, 183));
        btBoleta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/pdf.png"))); // NOI18N
        btBoleta.setText("Imprimir Boleta");
        btBoleta.setBorder(null);
        btBoleta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBoleta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnMain.add(btBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 120, 65));

        lbReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/reiniciar.png"))); // NOI18N
        lbReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReiniciarMouseClicked(evt);
            }
        });
        pnMain.add(lbReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 40, -1));

        pnServicio.setBackground(new java.awt.Color(248, 177, 57));
        pnServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL SERVICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboservicio1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        pnServicio.add(cboservicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 200, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Servicio");
        pnServicio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Cantidad");
        pnServicio.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        txtpreciounit2.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtpreciounit2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciounit2.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtpreciounit2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciounit2KeyTyped(evt);
            }
        });
        pnServicio.add(txtpreciounit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Precio  S/.");
        pnServicio.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 30));

        txtpreciounit3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtpreciounit3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciounit3.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtpreciounit3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciounit3KeyTyped(evt);
            }
        });
        pnServicio.add(txtpreciounit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 30));

        pnMain.add(pnServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 390, 170));

        getContentPane().add(pnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 600, 530));

        jPanel2.setBackground(new java.awt.Color(13, 39, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/cerrar1.png"))); // NOI18N
        lbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCerrarMouseExited(evt);
            }
        });
        jPanel2.add(lbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, 46));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lunandina/logoFisico.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, -1, 46));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 46));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumhabitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumhabitKeyTyped
    
    jLabel2.setText(control.DevolverRegistroDto("select apPat from vista_pc where DNI like '%"+txtNumhabit.getText()+"%'", 1));
    jLabel6.setText(control.DevolverRegistroDto("select apMat from vista_pc where DNI like '%"+txtNumhabit.getText()+"%'", 1));
    jLabel7.setText(control.DevolverRegistroDto("select nomb from vista_pc  where DNI like '%"+txtNumhabit.getText()+"%'", 1));
    jLabel1.setText(control.DevolverRegistroDto("select numHab from vista_pc whereDNI like '%"+txtNumhabit.getText()+"%'", 1));
       
    }//GEN-LAST:event_txtNumhabitKeyTyped

    /* ICONO DE CERRAR*/
    private void lbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbCerrarMouseClicked
    private void lbCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseEntered
        lbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/cerrar2.png")));
    }//GEN-LAST:event_lbCerrarMouseEntered
    private void lbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCerrarMouseExited
        lbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/cerrar1.png")));
    }//GEN-LAST:event_lbCerrarMouseExited

    private void txtpreciounit2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciounit2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciounit2KeyTyped

    private void txtpreciounit3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciounit3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciounit3KeyTyped

    private void txtpreciounit4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciounit4KeyTyped
     
   jLabel22.setText(control.DevolverRegistroDto("select nombreEmpresa from vista_ce where RUC like '%"+txtpreciounit4.getText()+"%'", 1));
  
   jLabel23.setText(control.DevolverRegistroDto("select lugar from vista_ce where RUC like '%"+txtpreciounit4.getText()+"%'", 1));
   jLabel20.setText(control.DevolverRegistroDto("select numHab from vista_ce where RUC like '%"+txtpreciounit4.getText()+"%'", 1));
     
     
    }//GEN-LAST:event_txtpreciounit4KeyTyped

    private void btPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPersonaActionPerformed
        pnTipo.setVisible(false);lbReiniciar.setVisible(true);
        pnEmpresa.setVisible(false);pnClientePersona.setVisible(true);
        pnServicio.setVisible(true);btFactura.setVisible(false);
        btBoleta.setVisible(true);
    }//GEN-LAST:event_btPersonaActionPerformed
    private void btEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresaActionPerformed
        pnTipo.setVisible(false);lbReiniciar.setVisible(true);
        pnEmpresa.setVisible(true);pnClientePersona.setVisible(false);
        pnServicio.setVisible(true);btFactura.setVisible(true);
        btBoleta.setVisible(false);
    }//GEN-LAST:event_btEmpresaActionPerformed
    private void lbReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReiniciarMouseClicked
        pnTipo.setVisible(true);
        
        lbReiniciar.setVisible(false);
        pnEmpresa.setVisible(false);
        pnClientePersona.setVisible(false);
        pnServicio.setVisible(false);
        btFactura.setVisible(false);
        btBoleta.setVisible(false);
    }//GEN-LAST:event_lbReiniciarMouseClicked

    private void btFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFacturaActionPerformed
        
    }//GEN-LAST:event_btFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(ServiciosFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiciosFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiciosFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiciosFisico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiciosFisico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoleta;
    private javax.swing.JButton btEmpresa;
    private javax.swing.JButton btFactura;
    private javax.swing.JButton btPersona;
    private javax.swing.JComboBox<String> cboservicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCerrar;
    private javax.swing.JLabel lbReiniciar;
    private javax.swing.JPanel pnClientePersona;
    private javax.swing.JPanel pnEmpresa;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnServicio;
    private javax.swing.JPanel pnTipo;
    private javax.swing.JTextField txtNumhabit;
    private javax.swing.JTextField txtpreciounit2;
    private javax.swing.JTextField txtpreciounit3;
    private javax.swing.JTextField txtpreciounit4;
    // End of variables declaration//GEN-END:variables
}
