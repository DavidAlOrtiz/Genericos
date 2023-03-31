package claseGenerica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T>{
    private List<T> objetos;
    private int maximo;

    public Camion(int maximo) {
        this.maximo = maximo;
        this.objetos = new ArrayList<>();
    }
    
    public Camion add(T obj){
        if(this.objetos.size() <= this.maximo){
            this.objetos.add(obj);
        }else{
            throw new RuntimeException("Lista llena");
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}