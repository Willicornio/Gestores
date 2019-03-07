package trabajadores;

public class Operario extends Gestor {
    String nombre;
    int salario;

    public Operario() {
    }

    public Operario(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombreO() {
        return nombre;

    }

    public void setNombreO(String nombre) {
        this.nombre = nombre;
    }


    public int getSalario() {
        return salario;

    }

    public void setSalario(int salario) {
        this.salario = salario;

    }


    }

