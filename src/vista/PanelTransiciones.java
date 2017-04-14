/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;

/**
 *
 * @author Alejandro
 */
public class PanelTransiciones extends javax.swing.JPanel {

    private Controlador controlador;
    /**
     * Creates new form PanelEstados
     */
    public PanelTransiciones() {
        initComponents();
        controlador = Controlador.getInstance();
        actualizarEstados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jp_estados = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        pn_contenedor_tabla_transiciones = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_transiciones = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Estados");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel3.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.WEST);

        jp_estados.setAlignmentX(5.0F);
        jp_estados.setAlignmentY(5.0F);
        jp_estados.setAutoscrolls(true);
        jp_estados.setLayout(new java.awt.GridLayout(8, 3));

        jButton1.setText("jButton1");
        jp_estados.add(jButton1);

        jButton2.setText("jButton2");
        jp_estados.add(jButton2);

        jPanel2.add(jp_estados, java.awt.BorderLayout.CENTER);

        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.EAST);

        add(jPanel2);

        pn_contenedor_tabla_transiciones.setLayout(new java.awt.GridLayout(1, 1));

        tbl_transiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_transiciones);

        pn_contenedor_tabla_transiciones.add(jScrollPane1);

        add(pn_contenedor_tabla_transiciones);
    }// </editor-fold>//GEN-END:initComponents

     private void actualizarEstados() {
        HashMap<String,Integer> estados = controlador.obtenerEstados();
        jp_estados.removeAll();
        jp_estados.revalidate();
        
        if(estados != null)
        {
            
            jp_estados.setLayout(new GridLayout(estados.size(),1));
            for (Map.Entry<String, Integer> entry : estados.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                JButton btn = new JButton(key);
                ActionListener l = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String estado = btn.getText();
                        controlador.agregarEstadoAceptacion(estado);
                        btn.setEnabled(false);
                        btn.setBackground(Color.gray);
                    }
                };
                btn.addActionListener(l);
                jp_estados.add(btn);
            } 
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_estados;
    private javax.swing.JPanel pn_contenedor_tabla_transiciones;
    private javax.swing.JTable tbl_transiciones;
    // End of variables declaration//GEN-END:variables
}