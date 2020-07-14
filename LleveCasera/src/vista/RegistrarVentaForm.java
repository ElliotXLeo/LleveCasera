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

public class RegistrarVentaForm extends javax.swing.JInternalFrame {

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

    public RegistrarVentaForm() {
        initComponents();
        idVenta();
        llenarComboProducto();
        fechaActual();
        jTextFieldVendedor.setText("" + LoginForm.vendedor.getId_vendedor());
    }

    void fechaActual() {
        jTextFieldFecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
    }

    void llenarComboProducto() {
        ArrayList<String> lista = new ArrayList<String>();
        lista = productoDAO.listarProducto();
        for (int i = 0; i < lista.size(); i++) {
            jComboBoxNombreProducto.addItem(lista.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitulo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelIdVenta = new javax.swing.JLabel();
        jPanelFormulario = new javax.swing.JPanel();
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
        jTextFieldFecha = new javax.swing.JTextField();
        jLabelCliente = new javax.swing.JLabel();
        jLabelProducto = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldVendedor = new javax.swing.JTextField();
        jPanelDetalleVenta = new javax.swing.JPanel();
        jScrollPaneDetalleVenta = new javax.swing.JScrollPane();
        jTableDetalleVenta = new javax.swing.JTable();
        jPanelRegistrarVenta = new javax.swing.JPanel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonVenta = new javax.swing.JButton();
        jLabelTotal = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar venta");

        jPanelTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logo.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setText("Sistema de ventas");

        jLabelCelular.setText("Celular: 997045329");

        jLabelNumero.setText("N°");

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
                        .addGroup(jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabelNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelIdVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addComponent(jLabelNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIdVenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelLogo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDNI.setText("DNI");

        jLabelBuscarProducto.setText("Producto");

        jLabelPrecio.setText("Precio");

        jLabelCantidad.setText("Cantidad");

        jComboBoxNombreProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNombreProductoItemStateChanged(evt);
            }
        });

        jButtonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/buscar.png"))); // NOI18N
        jButtonBuscarCliente.setText("Buscar");
        jButtonBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClienteActionPerformed(evt);
            }
        });

        jButtonBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/buscar.png"))); // NOI18N
        jButtonBuscarProducto.setText("Buscar");
        jButtonBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarProductoActionPerformed(evt);
            }
        });

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/add.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelBuscarProducto)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelCantidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelFormularioLayout.createSequentialGroup()
                            .addComponent(jTextFieldBuscarProducto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelVendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabelStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelBuscarProducto)
                        .addComponent(jLabelProducto)
                        .addComponent(jTextFieldProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelStock)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCantidad)
                    .addComponent(jLabelVendedor)
                    .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelDetalleVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableDetalleVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "ID", "Producto", "Cantidad", "Precio", "Sub total"
            }
        ));
        jScrollPaneDetalleVenta.setViewportView(jTableDetalleVenta);

        javax.swing.GroupLayout jPanelDetalleVentaLayout = new javax.swing.GroupLayout(jPanelDetalleVenta);
        jPanelDetalleVenta.setLayout(jPanelDetalleVentaLayout);
        jPanelDetalleVentaLayout.setHorizontalGroup(
            jPanelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDetalleVenta)
                .addContainerGap())
        );
        jPanelDetalleVentaLayout.setVerticalGroup(
            jPanelDetalleVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDetalleVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDetalleVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRegistrarVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/cancelar.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/enter.png"))); // NOI18N
        jButtonVenta.setText("Registrar venta");
        jButtonVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVentaActionPerformed(evt);
            }
        });

        jLabelTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/money.png"))); // NOI18N
        jLabelTotal.setText("Total");

        javax.swing.GroupLayout jPanelRegistrarVentaLayout = new javax.swing.GroupLayout(jPanelRegistrarVenta);
        jPanelRegistrarVenta.setLayout(jPanelRegistrarVentaLayout);
        jPanelRegistrarVentaLayout.setHorizontalGroup(
            jPanelRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelRegistrarVentaLayout.setVerticalGroup(
            jPanelRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistrarVentaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelRegistrarVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelRegistrarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDetalleVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRegistrarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                    centrarVentana(productoForm);
                }
            }
        }
    }//GEN-LAST:event_jComboBoxNombreProductoItemStateChanged

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        agregarProducto();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVentaActionPerformed
        if (jTextFieldTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Agregar producto");
        } else {
            registrarVenta();
            registrarDetalleVenta();
            actualizarStock();
            JOptionPane.showMessageDialog(this, "Compra realizada");
            limpiarFormulario();
            limpiarTabla();
            idVenta();
        }
    }//GEN-LAST:event_jButtonVentaActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limpiarFormulario();
        limpiarTabla();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    void idVenta() {
        String ultimaSerieVenta = detalleVentaDAO.ultimoIdVenta();
        int idVenta = 0;
        if (ultimaSerieVenta == null) {
            jLabelIdVenta.setText("000001");
        } else {
            idVenta = Integer.parseInt(ultimaSerieVenta);
            jLabelIdVenta.setText("00000" + (idVenta + 1));
        }
    }

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
                    centrarVentana(clienteForm);
                }
            } else {
                jTextFieldCliente.setText(cliente.getNombre_cliente());
                jButtonBuscarProducto.requestFocus();
            }
        }
    }

    void buscarProducto() {
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
                    centrarVentana(productoForm);
                }
            }
        }
    }

    void agregarProducto() {
        double subTotal = 0;
        ArrayList lista = new ArrayList();
        defaultTableModel = (DefaultTableModel) jTableDetalleVenta.getModel();

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
            if (cantidad > 0) {
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
                    jTableDetalleVenta.setModel(defaultTableModel);
                    totalVenta();
                } else {
                    JOptionPane.showMessageDialog(this, "No hay stock");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Escoger cantidad");
            }
        }
    }

    void totalVenta() {
        double total = 0;
        int cantidad_venta = 0;
        double precio_producto = 0;
        for (int i = 0; i < jTableDetalleVenta.getRowCount(); i++) {
            cantidad_venta = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 3).toString());
            precio_producto = Double.parseDouble(jTableDetalleVenta.getValueAt(i, 4).toString());
            total = total + (cantidad_venta * precio_producto);
        }
        jTextFieldTotal.setText("" + total);
    }

    void registrarDetalleVenta() {
        int venta_id_venta = Integer.parseInt(detalleVentaDAO.ultimoIdVenta());
        int cantidad_venta;
        int producto_id_producto;
        double subtotal_venta;
        for (int i = 0; i < jTableDetalleVenta.getRowCount(); i++) {
            cantidad_venta = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 3).toString());
            producto_id_producto = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 1).toString());
            subtotal_venta = Double.parseDouble(jTableDetalleVenta.getValueAt(i, 5).toString());
            detalleVenta.setVenta_id_venta(venta_id_venta);
            detalleVenta.setCantidad_venta(cantidad_venta);
            detalleVenta.setProducto_id_producto(producto_id_producto);
            detalleVenta.setSubtotal_venta(subtotal_venta);
            detalleVentaDAO.registrarDetalleVenta(detalleVenta);
        }
    }

    void registrarVenta() {
        String fecha_venta = jTextFieldFecha.getText();
        double total_venta = Double.parseDouble(jTextFieldTotal.getText());
        String estado_venta = "1";
        int id_cliente = cliente.getId_cliente();
        int id_vendedor = Integer.parseInt(jTextFieldVendedor.getText());

        venta.setFecha_venta(fecha_venta);
        venta.setTotal_venta(total_venta);
        venta.setEstado_venta(estado_venta);
        venta.setCliente_id_cliente(id_cliente);
        venta.setVendedor_id_vendedor(id_vendedor);
        ventaDAO.registrarVenta(venta);
    }

    void actualizarStock() {
        int id_producto;
        int cantidad_venta;
        int stock_producto;
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            id_producto = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 1).toString());
            cantidad_venta = Integer.parseInt(jTableDetalleVenta.getValueAt(i, 3).toString());
            producto = productoDAO.buscarProductoId(id_producto);
            stock_producto = producto.getStock_producto() - cantidad_venta;
            productoDAO.actualizarStock(stock_producto, id_producto);
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
        jTextFieldTotal.setText("");
    }

    void centrarVentana(JInternalFrame form) {
        PrincipalForm.jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = PrincipalForm.jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width) / 2, (dimensionPrincipal.height - dimensionVentasForm.height) / 2);
        form.show();
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
    private javax.swing.JLabel jLabelIdVenta;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JPanel jPanelDetalleVenta;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelRegistrarVenta;
    private javax.swing.JPanel jPanelTitulo;
    private javax.swing.JScrollPane jScrollPaneDetalleVenta;
    private javax.swing.JSpinner jSpinnerCantidad;
    private javax.swing.JTable jTableDetalleVenta;
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
