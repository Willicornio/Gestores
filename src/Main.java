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

    SuperGestorImp SuperGestor = new SuperGestorImp();

    SuperGestor.añadeEmpleado("adria","navarrete","vendedor","1",1000);
    SuperGestor.añadeEmpleado("manuel","manuel","operario", "1", 500);
    SuperGestor.nuevaVenta("adrianavarrete_1",200);
    SuperGestor.nuevaVenta("adrianavarrete_1",200);
    SuperGestor.nuevaVenta("adrianavarrete_1",200);
    SuperGestor.añadeEmpleado("guillermo","manterola", "gestor", "jefe", 100);


    SuperGestor.nuevoSubordinado("guillermomanterola_jefe","manuelmanuel_1");




    System.out.println(SuperGestor.dameSalario("jefe"));


    }
}