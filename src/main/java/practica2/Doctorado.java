package practica2;

public class Doctorado extends  Student{
    private String nombre ;
    Doctorado(String nombre){
        this.nombre =nombre;
    }
    public int Grado(){
        return notaBase + 2;
    }
}
