package mx.dva.dortiz.poointinterface.repositori;

import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.Cliente;

public interface CrudRepositorio<T> {
    List<T> listar();
    T porID(Integer id);
    void crear(T t);
    void editar(T t);
    void eliminar(Integer id);
}
