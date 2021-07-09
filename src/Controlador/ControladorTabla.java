/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloTabla;
import javax.swing.JTable;

/**
 *
 * @author mauro
 */
public abstract class ControladorTabla<E,F> {
    
    JTable tabla;
    ModeloTabla<E,F> modeloTabla;
    
    public ControladorTabla(JTable tabla){
        this.tabla=tabla;
        this.modeloTabla=(ModeloTabla)tabla.getModel();
    }
    
    public void borrarElemento(){
        F f=modeloTabla.getLista();
        E elemento=modeloTabla.getValueAt(tabla.getSelectedRow());
        borrarElemento(elemento);
        modeloTabla.fireTableDataChanged();        
    }
    
    public abstract void addElemento(E elemento);
    
    public abstract void borrarElemento(E elemento);
    
    public E getElemento(){
        int i=tabla.getSelectedRow();
        return modeloTabla.getValueAt(i);
    }
        
}