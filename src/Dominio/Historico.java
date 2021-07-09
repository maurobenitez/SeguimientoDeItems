package Dominio;
import java.util.*;

public class Historico{
    private Estado estado;
    private Date fecha;
    private Empleado responsable;
    private Empleado usuario;
    
    public Historico(Estado estado, Date fecha,Empleado responsable, Empleado usuario) {
        this.estado=estado;
        this.fecha=fecha;
        this.responsable=responsable;
        this.usuario=usuario;
    }

    
    public Estado getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Empleado getResponsable() {
        return responsable;
    }
    
}