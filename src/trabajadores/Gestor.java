package trabajadores;

public class Gestor {
   private String nombre;
    private int salariobase;

    public Gestor() {

    }

    public Gestor(String nombre, int salariobase) {
        this.nombre = nombre;
        this.salariobase = salariobase;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }


}
