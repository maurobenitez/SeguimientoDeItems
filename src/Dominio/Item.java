package Dominio;
import java.util.*;

public class Item{
    private Long id;
    private String nombre;
    private Tipo tipo;
    private Date fecha;
    private String prioridad;
    private Estado estadoActual;
    private ArrayList<Historico> estadosPrevios=new ArrayList();
    private Empleado creador;
    private Empleado responsable;
    private Equipo equipo;
    private Boolean visto;
    
    public Tipo getTipo() {
        return tipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public ArrayList<Historico> getEstadosPrevios() {
        return estadosPrevios;
    }

    public Empleado getResponsable() {
        return responsable;
    }	

    public Item(Long id,String nombre,Tipo tipo,Empleado responsable,Empleado creador) {
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
        this.fecha=new Date();
        this.estadoActual=tipo.getEstado();
        this.responsable=responsable;
        this.creador=creador;
        this.creador.addRegistro(this);
        responsable.setItem(this);
        Historico historico=new Historico(estadoActual,fecha,responsable,creador);
        this.estadosPrevios.add(historico);
        visto=true;
    }

    public void cambiarEstado (Estado estado, Empleado responsable, Empleado usuario) {
            this.responsable=responsable;
            responsable.setItem(this);
            this.estadoActual=estado;
            this.fecha=new Date();
            Historico historico=new Historico(estadoActual,fecha,responsable,usuario);
            if (this.creador!=usuario)visto=false;
            this.estadosPrevios.add(historico);
    }

    public Empleado obtenerResponsable () {
            return responsable;	
    }

    public Estado obtenerEstado () {
            return estadoActual;
    }
    
    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    protected void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Boolean visto() {
        return visto;
    }

    public void setVisto() {
        visto=true;
    }
    
    
    
    
    

}
