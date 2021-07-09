package Dominio;

public class Tipo{
    
    private String nombre;
    private Estado estado;
    
    public Tipo(String nombre, Estado estado)
        {this.nombre=nombre;
        this.estado=estado;}

    public String getNombre()
    {return nombre;}

    public Estado getEstado()
        {return estado;}
    
    @Override
    public String toString(){
        return nombre;
    }
}
