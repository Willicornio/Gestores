package trabajadores;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
   private String nombre;
   private int salariobase;
    double salario;
    List<Integer> ventasList = new ArrayList<Integer>();
    int venta;
    int i = 0;

    public Vendedor(){
    }

    public Vendedor(String nombre, int salariobase){
        this.nombre=nombre;
        this.salariobase=salariobase;

    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public int getSalariobase(){
        return salariobase;
    }

    public void setSalariobase(int salariobase) {
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
}
