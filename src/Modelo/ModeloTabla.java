package Modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public abstract class ModeloTabla<T,E> extends AbstractTableModel {
    
    protected ArrayList<T> elementos;
    protected String[] nombreColumnas;
    protected E lista;
    @Override
    public int getRowCount() {
        if (elementos==null) return 0;else
        return elementos.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return nombreColumnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
        
    public abstract ArrayList<T> getElementos();
    
    public T getValueAt(int rowIndex){
        return elementos.get(rowIndex);
    }
    
    public void setLista(E lista){
        this.lista=lista;
        this.elementos=getElementos();
        this.fireTableDataChanged();
    }
    
    public E getLista(){
        return lista;
    }
}