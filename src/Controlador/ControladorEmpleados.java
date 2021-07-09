/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Empleado;
import Dominio.Sistema;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public class ControladorEmpleados extends ControladorTabla<Empleado,Sistema>{
    
    public ControladorEmpleados(JTable tabla) {
        super(tabla);
    }

    @Override
    public void addElemento(Empleado empleado) {
        modeloTabla.getLista().addEmpleado(empleado);
        modeloTabla.fireTableDataChanged();
    }

    @Override
    public void borrarElemento(Empleado elemento) {
        modeloTabla.getLista().removeEmpleado(elemento);
    }
    
}
