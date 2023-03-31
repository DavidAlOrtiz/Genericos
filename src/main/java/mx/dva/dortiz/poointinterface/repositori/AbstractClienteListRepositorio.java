package mx.dva.dortiz.poointinterface.repositori;

import java.util.ArrayList;
import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.BaseEntity;

public abstract class AbstractClienteListRepositorio<T extends BaseEntity> implements FullInterfacas<T>{

    protected List<T> dataSource;

    public AbstractClienteListRepositorio() {
        this.dataSource = new ArrayList<>();
    }
    
    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public T porID(Integer id) {
        T resultado = null;
        for (T cliente : dataSource) {
            if(cliente.getId() != null && cliente.getId().equals(id)){
                resultado = cliente;
                break;
            }
        }
        return resultado; 
    }

    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porID(id));
    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int tamanio() {
        return this.dataSource.size();
    }
    
}
