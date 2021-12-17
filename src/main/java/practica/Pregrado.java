package practica;

public class Pregrado extends  Student{
    private String nombre ;
    Pregrado(String nombre){
        this.nombre =nombre;
    }
    public int grado(){
        return notaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
