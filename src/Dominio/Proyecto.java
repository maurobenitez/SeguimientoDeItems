package Dominio;
import java.util.*;

public class Proyecto {
    
    private String nombre;
    private ArrayList<Equipo> equipos=new ArrayList();
    private Empleado lider;

    public Proyecto(String nombre,Empleado lider) {
        this.nombre=nombre;
        this.lider=lider;
    }

    public Empleado getLider() {
        return lider;
    }

    public void setLider(Empleado lider) {
        this.lider = lider;
    }

    public void addEquipo(Equipo equipo){
        equipos.add(equipo);
        equipo.setProyecto(this);
    }
    public void removeEquipo(Equipo equipo){
        equipos.remove(equipo);
        equipo.setProyecto(null);
    }
    public ArrayList<Equipo> getEquipos(){return equipos;}

    public String getNombre() {
        return nombre;
    }
    
    public String toString(){
        return nombre;
    }
}
