package practica;

public class ProfesorTC extends  Teacher{
    ProfesorTC(String nombre){
        super(nombre);
    }
    public int Sueldo(){
        return salarioBaseMensual- comision;
    }
}
