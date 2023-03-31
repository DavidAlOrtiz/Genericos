package claseGenerica;

public class Animal {
    private String familia;
    private String nombre;

    public Animal(String familia, String nombre) {
        this.familia = familia;
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
