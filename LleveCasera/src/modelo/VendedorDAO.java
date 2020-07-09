package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VendedorDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public EntidadVendedor ValidarVendedor(String user, String dni){
        EntidadVendedor ev=new EntidadVendedor();
        String sql = "select * from vendedor where user_vendedor = ? and dni_vendedor = ?";
        try {
            acceso = con.Conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs = ps.executeQuery();
            while (rs.next()) {
                ev.setId_vendedor(rs.getInt(1));
                ev.setDni_vendedor(rs.getString(2));
                ev.setNombre_vendedor(rs.getString(3));
                ev.setCelular_vendedor(rs.getString(4));
                ev.setEstado_vendedor(rs.getString(5));
                ev.setUser_vendedor(rs.getString(6));
            }
        } catch (Exception e) {
        }
        return ev;
    }
}
