package practica;

public class Maestria extends  Student{
    private String nombre ;
    Maestria(String nombre){
        this.nombre =nombre;
    }
    public int grado(){
        return notaBase + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
