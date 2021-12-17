package practica2;

public class ProfesorTP extends  Teacher{
    ProfesorTP(String nombre){
        super(nombre);
    }
    public int Sueldo(){
        return salarioBaseMensual;
    }
}
