package mx.dva.dortiz.poointinterface.repositori;

public interface FullInterfacas<T> extends CrudRepositorio<T>, IOrdenableRepositorio<T>,
        IPaginableRepositorio<T>, ITamanioRepositori{
    
}
