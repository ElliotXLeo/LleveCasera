package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Vendedor;
import modelo.VendedorDAO;

public class VendedorForm extends javax.swing.JInternalFrame {

    VendedorDAO vendedorDAO = new VendedorDAO();
    Vendedor vendedor = new Vendedor();

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    int id;

    public VendedorForm() {
        initComponents();
        listarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCelular = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCelular = new javax.swing.JTextField();
        jComboBoxEstado = new javax.swing.JComboBox<>();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jPanelTabla = new javax.swing.JPanel();
        jScrollPaneTabla = new javax.swing.JScrollPane();
        jTableVenvedor = new javax.swing.JTable();

        setTitle("Vendedor");

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelDNI.setText("DNI");

        jLabelNombre.setText("Nombre");

        jLabelCelular.setText("Celular");

        jLabelEstado.setText("Estado");

        jLabelUsuario.setText("Usuario");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "0" }));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

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
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelDNI)
                    .addComponent(jLabelCelular)
                    .addComponent(jLabelEstado)
                    .addComponent(jLabelUsuario))
                .addGap(27, 27, 27)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsuario)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFormularioLayout.setVerticalGroup(
            jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormularioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jLabelDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonActualizar)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jLabelCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpiar)
                    .addComponent(jLabelEstado)
                    .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableVenvedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "Nombre", "Celular", "Estado", "Usuario"
            }
        ));
        jTableVenvedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableVenvedorMouseClicked(evt);
            }
        });
        jScrollPaneTabla.setViewportView(jTableVenvedor);

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelTablaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
            .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTablaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPaneTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTableVenvedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableVenvedorMouseClicked
        int fila = jTableVenvedor.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            id = Integer.parseInt(jTableVenvedor.getValueAt(fila, 0).toString());
            String dni_vendedor = jTableVenvedor.getValueAt(fila, 1).toString();
            String nombre_vendedor = jTableVenvedor.getValueAt(fila, 2).toString();
            String celular_vendedor = jTableVenvedor.getValueAt(fila, 3).toString();
            String estado_vendedor = jTableVenvedor.getValueAt(fila, 4).toString();
            String user_vendedor = jTableVenvedor.getValueAt(fila, 5).toString();
            jTextFieldDNI.setText(dni_vendedor);
            jTextFieldNombre.setText(nombre_vendedor);
            jTextFieldCelular.setText(celular_vendedor);
            jComboBoxEstado.setSelectedItem(estado_vendedor);
            jTextFieldUsuario.setText(user_vendedor);
        }
    }//GEN-LAST:event_jTableVenvedorMouseClicked

    void agregar() {
        String dni_vendedor = jTextFieldDNI.getText();
        String nombre_vendedor = jTextFieldNombre.getText();
        String celular_vendedor = jTextFieldCelular.getText();
        String estado_vendedor = jComboBoxEstado.getSelectedItem().toString();
        String user_vendedor = jTextFieldUsuario.getText();
        if (dni_vendedor.equals("") || nombre_vendedor.equals("") || celular_vendedor.equals("") || user_vendedor.equals("")) {
            JOptionPane.showMessageDialog(this, "Falta completar");
        } else {
            Object[] object = new Object[5];
            object[0] = dni_vendedor;
            object[1] = nombre_vendedor;
            object[2] = celular_vendedor;
            object[3] = estado_vendedor;
            object[4] = user_vendedor;
            vendedorDAO.agregar(object);
        }
    }

    void listarTabla() {
        List<Vendedor> lista = vendedorDAO.listar();
        defaultTableModel = (DefaultTableModel) jTableVenvedor.getModel();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_vendedor();
            object[1] = lista.get(i).getDni_vendedor();
            object[2] = lista.get(i).getNombre_vendedor();
            object[3] = lista.get(i).getCelular_vendedor();
            object[4] = lista.get(i).getEstado_vendedor();
            object[5] = lista.get(i).getUser_vendedor();
            defaultTableModel.addRow(object);
        }
        jTableVenvedor.setModel(defaultTableModel);
    }

    void actualizar() {
        int fila = jTableVenvedor.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            String dni_vendedor = jTextFieldDNI.getText();
            String nombre_vendedor = jTextFieldNombre.getText();
            String celular_vendedor = jTextFieldCelular.getText();
            String estado_vendedor = jComboBoxEstado.getSelectedItem().toString();
            String user_vendedor = jTextFieldUsuario.getText();
            Object[] object = new Object[6];
            object[0] = dni_vendedor;
            object[1] = nombre_vendedor;
            object[2] = celular_vendedor;
            object[3] = estado_vendedor;
            object[4] = user_vendedor;
            object[5] = id;
            vendedorDAO.actualizar(object);
        }
    }

    void eliminar() {
        int fila = jTableVenvedor.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            vendedorDAO.eliminar(id);
        }
    }

    void limpiarFormulario() {
        jTextFieldDNI.setText("");
        jTextFieldNombre.setText("");
        jTextFieldCelular.setText("");
        jComboBoxEstado.setSelectedIndex(0);
        jTextFieldUsuario.setText("");
        jTextFieldDNI.requestFocus();
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
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JScrollPane jScrollPaneTabla;
    private javax.swing.JTable jTableVenvedor;
    private javax.swing.JTextField jTextFieldCelular;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
