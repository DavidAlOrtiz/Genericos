package mx.dva.dortiz.poointinterface.repositori;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.sql.DataSource;
import mx.dva.dortiz.poointinterface.modelo.Cliente;

public  class ClienteListRepositorio extends AbstractClienteListRepositorio<Cliente>{


    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porID(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());
    }
    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((a,b) -> {
                int resultado = 0;
                if(dir == Direccion.ASC){
                    switch (campo) {
                        case "id"  ->
                            resultado = a.getId().compareTo(b.getId());
                        case "nombre" ->
                            resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" ->
                            resultado = a.getApellido().compareTo(b.getApellido());
                    }
                }else if(dir == Direccion.DESC){
                    switch (campo) {
                        case "id"  ->
                            resultado = b.getId().compareTo(a.getId());
                        case "nombre" ->
                            resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" ->
                            resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
            } );
        return listaOrdenada;
    }

    @Override
    public int tamanio() {
        return this.dataSource.size();
    }

    
}
