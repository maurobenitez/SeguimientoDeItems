package Dominio;
import java.util.*;
public class Equipo{

    private ArrayList<Empleado> empleados=new ArrayList();
    private String nombre;
    private ArrayList<Item> items=new ArrayList();
    private Proyecto proyecto;
    private Long id;

    public Equipo(String nombre){
        this.nombre=nombre;
    }

    public void addItem (Item item){
        items.add(item);
        item.setEquipo(this);
    }

    public void removeItem(Item item){
        items.remove(item);
        item.setEquipo(null);
    }
    public void removeEmpleado(Empleado empleado){
        empleados.remove(empleado);
        empleado.setEquipo(null);
    }
    public ArrayList<Empleado> obtenerMiembros(){
        return empleados;
    }

    public ArrayList<Item> obtenerItems(){
        return items;
    }
    
    public void añadirAlEquipo(Empleado empleado){
        empleados.add(empleado);
        empleado.setEquipo(this);
    }

    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    protected void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    
}
