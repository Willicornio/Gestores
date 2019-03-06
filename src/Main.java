import java.util.Hashtable;
import trabajadores.*;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
/**
        Hashtable<String, String> contenedor = new Hashtable<String, String>();
        contenedor.put("101", "harry");
        contenedor.put("192", "potter");
        System.out.println((contenedor.get("101")));
*/
       Vendedor senor1 = new Vendedor();
       senor1.setNombre("Antonio");
       senor1.setSalariobase(1500);
       senor1.AñadirVenta(500);
       senor1.AñadirVenta(1000);
       senor1.DameSalario();
System.out.println(senor1.DameSalario());

Gestor jefe = new Gestor();
jefe.setNombre("Jefe");
jefe.setSalariobase(3000);
jefe.añadirOperario("Manuel", 3000);
jefe.añadirOperario("Manuel2",1500);
jefe.damesalario1();
System.out.println(jefe.damesalario1());
Vendedor manuel=new Vendedor("Manu", 1400);
manuel.AñadirVenta(5000);
manuel.AñadirVenta(200);
jefe.añadirVendedores("jose",1000);
jefe.ponventas(1500, "jose");
jefe.añadirVendedores("estropajo", 2000);
jefe.ponventas(500, "jose");
jefe.ponventas(100000,"estropajo");
jefe.damesalario2();
System.out.println(jefe.damesalario2());


    }
}