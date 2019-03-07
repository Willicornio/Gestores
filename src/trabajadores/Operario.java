package trabajadores;

public class Operario extends Empleado {



    public Operario(String id, String nombre, String apellido, double salario) {

        this.nombre = nombre;
        this.salario = setSalario(salario);
        this.apellido = apellido;

        this.id = nombre + apellido + "_" + id;
    }


    public double setSalario(double salario) {
        return  salario;

    }




}

