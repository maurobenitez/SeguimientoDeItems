/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Dominio.Item;
import Modelo.ModeloItemsEmpleado;
import Modelo.ModeloTabla;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author mauro
 */
class RenderizadoCeldas extends DefaultTableCellRenderer {
   
    private ModeloTabla modelo;
    public RenderizadoCeldas(ModeloTabla modelo){
        super();
        this.modelo=modelo;
    }
    
    @Override
   public Component getTableCellRendererComponent(JTable table, 
   Object value, boolean isSelected, boolean hasFocus, int row, int column) {
     JLabel parent = (JLabel) super.getTableCellRendererComponent(table, 
      value, isSelected, hasFocus, row, column);
      ModeloItemsEmpleado modelo=(ModeloItemsEmpleado)table.getModel();
      Item item=modelo.getValueAt(row);
      if (!item.visto())
        parent.setFont(parent.getFont().deriveFont(Font.BOLD));
     return parent;
   }
   
}