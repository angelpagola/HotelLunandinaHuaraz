
package Ventanas;

public class ReporteClientes extends javax.swing.JInternalFrame {

    public ReporteClientes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gDinero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txLugar = new javax.swing.JTextField();
        txMonto = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbNameCliente = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PANEL DE BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/nombre.png"))); // NOI18N
        jLabel1.setText("Cliente");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/dinero.png"))); // NOI18N
        jLabel2.setText("Ingresos   S/.");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 120, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/procedencia.png"))); // NOI18N
        jLabel4.setText("Procedencia");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 30));

        txLugar.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txLugar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txLugar.setSelectionColor(new java.awt.Color(0, 122, 255));
        txLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txLugarActionPerformed(evt);
            }
        });
        jPanel2.add(txLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 200, 30));

        txMonto.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txMonto.setSelectionColor(new java.awt.Color(0, 122, 255));
        jPanel2.add(txMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 55, 110, 30));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        gDinero.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton1.setText("Menor que ...");
        jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 110, 30));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        gDinero.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jRadioButton2.setText("Mayor que ...");
        jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 110, 30));

        txCliente.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txCliente.setSelectionColor(new java.awt.Color(0, 122, 255));
        txCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 30));

        jButton1.setBackground(new java.awt.Color(111, 168, 183));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/pdf.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 115, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 784, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "INGRESOS REGISTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"22-01-2018", "[Nombre de cliente aqui]", "Casma", "200.00", "victor"},
                {"23-05-2018", "[Nombre de cliente aqui]", "Casma", "225.50", "victor"},
                {"04-07-2018", "[Nombre de cliente aqui]", "Casma", "185.00", "victor"},
                {"27-07-2018", "[Nombre de cliente aqui]", "Casma", "100.00", "victor"},
                {"24-10-2018", "[Nombre de cliente aqui]", "Casma", "130.00", "victor"}
            },
            new String [] {
                "Fecha", "Cliente", "Procedencia", "Monto Total", "Usuario"
            }
        ));
        tabla.setEnabled(false);
        tabla.setRowHeight(25);
        tabla.setSelectionBackground(new java.awt.Color(0, 122, 255));
        jScrollPane1.setViewportView(tabla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 724, 234));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Total  S/.");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 40));

        lbTotal.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(lbTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 150, 40));

        lbNameCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbNameCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNameCliente.setText("[Nombre de cliente aqui]");
        jPanel3.add(lbNameCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 10, 220, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 784, 375));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 844, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txLugarActionPerformed

    private void txClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup gDinero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNameCliente;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txCliente;
    private javax.swing.JTextField txLugar;
    private javax.swing.JTextField txMonto;
    // End of variables declaration//GEN-END:variables
}
