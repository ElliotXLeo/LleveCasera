package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Venta;
import modelo.VentaDAO;

public class VentaForm extends javax.swing.JInternalFrame {

    VentaDAO ventaDAO = new VentaDAO();
    Venta venta = new Venta();

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int id;

    public VentaForm() {
        initComponents();
        listarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTotal = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelVendedor = new javax.swing.JLabel();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldCliente = new javax.swing.JTextField();
        jTextFieldVendedor = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelVenta = new javax.swing.JPanel();
        jScrollPaneVenta = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Venta");

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelFecha.setText("Fecha");

        jLabelTotal.setText("Total");

        jLabelEstado.setText("Estado");

        jLabelCliente.setText("Cliente");

        jLabelVendedor.setText("Vendedor");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/add.png"))); // NOI18N
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/actualizar.png"))); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/salir.png"))); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/cancelar.png"))); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormularioLayout = new javax.swing.GroupLayout(jPanelFormulario);
        jPanelFormulario.setLayout(jPanelFormularioLayout);
        jPanelFormularioLayout.setHorizontalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTotal)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelCliente)
                    .addComponent(jLabelVendedor))
                .addGap(27, 27, 27)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, 300, Short.MAX_VALUE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jLabelFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jLabelCliente)
                    .addComponent(jTextFieldCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha", "Total", "Estado", "Cliente", "Vendedor"
            }
        ));
        jTableVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVentaMouseClicked(evt);
            }
        });
        jScrollPaneVenta.setViewportView(jTableVenta);

        javax.swing.GroupLayout jPanelVentaLayout = new javax.swing.GroupLayout(jPanelVenta);
        jPanelVenta.setLayout(jPanelVentaLayout);
        jPanelVentaLayout.setHorizontalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVentaLayout.setVerticalGroup(
            jPanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        agregar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiarTabla();
        listarTabla();
        limpiarFormulario();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTableVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVentaMouseClicked
        int fila = jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableVenta.getValueAt(fila, 0).toString());
            String fecha_venta = jTableVenta.getValueAt(fila, 1).toString();
            String total_venta = jTableVenta.getValueAt(fila, 2).toString();
            String estado_venta = jTableVenta.getValueAt(fila, 3).toString();
            String cliente_id_cliente = jTableVenta.getValueAt(fila, 4).toString();
            String vendedor_id_vendedor = jTableVenta.getValueAt(fila, 5).toString();
            jTextFieldFecha.setText(fecha_venta);
            jTextFieldTotal.setText(total_venta);
            jComboBoxEstado.setSelectedItem(estado_venta);
            jTextFieldCliente.setText(cliente_id_cliente);
            jTextFieldVendedor.setText(vendedor_id_vendedor);
        }
    }//GEN-LAST:event_jTableVentaMouseClicked

    void agregar() {
        String fecha_venta = jTextFieldFecha.getText();
        String total_venta = jTextFieldTotal.getText();
        String estado_venta = jComboBoxEstado.getSelectedItem().toString();
        String cliente_id_cliente = jTextFieldCliente.getText();
        String vendedor_id_vendedor = jTextFieldVendedor.getText();
        if (fecha_venta.equals("") || total_venta.equals("") || cliente_id_cliente.equals("") || vendedor_id_vendedor.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar");
        } else {
            Object[] object = new Object[5];
            object[0] = fecha_venta;
            object[1] = total_venta;
            object[2] = estado_venta;
            object[3] = cliente_id_cliente;
            object[4] = vendedor_id_vendedor;
            ventaDAO.agregar(object);
        }
    }

    void listarTabla() {
        List<Venta> lista = ventaDAO.listar();
        defaultTableModel = (DefaultTableModel) jTableVenta.getModel();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_venta();
            object[1] = lista.get(i).getFecha_venta();
            object[2] = lista.get(i).getTotal_venta();
            object[3] = lista.get(i).getEstado_venta();
            object[4] = lista.get(i).getCliente_id_cliente();
            object[5] = lista.get(i).getVendedor_id_vendedor();
            defaultTableModel.addRow(object);
        }
        jTableVenta.setModel(defaultTableModel);
    }

    void actualizar() {
        int fila = jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String fecha_venta = jTextFieldFecha.getText();
            String total_venta = jTextFieldTotal.getText();
            String estado_venta = jComboBoxEstado.getSelectedItem().toString();
            String cliente_id_cliente = jTextFieldCliente.getText();
            String vendedor_id_vendedor = jTextFieldVendedor.getText();
            Object[] object = new Object[6];
            object[0] = fecha_venta;
            object[1] = total_venta;
            object[2] = estado_venta;
            object[3] = cliente_id_cliente;
            object[4] = vendedor_id_vendedor;
            object[5] = id;
            ventaDAO.actualizar(object);
        }
    }

    void eliminar() {
        int fila = jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            ventaDAO.eliminar(id);
        }
    }

    void limpiarFormulario() {
        jTextFieldFecha.setText("");
        jTextFieldTotal.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldCliente.setText("");
        jTextFieldVendedor.setText("");
        jTextFieldFecha.requestFocus();
    }

    void limpiarTabla() {
        for (int i = (defaultTableModel.getRowCount() - 1); i >= 0; i--) {
            defaultTableModel.removeRow(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxEstado;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelVendedor;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelVenta;
    private javax.swing.JScrollPane jScrollPaneVenta;
    private javax.swing.JTable jTableVenta;
    private javax.swing.JTextField jTextFieldCliente;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldVendedor;
    // End of variables declaration//GEN-END:variables
}
