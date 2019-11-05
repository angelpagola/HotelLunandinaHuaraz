package Ventanas;

import Clases.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo
 */
public class Servicios extends javax.swing.JFrame {

    ServiciosFisico sFisico=new ServiciosFisico();
    DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };

    public Servicios() {
        initComponents();
        
        this.setTitle("Servicios");
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        inicializarJTable();
        lbUserActual.setText(Control.usuario);
        
        lbReiniciar.setVisible(false);
        pnEmpresa.setVisible(false);
        pnClientePersona.setVisible(false);
        pnServicio.setVisible(false);
        btGuardar.setVisible(false);
        btEditar.setVisible(false);
        btEliminar.setVisible(false);
        btFisico.setVisible(false);
    }

    public void inicializarJTable() {
        modelo.setColumnIdentifiers(new String[]{"ID", "Servicio", "Precio", "Habitación", "DNI",
            "Cliente", "Fecha", "Usuario"});
        tbServicio.setModel(modelo);
        tbServicio.getColumnModel().getColumn(0).setPreferredWidth(50);
        tbServicio.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbServicio.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbServicio.getColumnModel().getColumn(3).setPreferredWidth(200);
        tbServicio.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbServicio.getColumnModel().getColumn(5).setPreferredWidth(250);
        tbServicio.getColumnModel().getColumn(6).setPreferredWidth(200);
        tbServicio.getColumnModel().getColumn(7).setPreferredWidth(200);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btFisico = new javax.swing.JButton();
        pnServicio = new javax.swing.JPanel();
        cboservicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpreciounit = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtpreciounit1 = new javax.swing.JTextField();
        pnClientePersona = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbLimpiar = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        pnTipo = new javax.swing.JPanel();
        btPersona = new javax.swing.JButton();
        btEmpresa = new javax.swing.JButton();
        lbReiniciar = new javax.swing.JLabel();
        pnEmpresa = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txRUC = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbUserActual = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbServicio = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txbuscar = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btFisico.setBackground(new java.awt.Color(111, 168, 183));
        btFisico.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btFisico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/doc.png"))); // NOI18N
        btFisico.setText("En Físico");
        btFisico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFisico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFisicoActionPerformed(evt);
            }
        });
        jPanel1.add(btFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 535, 110, 75));

        pnServicio.setBackground(new java.awt.Color(255, 255, 255));
        pnServicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnServicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboservicio.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        cboservicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desayuno", "Lavanderia", "Boletos" }));
        pnServicio.add(cboservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 200, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Servicio");
        pnServicio.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        pnServicio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        txtpreciounit.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtpreciounit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciounit.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtpreciounit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciounitKeyTyped(evt);
            }
        });
        pnServicio.add(txtpreciounit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Precio  S/.");
        pnServicio.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 120, 30));

        txtpreciounit1.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txtpreciounit1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciounit1.setSelectionColor(new java.awt.Color(0, 122, 255));
        txtpreciounit1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciounit1KeyTyped(evt);
            }
        });
        pnServicio.add(txtpreciounit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 30));

        jPanel1.add(pnServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 390, 170));

        pnClientePersona.setBackground(new java.awt.Color(255, 255, 255));
        pnClientePersona.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnClientePersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("DNI");
        pnClientePersona.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        txDNI.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txDNI.setSelectionColor(new java.awt.Color(0, 122, 255));
        txDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txDNIKeyTyped(evt);
            }
        });
        pnClientePersona.add(txDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 200, 30));

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

        jPanel1.add(pnClientePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 390, 310));

        lbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/limpiar.png"))); // NOI18N
        lbLimpiar.setToolTipText("Limpiar formularios");
        lbLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(lbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 5, -1, -1));

        btEliminar.setBackground(new java.awt.Color(234, 82, 62));
        btEliminar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/eliminar.png"))); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 580, 120, 30));

        btEditar.setBackground(new java.awt.Color(255, 185, 83));
        btEditar.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/modificar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 535, 120, 30));

        btGuardar.setBackground(new java.awt.Color(136, 206, 82));
        btGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/agregar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 535, 110, 75));

        pnTipo.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(pnTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 120));

        lbReiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/modificar.png"))); // NOI18N
        lbReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReiniciarMouseClicked(evt);
            }
        });
        jPanel1.add(lbReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 5, 30, 30));

        pnEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        pnEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "DATOS DEL USUARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        pnEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("RUC");
        pnEmpresa.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 30));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("N° Habitación");
        pnEmpresa.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 30));

        txRUC.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txRUC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txRUC.setSelectionColor(new java.awt.Color(0, 122, 255));
        txRUC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txRUCKeyTyped(evt);
            }
        });
        pnEmpresa.add(txRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 200, 30));

        jLabel20.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Empresa");
        pnEmpresa.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        jLabel22.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, 30));

        jLabel23.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnEmpresa.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 200, 30));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("Procedencia");
        pnEmpresa.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, 30));

        jPanel1.add(pnEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, 450, 722));

        jPanel5.setBackground(new java.awt.Color(13, 39, 70));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lunandina/logoServicios.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, -1, 40));

        lbUserActual.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 16)); // NOI18N
        lbUserActual.setForeground(new java.awt.Color(255, 255, 255));
        lbUserActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbUserActual.setText("jLabel13");
        jPanel5.add(lbUserActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(1145, 0, 150, 46));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/userActual.png"))); // NOI18N
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1306, 0, 30, 46));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 46));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "SERVICIOS REALIZADOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbServicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbServicio.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        tbServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"bff", "ffvfvf", "vvfvf", "vfvfv", "fvfvfv", "vfvfvfv", "fvfvfv", "v"},
                {"fvfvf", "vffvf", "fvfvf", "fvfvfv", "vfvfv", "fvvfvf", "fvfvf", "fvfvfv"},
                {"fvfvfv", "vfvfv", "fvvf", "fvvfv", "vffv", "fvv", "vfvfv", "fvfv"},
                {"vfvf", "fvvfv", "fvvfv", "vfvfv", "fvfv", "fvvf", "fvfv", "fvfvf"},
                {"fvfvfv", "fvfvfv", "fvffv", "fvf", "vfvfv", "fvfvfv", "fvfv", "vfvfvfv"}
            },
            new String [] {
                "ID", "Servicio", "Precio", "Habitacion", "DNI", "Cliente", "Fecha", "Usuario"
            }
        ));
        tbServicio.setGridColor(new java.awt.Color(51, 51, 51));
        tbServicio.setSelectionBackground(new java.awt.Color(0, 122, 255));
        tbServicio.setShowVerticalLines(false);
        tbServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbServicioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbServicio);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 816, 460));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recursos/buscar.png"))); // NOI18N
        jLabel4.setText("Buscar");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 40, 100, 30));

        txbuscar.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        txbuscar.setSelectionColor(new java.awt.Color(0, 122, 255));
        txbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txbuscarKeyReleased(evt);
            }
        });
        jPanel2.add(txbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 40, 300, 30));

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 856, 580));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 46, 916, 722));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbServicioMouseClicked
      
    }//GEN-LAST:event_tbServicioMouseClicked

    private void txbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txbuscarKeyReleased
       
    }//GEN-LAST:event_txbuscarKeyReleased

    private void txtpreciounitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciounitKeyTyped
        
    }//GEN-LAST:event_txtpreciounitKeyTyped

    private void btFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFisicoActionPerformed
        sFisico.setVisible(true);
    }//GEN-LAST:event_btFisicoActionPerformed

    private void txDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txDNIKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txDNIKeyTyped

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
         
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btGuardarActionPerformed

    private void txtpreciounit1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciounit1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciounit1KeyTyped

    private void btPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPersonaActionPerformed
        pnTipo.setVisible(false);

        lbReiniciar.setVisible(true);
        pnEmpresa.setVisible(false);
        pnClientePersona.setVisible(true);
        pnServicio.setVisible(true);
        btGuardar.setVisible(true);
        btEditar.setVisible(true);
        btEliminar.setVisible(true);
        btFisico.setVisible(true);
        
        txDNI.grabFocus();
    }//GEN-LAST:event_btPersonaActionPerformed

    private void btEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmpresaActionPerformed
        pnTipo.setVisible(false);

        lbReiniciar.setVisible(true);
        pnEmpresa.setVisible(true);
        pnClientePersona.setVisible(false);
        pnServicio.setVisible(true);
        btGuardar.setVisible(true);
        btEditar.setVisible(true);
        btEliminar.setVisible(true);
        btFisico.setVisible(true);
        
        txRUC.grabFocus();
    }//GEN-LAST:event_btEmpresaActionPerformed

    private void lbReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReiniciarMouseClicked
        pnTipo.setVisible(true);

        lbReiniciar.setVisible(false);
        pnEmpresa.setVisible(false);
        pnClientePersona.setVisible(false);
        pnServicio.setVisible(false);
        btGuardar.setVisible(false);
        btEditar.setVisible(false);
        btEliminar.setVisible(false);
        btFisico.setVisible(false);
    }//GEN-LAST:event_lbReiniciarMouseClicked

    private void txRUCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txRUCKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txRUCKeyTyped

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
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btEmpresa;
    private javax.swing.JButton btFisico;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btPersona;
    private javax.swing.JComboBox<String> cboservicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbLimpiar;
    private javax.swing.JLabel lbReiniciar;
    private javax.swing.JLabel lbUserActual;
    private javax.swing.JPanel pnClientePersona;
    private javax.swing.JPanel pnEmpresa;
    private javax.swing.JPanel pnServicio;
    private javax.swing.JPanel pnTipo;
    private javax.swing.JTable tbServicio;
    private javax.swing.JTextField txDNI;
    private javax.swing.JTextField txRUC;
    private javax.swing.JTextField txbuscar;
    private javax.swing.JTextField txtpreciounit;
    private javax.swing.JTextField txtpreciounit1;
    // End of variables declaration//GEN-END:variables
}
