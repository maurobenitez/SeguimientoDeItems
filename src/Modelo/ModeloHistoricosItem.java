/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Dominio.Historico;
import Dominio.Item;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class ModeloHistoricosItem extends ModeloTabla<Historico,Item>{
    
    public ModeloHistoricosItem() {
        nombreColumnas = new String[]{"Estado","Fecha","Responsable"};
    }
    
    @Override
    public String getValueAt(int rowIndex, int columnIndex){
        Historico historico=getValueAt(rowIndex);
        switch (columnIndex){
            case 0: return historico.getEstado().toString();
            case 1: return historico.getFecha().toString();
            case 2: return historico.getResponsable().toString();
        }
        return null;
    }

    @Override
    public ArrayList<Historico> getElementos() {
        return lista.getEstadosPrevios();
    }


}
