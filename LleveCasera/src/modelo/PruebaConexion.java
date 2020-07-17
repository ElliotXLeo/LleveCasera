package modelo;

public class PruebaConexion {

    public static void main(String[] args) {
//        String reporteCompra = "";
        Conexion conectorBaseDatos = new Conexion();
        conectorBaseDatos.conectar();
//        reporteCompra += "Código\t\tProducto\t\tCantidad\t\tPrecio\t\tSub Total\n";
//        System.out.println(reporteCompra);
    }
    
}
