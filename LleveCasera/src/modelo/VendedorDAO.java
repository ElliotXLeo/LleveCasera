package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion conexion = new Conexion();
    Connection connection;
    
    public Vendedor IniciarSesion(String user, String dni){
        Vendedor entidadVendedor=new Vendedor();
        String sql = "select * from vendedor where user_vendedor = ? and dni_vendedor = ?;";
        try {
            connection = conexion.Conectar();
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
}
