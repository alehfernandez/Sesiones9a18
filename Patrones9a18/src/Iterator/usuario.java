package Iterator;

public class usuario {
    private String nombre;
    private int edad;

    private Usuario(){}
    public  Usuario (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public  int getEdad(){
        return edad;
    }
}