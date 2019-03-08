package trabajadores;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Gestor extends Empleado {

    int i = 0;
    int j = 0;
    public List<Subordinado> listaSubordinados;
    int numeroSub=0;

    public Gestor(String id, String nombre, String apellido, double salario) {

        this.nombre = nombre;
        this.salario = salario;
        this.apellido = apellido;
        this.listaSubordinados = new ArrayList<>();

        this.id = nombre + apellido + "_" + id;

    }
    public double setSalario(double salario){
        return salario;
    }
    @Override
    /* double setSalario(double salario) {

        double ingresossubordinados = 0;
        int n = listaSubordinados.size();
        String idsub = null;

        for (int i = 0; i < n; i++) {

            listaSubordinados.get(i).idsubordinado = idsub;




        }


        salario = salario +(ingresosventas);
        return 0;
    }
*/
    double getSalario() {
        return this.salario;
    }

    public void añadirSubordinado(Subordinado sub) {

        this.listaSubordinados.add(numeroSub,sub);
        numeroSub = numeroSub +1;

    }
}

/*
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getSalariobase(){
        return salariobase;
    }
    public void setSalariobase(int salariobase){
        this.salariobase=salariobase;
    }






    public ArrayList<Vendedor> ListaVendedores = new ArrayList<Vendedor>();
    public ArrayList<Operario> ListaOperarios = new ArrayList<Operario>();

    public void añadirVendedores(String name, int dinero){
        ListaVendedores.add(i, new Vendedor(name, dinero));
        i=i+1;
    }
    public void añadirOperario (String name, int dinero){
        ListaOperarios.add(j, new Operario(name, dinero));
        j=j+1;
    }





public double damesalario1(){
    int t= ListaOperarios.size();
    for (int j=0; j<t; j++){
       salario = ListaOperarios.get(j).getSalario();
       salario=salario+salario;
    }
    salario= salariobase+salariobase;
    return salario;
}


public void ponventas(int venta, String nombrevendedor){
        int t= ListaVendedores.size();
        int u = 0;
        for (int j=0    ; j<t; j++){
            if (ListaVendedores.get(j).getNombreVendedor()== nombrevendedor) {
                ListaVendedores.get(j).AñadirVenta(venta);
                u = 1;
            }
            }
            if(u==0){System.out.println("No existe ese vendedor");}

        }



    public double damesalario2(){
        int t= ListaVendedores.size();
        for (int j=0; j<t; j++){
            salario = ListaVendedores.get(j).DameSalario();
            salario=salario+salario;
        }
        salario= salariobase+salariobase;
        return salario;
    }

*/


