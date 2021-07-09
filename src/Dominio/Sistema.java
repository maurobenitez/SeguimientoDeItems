package Dominio;
import java.util.*;

public class Sistema {
    private ArrayList<Proyecto> proyectos=new ArrayList();
    private ArrayList<Tipo> tipos=new ArrayList();
    private ArrayList<Empleado> empleados=new ArrayList();
    
    private static Sistema sistema=null;

    private Sistema(){
        DataLoad dataLoad=DataLoad.getInstance();
        dataLoad.setProyectos(proyectos);
        dataLoad.setTipos(tipos);
        dataLoad.setEmpleado(empleados);
        dataLoad.cargar();
    }
    public static Sistema getInstance(){
        if (sistema==null) sistema=new Sistema();
        return sistema;
    }

    public void addProyecto(Proyecto proyecto){
        proyectos.add(proyecto);        
    }

    public void removeProyecto(Proyecto proyecto){
        proyectos.remove(proyecto);
    }
    
    public ArrayList getTipos(){
        return tipos;
    }
    
    public ArrayList getProyectos(){
        return proyectos;
    }

    public void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void removeEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }
}