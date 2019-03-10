package trabajadores;


import java.util.HashMap;


public class SuperGestorImp implements SuperGestor {

    int numempleado = 0;
    public HashMap<String, Empleado> empleados;
    private Object Empleado;

    public SuperGestorImp() {

        this.empleados = new HashMap<String, Empleado>();
    }

    @Override
    public void añadeEmpleado(String nombre, String apellido, String tipo, String id, double salario) {


        switch (tipo) {

            case "gestor":
                Empleado empleadoGestor = new Gestor(id, nombre, apellido, salario);//ejemplo de constructor ("1",adria,navarrete,1000)
                this.empleados.put(empleadoGestor.id, empleadoGestor);
                break;
            case "vendedor":
                Empleado empleadoVendedor = new Vendedor(id, nombre, apellido, salario);//ejemplo de constructor ("1",adria,navarrete,1000)
                this.empleados.put(empleadoVendedor.id, empleadoVendedor);
                break;
            case "operario":
                Empleado empleadoOperario = new Operario(id, nombre, apellido, salario); //ejemplo de constructor ("1",adria,navarrete,1000)
                this.empleados.put(empleadoOperario.id, empleadoOperario);
                System.out.println("Añadido Operario con id " + empleadoOperario.id);
                break;
            default:
                System.out.println("Error, no se ha asignado un tipo de trabajador correcto");
                //Aquí habría que meter algún throw
        }


    }



    public Empleado Buscador (String idsub) {
        Empleado a = (Empleado) this.empleados.get(idsub);
        return a;
    }
/**
        int n = empleados.size();
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (empleados.get(i).id == idsub) {
                Empleado a = (Empleado) this.empleados.get(i);
                return a;
            } else return null;
        }
        return null;


 */


    @Override
    public void nuevaVenta(String idvendedor, double ingreso) {

        Vendedor v = (Vendedor) this.empleados.get(idvendedor);
        Venta ven = new Venta(idvendedor,ingreso);
        v.añadirVenta(ven);

        double newsalario = v.setSalario(v.salario);
        v.salario = newsalario;

        this.empleados.put(idvendedor,v);

    }

    public void nuevoSubordinado(String idgestor, String idsubordinado) {

        Gestor g = (Gestor) this.empleados.get(idgestor);
        Subordinado sub = new Subordinado(idgestor,idsubordinado);
        g.añadirSubordinado(sub);
        SuperGestorImp instancia = new SuperGestorImp();

        double newsalario = g.setSalario(g.salario , instancia);
        g.salario = newsalario;

        this.empleados.put(idgestor,g);

    }







    public String dameNombre (String id){

        return this.empleados.get(id).nombre;

    }

    public double dameSalario (String id){

        return this.empleados.get(id).salario;

    }

    

}
