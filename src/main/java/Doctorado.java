public class Doctorado extends  Student{
    private String _Nombre ;
    Doctorado(String nombre){
        this._Nombre =nombre;
    }
    public int Grado(){
        return notaBase + 2;
    }
}
