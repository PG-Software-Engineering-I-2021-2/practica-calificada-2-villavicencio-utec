package practica;

public class ProfesorTP extends  Teacher{
    ProfesorTP(String nombre){
        super(nombre);
    }
    public int sueldo(){
        return salarioBaseMensual;
    }
}
