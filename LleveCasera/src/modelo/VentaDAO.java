package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VentaDAO {

    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;

    public int registrarVenta(Venta venta) {
        int respuesta = 0;
        String sql = "insert into venta (fecha_venta, total_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values (?, ?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, venta.getFecha_venta());
            ps.setDouble(2, venta.getTotal_venta());
            ps.setString(3, venta.getEstado_venta());
            ps.setInt(4, venta.getCliente_id_cliente());
            ps.setInt(5, venta.getVendedor_id_vendedor());
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }

}
