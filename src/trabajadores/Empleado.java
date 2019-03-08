package trabajadores;

public abstract class  Empleado {

   abstract double setSalario(double salario);

   public String id;
   public String nombre, apellido;
   public double salario;

   abstract double getSalario() ;


}