package practica;

public class ProfesorTC extends  Teacher{
    ProfesorTC(String nombre){
        super(nombre);
    }
    public int sueldo(){
        return salarioBaseMensual- comision;
    }
}
