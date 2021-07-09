package Dominio;
import java.util.*;

public class Estado {
    
    private String nombre;
    private ArrayList<Estado> estadosSiguientes=new ArrayList();

    public Estado(String nombre) {
            this.nombre=nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    public void añadirSiguiente (Estado estado) {
            estadosSiguientes.add(estado);
    }

    public ArrayList<Estado> obtenerSiguientes(){
            return estadosSiguientes;	
    }

    public String getNombre(){return nombre;}


}
