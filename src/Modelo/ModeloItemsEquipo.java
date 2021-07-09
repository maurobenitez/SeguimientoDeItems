/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Dominio.Equipo;
import Dominio.Item;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class ModeloItemsEquipo extends ModeloTabla<Item,Equipo>{
    
    public ModeloItemsEquipo() {
        nombreColumnas = new String[]{"id","nombre","tipo","fecha","responsable"};
    }
    
    @Override
    public String getValueAt(int rowIndex, int columnIndex){
        Item item=getValueAt(rowIndex);
        switch (columnIndex){
            case 0: return item.getId().toString();
            case 1: return item.getNombre();
            case 2: return item.getTipo().toString();
            case 3: return item.getFecha().toString();
            case 4: return item.getResponsable().toString();
        }
        return null;
    }

    @Override
    public ArrayList<Item> getElementos() {
        return lista.obtenerItems();
    }


}
