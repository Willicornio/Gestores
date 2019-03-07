package trabajadores;


import java.util.HashMap;


public class SuperGestorImp implements SuperGestor {

    int numempleado = 0;
    private HashMap<String, Empleado> empleados;

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

    @Override
    public void nuevaVenta(String idvendedor, double ingreso) {

        Vendedor v = (Vendedor) this.empleados.get(idvendedor);
        Venta ven = new Venta(idvendedor,ingreso);
        v.añadirVenta(ven);

        double newsalario = v.setSalario(v.salario);
        v.salario = newsalario;

        this.empleados.put(idvendedor,v);

    }



    public String dameNombre (String id){

        return this.empleados.get(id).nombre;

    }

    public double dameSalario (String id){

        return this.empleados.get(id).salario;

    }

    public double tamañoLista (Vendedor v){

        double n = 0;
        for (int i = 0; i < v.listaVentas.size() ; i++) {
            n += 1;
        }
        return n;

    }



}
