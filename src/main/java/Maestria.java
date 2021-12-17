public class Maestria extends  Student{
    private String _Nombre ;
    Maestria(String nombre){
        this._Nombre =nombre;
    }
    public int Grado(){
        return notaBase + 1;
    }
}
