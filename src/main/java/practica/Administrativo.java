package practica;

public class Administrativo extends  Teacher{
    Administrativo(String nombre){
        super(nombre);
    }
    public int sueldo(){
        return salarioBaseMensual+ bonus;
    }
}
