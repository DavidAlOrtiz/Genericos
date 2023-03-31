package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.Cliente;
import mx.dva.dortiz.poointinterface.modelo.ClientePremiun;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juanito", "Lopez"));
        Cliente juan = clientes.get(0);
        
        Cliente[] clienteArra = {new Cliente("nuevo", "Nuevo dos"),
                new Cliente("nueva", "nueva tres")};
        List<Cliente> listaClientes = fromToList(clienteArra);
        listaClientes.forEach(System.out::println);
        
        Integer[] numerosArray = {1,2,3,4};
        List<Integer> listaNumeros = fromToList(numerosArray);
        listaNumeros.forEach(System.out::println);
        
        String[] nombres = {"juan", "Lopez", "papa"};
        List<String> nombre = fromToList(nombres, numerosArray);
        nombre.forEach(System.out::println);
        
        ClientePremiun[] premiun = {new ClientePremiun("Juan", "Lopez"), 
                new ClientePremiun("Alan", "Lopez")};
        List<ClientePremiun> clientePremium = fromToList(premiun);
        
        datosLista(clientes);
        datosLista(clientePremium);
        datosLista(listaClientes);
    }
    
    public static <T> List<T> fromToList(T[] c){
        return Arrays.asList(c);
    }
    //Boundle generics 
    public static <T extends Number> List<T> fromToLIST(T[] c){
        return Arrays.asList(c);
    }
    public static <T extends Cliente & Comparable<T>> List<T> fromToLIST(T[] c){
        return Arrays.asList(c);
    }
    
    public static <T, G> List<T> fromToList(T[] c, G[] x){
        for(G valores: x){
            System.out.println(valores);
        }
        return Arrays.asList(c);
    }
    
    public static void datosLista(List<? extends  Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
