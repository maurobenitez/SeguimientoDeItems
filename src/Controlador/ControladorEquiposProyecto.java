/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Equipo;
import Dominio.Proyecto;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public class ControladorEquiposProyecto extends ControladorTabla<Equipo,Proyecto>{
    
    public ControladorEquiposProyecto(JTable tabla) {
        super(tabla);
    }

    @Override
    public void addElemento(Equipo equipo) {
        modeloTabla.getLista().addEquipo(equipo);
        modeloTabla.fireTableDataChanged();
    }

    @Override
    public void borrarElemento(Equipo equipo) {
        modeloTabla.getLista().removeEquipo(equipo);
    }
    
}
