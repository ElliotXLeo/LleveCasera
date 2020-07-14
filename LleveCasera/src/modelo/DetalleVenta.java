package modelo;

public class DetalleVenta {

    private int id_detalle_venta;
    private int cantidad_venta;
    private double subtotal_venta;
    private int venta_id_venta;
    private int producto_id_producto;

    public DetalleVenta() {
    }

    public DetalleVenta(int id_detalle_venta, int cantidad_venta, double subtotal_venta, int venta_id_venta, int producto_id_producto) {
        this.id_detalle_venta = id_detalle_venta;
        this.cantidad_venta = cantidad_venta;
        this.subtotal_venta = subtotal_venta;
        this.venta_id_venta = venta_id_venta;
        this.producto_id_producto = producto_id_producto;
    }

    public int getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(int producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }

    public int getId_detalle_venta() {
        return id_detalle_venta;
    }

    public void setId_detalle_venta(int id_detalle_venta) {
        this.id_detalle_venta = id_detalle_venta;
    }

    public int getCantidad_venta() {
        return cantidad_venta;
    }

    public void setCantidad_venta(int cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
    }

    public double getSubtotal_venta() {
        return subtotal_venta;
    }

    public void setSubtotal_venta(double subtotal_venta) {
        this.subtotal_venta = subtotal_venta;
    }

    public int getVenta_id_venta() {
        return venta_id_venta;
    }

    public void setVenta_id_venta(int venta_id_venta) {
        this.venta_id_venta = venta_id_venta;
    }

}
