package trabajadores;

public class Operario {
    String nombre;
    int salario;

    public Operario(){
    }
public Operario(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
}

public String getNombre(){
        return nombre;

}
public void setNombre (String nombre){
        this.nombre=nombre;
}
public int getSalario(){
        return salario;

}
public void setSalario(int salario){
        this.salario = salario;

}

}
