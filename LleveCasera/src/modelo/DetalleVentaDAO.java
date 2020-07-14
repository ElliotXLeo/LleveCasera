package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DetalleVentaDAO {

    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;

    public String ultimoIdVenta() {
        String ultimaSerieVenta = "";
        String sql = "select max(id_venta) from venta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ultimaSerieVenta = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return ultimaSerieVenta;
    }

    public int registrarDetalleVenta(DetalleVenta detalleVenta) {
        int respuesta = 0;
        String sql = "insert into detalle_venta (cantidad_venta, subtotal_venta, venta_id_venta, producto_id_producto) values (?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, detalleVenta.getCantidad_venta());
            ps.setDouble(2, detalleVenta.getSubtotal_venta());
            ps.setInt(3, detalleVenta.getVenta_id_venta());
            ps.setInt(4, detalleVenta.getProducto_id_producto());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }
}
