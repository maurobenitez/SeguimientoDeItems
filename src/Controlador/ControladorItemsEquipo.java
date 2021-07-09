/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Dominio.Equipo;
import Dominio.Item;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public class ControladorItemsEquipo extends ControladorTabla<Item,Equipo>{
    
    public ControladorItemsEquipo(JTable tabla) {
        super(tabla);
    }

    @Override
    public void addElemento(Item item) {
        modeloTabla.getLista().addItem(item);
        modeloTabla.fireTableDataChanged();
    }

    @Override
    public void borrarElemento(Item item) {
        modeloTabla.getLista().removeItem(item);
    }
    
}
