package mx.dva.dortiz.poointinterface.repositori;

import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.Cliente;

public interface IPaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}
