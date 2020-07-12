package modelo;

import java.util.List;

public interface CRUD {

    public int agregar(Object[] object);

    public List listar();

    public int actualizar(Object[] object);

    public void eliminar(int id);

}
