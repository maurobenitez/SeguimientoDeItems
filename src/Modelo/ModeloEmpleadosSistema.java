/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Dominio.Empleado;
import Dominio.Sistema;
import java.util.ArrayList;

/**
 *
 * @author mauro
 */
public class ModeloEmpleadosSistema extends ModeloTabla<Empleado,Sistema>{
    
    public ModeloEmpleadosSistema() {
        nombreColumnas = new String[]{"legajo","nombre","dni"};
    }
    
    @Override
    public String getValueAt(int rowIndex, int columnIndex){
        Empleado empleado=getValueAt(rowIndex);
        switch (columnIndex){
            case 0: return empleado.getId().toString();
            case 1: return empleado.getUsuario();
            case 2: return empleado.getDni().toString();
        }
        return null;
    }

    @Override
    public ArrayList<Empleado> getElementos() {
        return lista.getEmpleados();
    }


}
