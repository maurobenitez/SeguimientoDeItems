package Dominio;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 */
public class DataLoad {
    
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Tipo> tipos;
    private static DataLoad dataLoad=null;
    
    public static DataLoad getInstance(){
        if (dataLoad==null) dataLoad=new DataLoad();
        return dataLoad;
    }
    private ArrayList<Empleado> empleados;

    public void setProyectos(ArrayList<Proyecto> proyectos) {
        this.proyectos = proyectos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    private DataLoad(){}
    
    public void cargar() {
        Equipo a=new Equipo("equipo a");
        Equipo b=new Equipo("equipo b");
        Equipo c=new Equipo("equipo c");
        Empleado em1=new Empleado(111l, "Mauro Gabriel", 37533283l,"1234");
        empleados.add(em1);
        Proyecto p1=new Proyecto("Proyecto 1",em1);
        proyectos.add(p1);
        p1.addEquipo(a);
        p1.addEquipo(b);
        p1.addEquipo(c);
        Proyecto p2=new Proyecto("proyecto 2",em1);
        proyectos.add(p2);
        
        Equipo d=new Equipo("equipo d");
        Equipo e=new Equipo("equipo e");
        Equipo f=new Equipo("equipo f");
        p2.addEquipo(d);
        p2.addEquipo(e);
        p2.addEquipo(f);  

        Estado e1=new Estado("creado");
        Estado e2=new Estado("Desarrollo");
        Estado e3=new Estado("Validación");
        Estado e4=new Estado("Terminado");
        e1.añadirSiguiente(e2);
        e2.añadirSiguiente(e3);
        e3.añadirSiguiente(e4);
        e3.añadirSiguiente(e2);
        
        Empleado em2=new Empleado(112l, "Mauro1", 37533283l,"1234");
        Empleado em3=new Empleado(113l, "Mauro2", 37533283l,"1234");
        Empleado em4=new Empleado(114l, "Mauro3", 37533283l,"1234");
        Empleado em5=new Empleado(115l, "Mauro4", 37533283l,"1234");
        Empleado em6=new Empleado(116l, "Mauro5", 37533283l,"1234");
        Empleado em7=new Empleado(117l, "Mauro6", 37533283l,"1234");
        Empleado em8=new Empleado(118l, "Mauro7", 37533283l,"1234");
        Empleado em9=new Empleado(119l, "Mauro8", 37533283l,"1234");
        Empleado em10=new Empleado(120l, "Mauro9", 37533283l,"1234");
        Empleado em11=new Empleado(121l, "Mauro10", 37533283l,"1234");
        Empleado em12=new Empleado(122l, "Mauro11", 37533283l,"1234");
        empleados.add(em2);
        empleados.add(em3);
        empleados.add(em4);
        empleados.add(em5);
        empleados.add(em6);
        empleados.add(em7);
        empleados.add(em8);
        empleados.add(em9);
        empleados.add(em10);
        empleados.add(em11);
        empleados.add(em12);
        a.añadirAlEquipo(em1);
        a.añadirAlEquipo(em2);
        b.añadirAlEquipo(em3);
        b.añadirAlEquipo(em4);
        c.añadirAlEquipo(em5);
        c.añadirAlEquipo(em6);
        d.añadirAlEquipo(em7);
        d.añadirAlEquipo(em8);
        e.añadirAlEquipo(em9);
        e.añadirAlEquipo(em10);
        f.añadirAlEquipo(em11);
        f.añadirAlEquipo(em12);
        
        Tipo nuevoRequerimiento=new Tipo("Nuevo requerimiento",e1);
        Item item1=new Item(111l, "Item 1",nuevoRequerimiento,em1,em1);
        Item item2=new Item(222l, "Item 2",nuevoRequerimiento,em2,em1);
        Item item3=new Item(333l, "Item 3",nuevoRequerimiento,em3,em1);
        Item item4=new Item(444l, "Item 4",nuevoRequerimiento,em4,em1);
        Item item5=new Item(555l, "Item 5",nuevoRequerimiento,em5,em1);
        Item item6=new Item(666l, "Item 6",nuevoRequerimiento,em6,em1);
        
        a.addItem(item1);
        a.addItem(item2);
        a.addItem(item3);
        b.addItem(item4);
        b.addItem(item5);
        b.addItem(item6);
        Tipo reporteDeBug=new Tipo("reporte de bug", e1);
        tipos.add(reporteDeBug);
        tipos.add(nuevoRequerimiento);
        
        
        
        Item prueba=new Item(777l, "prueba",nuevoRequerimiento,em2,em1);
        a.addItem(prueba);
        prueba.cambiarEstado(e2, em2, em2);
        
    }

    void setEmpleado(ArrayList<Empleado> empleados) {
        this.empleados=empleados;
    }
    
}
