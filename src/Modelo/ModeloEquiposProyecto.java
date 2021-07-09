/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Dominio.Equipo;
import Dominio.Proyecto;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class ModeloEquiposProyecto extends ModeloTabla<Equipo,Proyecto>{
    
    public ModeloEquiposProyecto() {
        nombreColumnas = new String[]{"Equipo"};
    }
    
    @Override
    public String getValueAt(int rowIndex, int columnIndex){
        Equipo equipo=getValueAt(rowIndex);
        switch (columnIndex){
            case 0: return equipo.getNombre();
        }
        return null;
    }

    @Override
    public ArrayList<Equipo> getElementos() {
        return lista.getEquipos();
    }


}
