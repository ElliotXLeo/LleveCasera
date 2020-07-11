package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion conexion = new Conexion();
    Connection connection;
    
    public Cliente buscarCliente(String dni) {
        Cliente cliente=new Cliente();
        String sql = "select * from cliente where dni_cliente = ?;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                cliente.setId_cliente(rs.getInt(1));
                cliente.setDni_cliente(rs.getString(2));
                cliente.setNombre_cliente(rs.getString(3));
                cliente.setCelular_cliente(rs.getString(4));
                cliente.setEstado_cliente(rs.getString(5));
            }
        } catch (Exception e) {
        }
        return cliente;
    }
    
    @Override
    public int agregar(Object[] object) {
        int respuesta = 0;
        String sql = "insert into cliente (dni_cliente, nombre_cliente, celular_cliente, estado_cliente) values (?, ?, ?, ?);";
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
        List<Cliente> lista = new ArrayList<>();
        String sql = "select * from cliente;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente=new Cliente();
                cliente.setId_cliente(rs.getInt(1));
                cliente.setDni_cliente(rs.getString(2));
                cliente.setNombre_cliente(rs.getString(3));
                cliente.setCelular_cliente(rs.getString(4));
                cliente.setEstado_cliente(rs.getString(5));
                lista.add(cliente);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public int actualizar(Object[] object) {
        int respuesta = 0;
        String sql = "update cliente set dni_cliente=?, nombre_cliente=?, celular_cliente=?, estado_cliente=? where id_cliente=?;";
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
        String sql = "delete from cliente where id_cliente = ?;";
        try {
            connection = conexion.Conectar();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
}
