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
    }
}