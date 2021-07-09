package Dominio;

import java.util.ArrayList;

public class Empleado implements Comparable<Empleado>{
    
    private String usuario;
    private Long dni;
    private Long id;
    private String contraseña;
    private ArrayList<Item> itemsRegistrados=new ArrayList();
    private Equipo equipo;
    private Item item;
    
    public Empleado(String usuario) {
        this.usuario=usuario;
    }

    public Empleado(Long id,String nombre,Long dni,String contraseña) {
        this.id=id;
        this.usuario=nombre;
        this.dni=dni;   
        this.contraseña=contraseña;
    }
    
    public ArrayList<Item> getItemsRegistrados() {
        return itemsRegistrados;
    }

    public void addRegistro(Item i){
        itemsRegistrados.add(i);
    }

    public String getUsuario() {
        return usuario;
    }
                 
    public String getContraseña() {
        return contraseña;
    }
        
    public Long getId(){return id;}

    public Long getDni(){return dni;}

    public Equipo getEquipo() {
        return equipo;
    }

    protected void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public void setItem(Item item){
        this.item=item;
    }
    
    public Item getItem(){
        return item;
    }

    @Override
    public String toString(){
        return usuario;
    }
        
    public boolean estáOcupado(){
        return (equipo!=null);
    }
    
    @Override
    public int compareTo(Empleado o) {
        return this.usuario.compareTo(o.usuario);    
    }
    
}