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

    /*
    public String getNombreVendedor(){
        return nombre;
    }

    public void setNombreVendedor(String nombre){
        this.nombre=nombre;

    }
    public int getSalariobaseVendedor(){
        return salariobase;
    }

    public void setSalariobaseVendedor(int salariobase) {
        this.salariobase = salariobase;
    }

    public void AñadirVenta(int venta) {
        ventasList.add(i, venta);
        i=i+1;
    }
    public double DameSalario(){

        int t= ventasList.size();
        for (int j=0; j<t; j++){
            salario= (ventasList.get(j))+salario;


        }
        salario= salariobase+salariobase;
        return salario;
    }
*/
    @Override
    double setSalario(double salario) {

        double ingresosventas = 0;
        int n = listaVentas.size() - 1;

        for (int i = n; i < listaVentas.size(); i++) {

            ingresosventas += listaVentas.get(i).ingreso;
        }


        return salario +(ingresosventas);
}





    private double suma(Venta venta){

        double res = 0;
        return res = res + venta.ingreso;
    }


}
