package trabajadores;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado {

    int idventas = 0;
    List<Venta> listaVentas;


    public Vendedor(String id, String nombre, String apellido, double salario) {

        this.listaVentas = new ArrayList<>();
        this.nombre = nombre;
        this.salario = salario;
        this.apellido = apellido;

        this.id = nombre + apellido + "_" + id;


    }

    public void añadirVenta(Venta v) {

        this.listaVentas.add(idventas, v);
        idventas++;


    }

    @Override
    double setSalario(double salario) {

        double ingresosventas = 0;
        int n = listaVentas.size() - 1;

        for (int i = n; i < listaVentas.size(); i++) {

            ingresosventas += listaVentas.get(i).ingreso;
        }


        salario = salario +(ingresosventas);
        return  salario;
}

double getSalario (){
        return this.salario;
}



    private double suma(Venta venta){

        double res = 0;
        return res = res + venta.ingreso;
    }


}
