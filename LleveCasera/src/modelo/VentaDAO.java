package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion conexion = new Conexion();
    Connection connection;
    
    public String ultimaSerieVenta(){
        String ultimaSerieVenta = "";
        String sql = "select max(serie_venta) from venta;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ultimaSerieVenta = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return ultimaSerieVenta;
    }
    
    public int guardarVenta(Venta venta) {
        int respuesta = 0;
        String sql = "insert into venta (serie_venta, fecha_venta, monto_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values (?, ?, ?, ?, ?, ?);";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, venta.getSerie_venta());
            ps.setString(2, venta.getFecha_venta());
            ps.setDouble(3, venta.getMonto_venta());
            ps.setString(4, venta.getEstado_venta());
            ps.setInt(5, venta.getCliente_id_cliente());
            ps.setInt(6, venta.getVendedor_id_vendedor());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }
    
}
