package claseGenerica;

import java.util.List;

public class EjmploGenericos {
    public static void main(String[] args) {
        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Caballos", "Juan"));
        transporteCaballos.add(new Animal("caballo2", "Juan2"));
        transporteCaballos.add(new Animal("caballo3", "Juan3"));
        imprimir(transporteCaballos);
        
        Camion<Automovil> transporteAuto = new Camion<Automovil>(2);
        transporteAuto.add(new Automovil("auto1"))
                    .add(new Automovil("Auto3"));
        imprimir(transporteAuto);
        
        Camion<Maquinaria> transporteMaqui = new Camion<Maquinaria>(5);
        transporteMaqui.add(new Maquinaria("Carga"))
                       .add(new Maquinaria("Grua"))
                       .add(new Maquinaria("CR7"));
        imprimir(transporteMaqui);
    }
    public static <T> void  imprimir(Camion<T> camion){
        for(T a: camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " " + ((Animal)a).getFamilia());
            }else if(a instanceof Automovil){
                System.out.println(((Automovil)a).getMarca());
            }else if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
        }
    }
    
    public <T> int generico(List<T> a){
       a.forEach(System.out::println);
       return 1;
    } 
}
