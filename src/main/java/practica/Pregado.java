package practica;

public class Pregado extends  Student{
    private String nombre ;
    Pregado(String nombre){
        this.nombre =nombre;
    }
    public int Grado(){
        return notaBase;
    }
}
