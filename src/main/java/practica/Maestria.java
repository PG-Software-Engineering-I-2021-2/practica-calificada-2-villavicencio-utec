package practica;

public class Maestria extends  Student{
    private String nombre ;
    Maestria(String nombre){
        this.nombre =nombre;
    }
    public int Grado(){
        return notaBase + 1;
    }
}
