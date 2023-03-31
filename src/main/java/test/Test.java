package test;

import java.util.List;
import mx.dva.dortiz.poointinterface.modelo.Cliente;
import mx.dva.dortiz.poointinterface.repositori.AbstractClienteListRepositorio;
import mx.dva.dortiz.poointinterface.repositori.ClienteListRepositorio;
import mx.dva.dortiz.poointinterface.repositori.CrudRepositorio;
import mx.dva.dortiz.poointinterface.repositori.Direccion;
import mx.dva.dortiz.poointinterface.repositori.FullInterfacas;


public class Test {
    public static void main(String[] args) {
        FullInterfacas repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Juan", "Luis"));
        repo.crear(new Cliente("Otro", "nuevo"));
        repo.crear(new Cliente("Alan", "como siempre"));
        repo.crear(new Cliente("AlanB", "como siempre"));
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===Paginado====");
        List<Cliente> paginable = repo.listar(0, 2);
        paginable.forEach(System.out::println);
        System.out.println("====Ordenar==========");
        List<Cliente> cliente = repo.listar("nombre", Direccion.DESC);
        cliente.forEach(System.out::println);
        System.out.println("Editar========");
        Cliente clienteActualizado = new Cliente("Modificado", "Modificado2");
        clienteActualizado.setId(1);
        repo.editar(clienteActualizado);
        Cliente actualizado =  (Cliente) repo.porID(1);
        System.out.println("actualizado = " + actualizado);
        cliente.forEach(System.out::println);
    }
}
