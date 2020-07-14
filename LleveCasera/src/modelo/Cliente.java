package modelo;

public class Cliente {

    private int id_cliente;
    private String dni_cliente;
    private String nombre_cliente;
    private String celular_cliente;
    private String estado_cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String dni_cliente, String nombre_cliente, String celular_cliente, String estado_cliente) {
        this.id_cliente = id_cliente;
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.celular_cliente = celular_cliente;
        this.estado_cliente = estado_cliente;
    }

    public String getEstado_cliente() {
        return estado_cliente;
    }

    public void setEstado_cliente(String estado_cliente) {
        this.estado_cliente = estado_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }

}
