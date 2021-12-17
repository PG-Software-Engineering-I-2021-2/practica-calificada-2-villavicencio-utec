package practica2;

public class Pregado extends  Student{
    private String nombre ;
    Pregado(String nombre){
        this.nombre =nombre;
    }
    public int Grado(){
        return notaBase;
    }
}
