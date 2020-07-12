package vista;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import modelo.ClienteDAO;
import modelo.DetalleVenta;
import modelo.DetalleVentaDAO;
import modelo.Producto;
import modelo.ProductoDAO;
import modelo.Venta;
import modelo.VentaDAO;

public class VentaForm extends javax.swing.JInternalFrame {
    
    ClienteDAO clienteDAO = new ClienteDAO();
    Cliente cliente = new Cliente();

    ProductoDAO productoDAO = new ProductoDAO();
    Producto producto = new Producto();
    
    VentaDAO ventaDAO = new VentaDAO();
    Venta venta = new Venta();
    
    DetalleVentaDAO detalleVentaDAO = new DetalleVentaDAO();
    DetalleVenta detalleVenta = new DetalleVenta();
    
    DefaultTableModel defaultTableModel = new DefaultTableModel();
      
    static int numeroProducto = 0;
    
    Calendar calendar = new GregorianCalendar();
    
    public VentaForm() {
        initComponents();
        serieVenta();
        llenarComboProducto();
        fechaActual();
        jTextFieldVendedor.setText("" + LoginForm.vendedor.getId_vendedor());
    }
    
    void fechaActual(){
        jTextFieldFecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
    }
    void llenarComboProducto(){
        ArrayList<String> lista = new ArrayList<String>();
        lista = productoDAO.listarProducto();
        for (int i = 0; i < lista.size(); i++) {
            jComboBoxNombreProducto.addItem(lista.get(i));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelN = new javax.swing.JLabel();
        jLabelSerie = new javax.swing.JLabel();
        jPanelMenu = new javax.swing.JPanel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelBuscarProducto = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldBuscarProducto = new javax.swing.JTextField();
        jComboBoxNombreProducto = new javax.swing.JComboBox<>();
        jTextFieldPrecio = new javax.swing.JTextField();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jButtonBuscarCliente = new javax.swing.JButton();
        jButtonBuscarProducto = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldVendedor = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        jPanelVenta = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setTitle("Ventas");

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setText("Sistema de ventas");

        jLabelCelular.setText("Celular: 997045329");

        jLabelN.setText("N°");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addGap(256, 256, 256)
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addComponent(jLabelN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelCelular))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloLayout.setVerticalGroup(
            jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTituloLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelLogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDNI.setText("DNI");

        jLabelBuscarProducto.setText("Producto");

        jLabelPrecio.setText("Precio");

        jLabelCantidad.setText("Cantidad");

        jComboBoxNombreProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNombreProductoItemStateChanged(evt);
            }
        });

        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jButtonBuscarProducto.setText("Buscar");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabelCliente.setText("Cliente");

        jLabelProducto.setText("Producto");

        jLabelStock.setText("Stock");

        jLabelVendedor.setText("Vendedor");

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelBuscarProducto)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelCantidad))
                .addGap(16, 16, 16)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldDNI)
                    .addComponent(jTextFieldPrecio)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jTextFieldBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createSequentialGroup()
                        .addComponent(jLabelStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBuscarProducto)
                        .addComponent(jLabelProducto)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelStock)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidad)
                    .addComponent(jLabelVendedor)
                    .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID", "Producto", "Cantidad", "Precio", "Sub total"
            }
        ));
        jTableVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentaMouseClicked(evt);
            }
        });
        jScrollPaneTabla.setViewportView(jTableVenta);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonVenta.setText("Generar venta");
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });

        jLabelTotal.setText("Total");

        javax.swing.GroupLayout jPanelVentaLayout = new javax.swing.GroupLayout(jPanelVenta);
        jPanelVenta.setLayout(jPanelVentaLayout);
        jPanelVentaLayout.setHorizontalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelVentaLayout.setVerticalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentaMouseClicked
        /*int fila = jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableVenta.getValueAt(fila, 0).toString());
            String dni_cliente = jTableVenta.getValueAt(fila, 1).toString();
            String nombre_cliente = jTableVenta.getValueAt(fila, 2).toString();
            String celular_cliente = jTableVenta.getValueAt(fila, 3).toString();
            String estado_cliente = jTableVenta.getValueAt(fila, 4).toString();
            jTextFieldDNI.setText(dni_cliente);
            jTextFieldNombre.setText(nombre_cliente);
            jTextFieldCelular.setText(celular_cliente);
            jComboBoxEstado.setSelectedItem(estado_cliente);
        }*/
    }//GEN-LAST:event_jTableVentaMouseClicked

    private void jButtonBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_jButtonBuscarClienteActionPerformed

    private void jButtonBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarProductoActionPerformed
        buscarProducto();
    }//GEN-LAST:event_jButtonBuscarProductoActionPerformed

    private void jComboBoxNombreProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNombreProductoItemStateChanged
        String nombreProducto = jComboBoxNombreProducto.getSelectedItem().toString();
        int respuesta;
        if (nombreProducto.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarProductoNombre(nombreProducto);
            if (producto.getId_producto() != 0) {
                jTextFieldProducto.setText(producto.getNombre_producto());
                jTextFieldPrecio.setText("" + producto.getPrecio_producto());
                jTextFieldStock.setText("" + producto.getStock_producto());
                jSpinnerCantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ProductoForm productoForm = new ProductoForm();
                    CentrarVentana(productoForm);
                }
            }
        }
    }//GEN-LAST:event_jComboBoxNombreProductoItemStateChanged

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        if (jTextFieldTotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Agregar producto");
        } else {
            guardarVenta();
            guardarDetalleVenta();
            actualizarStock();
            JOptionPane.showMessageDialog(this, "Compra realizada");
            limpiarFormulario();
            limpiarTabla();
            serieVenta();
        }  
    }//GEN-LAST:event_jButtonVentaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarFormulario();
        limpiarTabla();
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    
    void buscarCliente() {
        String dni = jTextFieldDNI.getText();
        int respuesta;
        if (dni.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar DNI");
        } else {
            cliente = clienteDAO.buscarCliente(dni);
            if (cliente.getDni_cliente() == null) {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ClienteForm clienteForm = new ClienteForm();
                    CentrarVentana(clienteForm);                    
                }
            } else {
                jTextFieldCliente.setText(cliente.getNombre_cliente());
                jButtonBuscarProducto.requestFocus();
            }
        }
    }
       
    void buscarProducto(){
        String id = jTextFieldBuscarProducto.getText();
        int respuesta;
        if (jTextFieldBuscarProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarProductoId(Integer.parseInt(id));
            if (producto.getId_producto() != 0) {
                jTextFieldProducto.setText(producto.getNombre_producto());
                jTextFieldPrecio.setText("" + producto.getPrecio_producto());
                jTextFieldStock.setText("" + producto.getStock_producto());         
                jSpinnerCantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    ProductoForm productoForm = new ProductoForm();
                    CentrarVentana(productoForm);                    
                }
            }
        }
    }
    
    void agregarProducto(){
        double subTotal=0;
        ArrayList lista = new ArrayList();
        defaultTableModel = (DefaultTableModel) jTableVenta.getModel();
        
        String nombre_cliente = jTextFieldCliente.getText();
        
        int id_producto = producto.getId_producto();
        String nombre_producto = producto.getNombre_producto();
        int cantidad = Integer.parseInt(jSpinnerCantidad.getValue().toString());
        double precio_producto = producto.getPrecio_producto();
        subTotal = cantidad * precio_producto;
        
        int stock_producto = Integer.parseInt(jTextFieldStock.getText());
        //String estado_producto;
               
        if (nombre_cliente.equals("")) {
            JOptionPane.showMessageDialog(this, "Buscar cliente");
        } else {
            if (cantidad > 0){
                if (stock_producto > 0) {
                    numeroProducto++;
                    lista.add(numeroProducto);
                    lista.add(id_producto);
                    lista.add(nombre_producto);
                    lista.add(cantidad);
                    lista.add(precio_producto);
                    lista.add(subTotal);
                    Object[] object = new Object[6];
                    object[0] = lista.get(0);
                    object[1] = lista.get(1);
                    object[2] = lista.get(2);
                    object[3] = lista.get(3);
                    object[4] = lista.get(4);
                    object[5] = lista.get(5);
                    defaultTableModel.addRow(object);
                    jTableVenta.setModel(defaultTableModel);
                    totalVenta();
                } else {
                    JOptionPane.showMessageDialog(this, "No hay stock");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Escoger cantidad");
            }
        }
    }
       
    void totalVenta(){
        double total = 0;
        int cantidad_venta = 0;
        double precio_producto = 0;
        for (int i = 0; i < jTableVenta.getRowCount(); i++) {
            cantidad_venta = Integer.parseInt(jTableVenta.getValueAt(i, 3).toString());
            precio_producto = Double.parseDouble(jTableVenta.getValueAt(i, 4).toString());
            total = total + (cantidad_venta * precio_producto);
        }
        jTextFieldTotal.setText("" + total);
    }
    
    void guardarVenta(){
        String serie_venta = jLabelSerie.getText();
        String fecha_venta = jTextFieldFecha.getText();
        double monto_venta = Double.parseDouble(jTextFieldTotal.getText());
        String estado_venta = "1";
        int id_cliente = cliente.getId_cliente();
        int id_vendedor = Integer.parseInt(jTextFieldVendedor.getText());
        
        venta.setSerie_venta(serie_venta);
        venta.setFecha_venta(fecha_venta);
        venta.setMonto_venta(monto_venta);
        venta.setEstado_venta(estado_venta);
        venta.setCliente_id_cliente(id_cliente);
        venta.setVendedor_id_vendedor(id_vendedor);
        ventaDAO.guardarVenta(venta);
    }
    
    void guardarDetalleVenta(){
        int venta_id_venta = Integer.parseInt(detalleVentaDAO.ultimoIdVenta());
        int cantidad_venta;
        int producto_id_producto;
        double precio_total_venta;
        for (int i = 0; i < jTableVenta.getRowCount(); i++) {
            cantidad_venta = Integer.parseInt(jTableVenta.getValueAt(i, 3).toString());
            producto_id_producto = Integer.parseInt(jTableVenta.getValueAt(i, 1).toString());
            precio_total_venta = Double.parseDouble(jTableVenta.getValueAt(i, 5).toString());
            detalleVenta.setVenta_id_venta(venta_id_venta);
            detalleVenta.setCantidad_venta(cantidad_venta);
            detalleVenta.setProducto_id_producto(producto_id_producto);
            detalleVenta.setPrecio_total_venta(precio_total_venta);
            detalleVentaDAO.guardarDetalleVenta(detalleVenta);
        }
    }
    
    void serieVenta(){
        String ultimaSerieVenta = detalleVentaDAO.ultimoIdVenta();
        int serie = 0;
        if (ultimaSerieVenta == null) {
            jLabelSerie.setText("000001");
        } else {
            serie = Integer.parseInt(ultimaSerieVenta);
            jLabelSerie.setText("00000" + (serie+1));
        }
    }
    
    void limpiarTabla() {
        for (int i = (defaultTableModel.getRowCount() - 1); i >= 0; i--) {
            defaultTableModel.removeRow(i);
        }
    }
    
    void limpiarFormulario() {
        jTextFieldDNI.setText("");
        jTextFieldBuscarProducto.setText("");
        jComboBoxNombreProducto.setSelectedIndex(0);
        jTextFieldPrecio.setText("");
        jSpinnerCantidad.setValue(0);
        jTextFieldCliente.setText("");
        jTextFieldProducto.setText("");
        jTextFieldStock.setText("");
        jTextFieldDNI.requestFocus();
    }
    
    void CentrarVentana(JInternalFrame form){
        PrincipalForm.jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = PrincipalForm.jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width)/2, (dimensionPrincipal.height-dimensionVentasForm.height)/2);
        form.show();
    }
    
    void actualizarStock() {
        int id_producto;
        int cantidad_venta;
        int stock_producto;
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            id_producto = Integer.parseInt(jTableVenta.getValueAt(i, 1).toString());
            cantidad_venta = Integer.parseInt(jTableVenta.getValueAt(i, 3).toString());
            producto = productoDAO.buscarProductoId(id_producto);
            stock_producto = producto.getStock_producto() - cantidad_venta;
            productoDAO.actualizarStock(stock_producto, id_producto);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscarCliente;
    private javax.swing.JButton jButtonBuscarProducto;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonVenta;
    private javax.swing.JComboBox<String> jComboBoxNombreProducto;
    private javax.swing.JLabel jLabelBuscarProducto;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelSerie;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JPanel jPanelVenta;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableVenta;
    private javax.swing.JTextField jTextFieldBuscarProducto;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVendedor;
    // End of variables declaration//GEN-END:variables
}