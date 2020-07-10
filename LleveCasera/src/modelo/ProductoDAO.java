package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion conexion = new Conexion();
    Connection connection;

    @Override
    public int agregar(Object[] object) {
        int respuesta = 0;
        String sql = "insert into producto (nombre_producto, precio_producto, stock_producto, estado_producto) values (?, ?, ?, ?);";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            ps.setObject(1, object[0]);
            ps.setObject(2, object[1]);
            ps.setObject(3, object[2]);
            ps.setObject(4, object[3]);
            respuesta = ps.executeUpdate();
        } catch (Exception e) {
        }
        return respuesta;
    }

    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto=new Producto();
                producto.setId_producto(rs.getInt(1));
                producto.setNombre_producto(rs.getString(2));
                producto.setPrecio_producto(rs.getDouble(3));
                producto.setStock_producto(rs.getInt(4));
                producto.setEstado_producto(rs.getString(5));
                lista.add(producto);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] object) {
        int respuesta = 0;
        String sql = "update producto set nombre_producto=?, precio_producto=?, stock_producto=?, estado_producto=? where id_producto=?;";
        try {
            connection = conexion.Conectar();
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
    public void eliminar(int id) {
        String sql = "delete from producto where id_producto = ?;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
