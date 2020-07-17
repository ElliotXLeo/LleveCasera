package vista;

public class ReporteVenta extends javax.swing.JInternalFrame {

    public ReporteVenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelReporteVenta = new javax.swing.JPanel();
        jScrollPaneReporteVenta = new javax.swing.JScrollPane();
        jTextAreaReporteVenta = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanelReporteVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextAreaReporteVenta.setColumns(20);
        jTextAreaReporteVenta.setRows(5);
        jScrollPaneReporteVenta.setViewportView(jTextAreaReporteVenta);

        javax.swing.GroupLayout jPanelReporteVentaLayout = new javax.swing.GroupLayout(jPanelReporteVenta);
        jPanelReporteVenta.setLayout(jPanelReporteVentaLayout);
        jPanelReporteVentaLayout.setHorizontalGroup(
            jPanelReporteVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReporteVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelReporteVentaLayout.setVerticalGroup(
            jPanelReporteVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReporteVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelReporteVenta;
    private javax.swing.JScrollPane jScrollPaneReporteVenta;
    private javax.swing.JTextArea jTextAreaReporteVenta;
    // End of variables declaration//GEN-END:variables
}
