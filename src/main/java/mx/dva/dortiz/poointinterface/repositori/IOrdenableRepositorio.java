package mx.dva.dortiz.poointinterface.repositori;

import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.Cliente;

public interface IOrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
