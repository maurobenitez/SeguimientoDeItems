/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Empleado;
import Dominio.Equipo;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public class ControladorMiembrosEquipo extends ControladorTabla<Empleado,Equipo>{
    
    public ControladorMiembrosEquipo(JTable tabla) {
        super(tabla);
    }

    @Override
    public void addElemento(Empleado elemento) {
        modeloTabla.getLista().añadirAlEquipo(elemento);
        modeloTabla.fireTableDataChanged();
    }

    @Override
    public void borrarElemento(Empleado elemento) {
        modeloTabla.getLista().removeEmpleado(elemento);
    }
    
}
