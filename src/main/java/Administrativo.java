public class Administrativo extends  Teacher{
    Administrativo(String nombre){
        super(nombre);
    }
    public int Sueldo(){
        return salarioBaseMensual+ bonus;
    }
}
