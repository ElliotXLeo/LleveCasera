package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;

    Conexion conexion = new Conexion();
    Connection connection;

    public Vendedor iniciarSesion(String user, String dni) {
        Vendedor entidadVendedor = new Vendedor();
        String sql = "select * from vendedor where user_vendedor = ? and dni_vendedor = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                entidadVendedor.setId_vendedor(rs.getInt(1));
                entidadVendedor.setDni_vendedor(rs.getString(2));
                entidadVendedor.setNombre_vendedor(rs.getString(3));
                entidadVendedor.setCelular_vendedor(rs.getString(4));
                entidadVendedor.setEstado_vendedor(rs.getString(5));
                entidadVendedor.setUser_vendedor(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return entidadVendedor;
    }

    @Override
    public int agregar(Object[] object) {
        int respuesta = 0;
        String sql = "insert into vendedor(dni_vendedor, nombre_vendedor, celular_vendedor, estado_vendedor, user_vendedor) values (?, ?, ?, ?, ?);";
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
        List<Vendedor> lista = new ArrayList<>();
        String sql = "select * from vendedor;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vendedor vendedor = new Vendedor();
                vendedor.setId_vendedor(rs.getInt(1));
                vendedor.setDni_vendedor(rs.getString(2));
                vendedor.setNombre_vendedor(rs.getString(3));
                vendedor.setCelular_vendedor(rs.getString(4));
                vendedor.setEstado_vendedor(rs.getString(5));
                vendedor.setUser_vendedor(rs.getString(6));
                lista.add(vendedor);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] object) {
        int respuesta = 0;
        String sql = "update vendedor set dni_vendedor=?, nombre_vendedor=?, celular_vendedor=?, estado_vendedor=?, user_vendedor=? where id_vendedor=?;";
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
        String sql = "delete from vendedor where id_vendedor = ?;";
        try {
            connection = conexion.conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

}
