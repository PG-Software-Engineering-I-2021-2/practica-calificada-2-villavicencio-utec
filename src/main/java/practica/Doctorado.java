package practica;

public class Doctorado extends  Student{
    private String nombre ;
    Doctorado(String nombre){
        this.nombre =nombre;
    }
    public int grado(){
        return notaBase + 2;
    }

}
