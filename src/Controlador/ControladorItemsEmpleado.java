/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Empleado;
import Dominio.Item;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public class ControladorItemsEmpleado extends ControladorTabla<Item,Empleado>{
    
    public ControladorItemsEmpleado(JTable tabla) {
        super(tabla);
    }

    @Override
    public void addElemento(Item elemento) {
        throw new UnsupportedOperationException("Función no válida");
    }

    @Override
    public void borrarElemento(Item elemento) {
        throw new UnsupportedOperationException("Función no válida");
    }

  
    
}
