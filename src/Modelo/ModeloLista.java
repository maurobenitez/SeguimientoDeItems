/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author mauro
 * @param <T>
 */
public class ModeloLista<T> extends AbstractListModel implements ComboBoxModel{

    ArrayList<T>elementos=new ArrayList();
    T selección=null;
    @Override
    
    public void setSelectedItem(Object elemento) {
        selección=(T)elemento;
    }

    @Override
    public Object getSelectedItem() {
        if (selección==null) return "";
        else
        return selección.toString();
    }

    @Override
    public int getSize() {
        return elementos.size();
    }

    @Override
    public String getElementAt(int i) {
        return elementos.get(i).toString();
    }
    
    public void setElementos(ArrayList<T> elementos){
        this.elementos=elementos;
        
    }    
    public T getObjeto(int i){
        return elementos.get(i);
    }
    
    
}
