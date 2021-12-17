package practica;

public class Pregrado extends  Student{
    private String nombre ;
    Pregrado(String nombre){
        this.nombre =nombre;
    }
    public int Grado(){
        return notaBase;
    }
}
