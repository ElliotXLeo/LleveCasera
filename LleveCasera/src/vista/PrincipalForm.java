package vista;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class PrincipalForm extends javax.swing.JFrame {

    public PrincipalForm() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuMenu = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuVenta = new javax.swing.JMenu();
        jMenuItemRegistrar = new javax.swing.JMenuItem();
        jMenuMantenimiento = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemProducto = new javax.swing.JMenuItem();
        jMenuItemVendedor = new javax.swing.JMenuItem();
        jMenuReporte = new javax.swing.JMenu();
        jMenuItemVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lleve Casera");

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 231, Short.MAX_VALUE)
        );

        jMenuMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/home.png"))); // NOI18N
        jMenuMenu.setText("Menu");

        jMenuItemAyuda.setText("Ayuda");
        jMenuMenu.add(jMenuItemAyuda);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuMenu.add(jMenuItemSalir);

        jMenuBarMenu.add(jMenuMenu);

        jMenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logoventas.png"))); // NOI18N
        jMenuVenta.setText("Venta");

        jMenuItemRegistrar.setText("Registrar");
        jMenuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarActionPerformed(evt);
            }
        });
        jMenuVenta.add(jMenuItemRegistrar);

        jMenuBarMenu.add(jMenuVenta);

        jMenuMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/logomantenimiento.png"))); // NOI18N
        jMenuMantenimiento.setText("Mantenimiento");

        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemCliente);

        jMenuItemProducto.setText("Producto");
        jMenuItemProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductoActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemProducto);

        jMenuItemVendedor.setText("Vendedor");
        jMenuItemVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendedorActionPerformed(evt);
            }
        });
        jMenuMantenimiento.add(jMenuItemVendedor);

        jMenuBarMenu.add(jMenuMantenimiento);

        jMenuReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/img/reportes.png"))); // NOI18N
        jMenuReporte.setText("Reporte");

        jMenuItemVenta.setText("Venta");
        jMenuReporte.add(jMenuItemVenta);

        jMenuBarMenu.add(jMenuReporte);

        setJMenuBar(jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarActionPerformed
        VentaForm ventasForm = new VentaForm();
        CentrarVentana(ventasForm);
    }//GEN-LAST:event_jMenuItemRegistrarActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        ClienteForm clienteForm = new ClienteForm();
        CentrarVentana(clienteForm);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductoActionPerformed
        ProductoForm productoForm = new ProductoForm();
        CentrarVentana(productoForm);
    }//GEN-LAST:event_jMenuItemProductoActionPerformed

    private void jMenuItemVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendedorActionPerformed
        VendedorForm vendedorForm = new VendedorForm();
        CentrarVentana(vendedorForm);
    }//GEN-LAST:event_jMenuItemVendedorActionPerformed

    void CentrarVentana(JInternalFrame form) {
        jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width) / 2, (dimensionPrincipal.height - dimensionVentasForm.height) / 2);
        form.show();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemProducto;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemVendedor;
    private javax.swing.JMenuItem jMenuItemVenta;
    private javax.swing.JMenu jMenuMantenimiento;
    private javax.swing.JMenu jMenuMenu;
    private javax.swing.JMenu jMenuReporte;
    private javax.swing.JMenu jMenuVenta;
    // End of variables declaration//GEN-END:variables
}
