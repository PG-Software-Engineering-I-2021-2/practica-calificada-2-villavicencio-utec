package practica2;

abstract public  class Teacher {
    int salarioBaseMensual =2000;
    int comision = 500;
    int bonus = 100;
    String nombre ;
    abstract int Sueldo() ;
    Teacher(String nombre){
        this.nombre = nombre;
    }
}





