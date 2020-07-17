package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VentaDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;
    
    public int ultimoIdVenta() {
        int ultimaSerieVenta = 0;
        String sql = "select max(id_venta) from venta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ultimaSerieVenta = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return ultimaSerieVenta;
    }
        
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

    @Override
    public int agregar(Object[] object) {
        int respuesta = 0;
        String sql = "insert into venta (fecha_venta, total_venta, estado_venta, cliente_id_cliente, vendedor_id_vendedor) values (?, ?, ?, ?, ?);";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ps.setObject(5, object[4]);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }

    @Override
    public List listar() {
        List<Venta> lista = new ArrayList<>();
        String sql = "select * from venta;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta venta = new Venta();
                venta.setId_venta(rs.getInt(1));
                venta.setFecha_venta(rs.getString(2));
                venta.setTotal_venta(rs.getDouble(3));
                venta.setEstado_venta(rs.getString(4));
                venta.setCliente_id_cliente(rs.getInt(5));
                venta.setVendedor_id_vendedor(rs.getInt(6));
                lista.add(venta);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] object) {
        int respuesta = 0;
        String sql = "update venta set fecha_venta=?, total_venta=?, estado_venta=?, cliente_id_cliente=?, vendedor_id_vendedor=? where id_venta=?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            ps.setObject(5, object[4]);
            ps.setObject(6, object[5]);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from venta where id_venta = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
