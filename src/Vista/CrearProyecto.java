/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Dominio.Empleado;
import Dominio.Proyecto;
import Dominio.Sistema;
import javax.swing.JComboBox;

/**
 *
 * @author mauro
 */
public class CrearProyecto extends javax.swing.JFrame {
    private Empleado lider;
    private JComboBox<String> proyectos;    
    private static CrearProyecto crearProyecto=null;
    
    private CrearProyecto() {
        initComponents();
    }
    
    public void abrirVentana(Empleado lider,JComboBox proyectos){
        this.lider=lider;
        this.proyectos=proyectos;
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    
    
    public static CrearProyecto getInstance(){
        if (crearProyecto==null) crearProyecto=new CrearProyecto();
        return crearProyecto;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFNombreProyecto = new javax.swing.JTextField();
        jBAñadir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Proyecto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jBAñadir.setText("Añadir");
        jBAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBAñadirMouseClicked(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jBAñadir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNombreProyecto)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jBCancelar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCancelar)
                    .addComponent(jBAñadir)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBAñadirMouseClicked
        String nombreProyecto=jTFNombreProyecto.getText();
        if (!"".equals(nombreProyecto)){
            Proyecto proyecto=new Proyecto(nombreProyecto,lider);
            Sistema.getInstance().addProyecto(proyecto);
            proyectos.updateUI();
            dispose();
        } 
    }//GEN-LAST:event_jBAñadirMouseClicked

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        jTFNombreProyecto.setText("");
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAñadir;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFNombreProyecto;
    // End of variables declaration//GEN-END:variables
}
