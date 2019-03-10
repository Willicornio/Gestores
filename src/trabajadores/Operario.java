package trabajadores;

public class Operario extends Empleado {



    public Operario(String id, String nombre, String apellido, double salario) {

        this.nombre = nombre;
        this.salario = setSalario(salario);
        this.apellido = apellido;
        this.salario = salario;

        this.id = nombre + apellido + "_" + id;
    }

    public double getSalario() {

        return this.salario;
    }
    public double setSalario(double salario) {
        return  salario;


    }




}

