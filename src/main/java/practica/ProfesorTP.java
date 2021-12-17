package practica;

public class ProfesorTP extends  Teacher{
    ProfesorTP(String nombre){
        super(nombre);
    }
    public int Sueldo(){
        return salarioBaseMensual;
    }
}
