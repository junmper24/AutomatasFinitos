/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Model.Estado;
import controlador.Controlador;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Alejandro
 */
public class PanelTransiciones extends javax.swing.JPanel {

    private Controlador controlador;
    private JButton estadoActual;
    private JButton estadoSiguiente;
    private JButton simbolo;
    private Color colorFondoBotones;
    /**
     * Creates new form PanelEstados
     */
    public PanelTransiciones() {
        initComponents();
        controlador = Controlador.getInstance();
        actualizarEstadosActuales();
        actualizarEstadosSiguiente();
        actualizarSimbolos();
        crearTabla();
        
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
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jp_estadoss = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jp_estado_actual = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jp_estado_siguiente = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jp_simbolos = new javax.swing.JPanel();
        pn_contenedor_tabla_transiciones = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Estados");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(58, 171, 169));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Agregar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1);

        jPanel2.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jp_estadoss.setBackground(new java.awt.Color(255, 255, 255));
        jp_estadoss.setAlignmentX(5.0F);
        jp_estadoss.setAlignmentY(5.0F);
        jp_estadoss.setAutoscrolls(true);
        jp_estadoss.setLayout(new java.awt.GridLayout(1, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estado Actual");
        jPanel4.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jp_estado_actual.setBackground(new java.awt.Color(255, 255, 255));
        jp_estado_actual.setMinimumSize(new java.awt.Dimension(100, 100));
        jp_estado_actual.setLayout(new java.awt.GridLayout(1, 0));
        jPanel4.add(jp_estado_actual, java.awt.BorderLayout.CENTER);

        jp_estadoss.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado Siguiente");
        jPanel5.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jp_estado_siguiente.setBackground(new java.awt.Color(255, 255, 255));
        jp_estado_siguiente.setMinimumSize(new java.awt.Dimension(100, 100));
        jp_estado_siguiente.setLayout(new java.awt.GridLayout(1, 0));
        jPanel5.add(jp_estado_siguiente, java.awt.BorderLayout.CENTER);

        jp_estadoss.add(jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Simbolo de Entrada");
        jPanel3.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jp_simbolos.setBackground(new java.awt.Color(255, 255, 255));
        jp_simbolos.setMinimumSize(new java.awt.Dimension(100, 100));
        jp_simbolos.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jp_simbolos, java.awt.BorderLayout.CENTER);

        jp_estadoss.add(jPanel3);

        jPanel2.add(jp_estadoss, java.awt.BorderLayout.CENTER);

        add(jPanel2);

        pn_contenedor_tabla_transiciones.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedor_tabla_transiciones.setLayout(new java.awt.GridLayout(1, 1));
        add(pn_contenedor_tabla_transiciones);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String strEstadoActual = estadoActual.getText().toString();
        String strEstadoSiguiente = estadoSiguiente.getText().toString();
        String strSimbolo = simbolo.getText().toString();
        
        controlador.agregarTransicion(strEstadoActual, strSimbolo, strEstadoSiguiente);
        
        estadoActual.setEnabled(true);
        estadoActual.setBackground(colorFondoBotones);
        estadoSiguiente.setEnabled(true);
        estadoSiguiente.setBackground(colorFondoBotones);
        simbolo.setEnabled(true);
        simbolo.setBackground(colorFondoBotones);
        
        crearTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

     private void actualizarEstadosActuales() {
        ArrayList<String> estados = controlador.obtenerEstadosString();
        jp_estado_actual.removeAll();
        jp_estado_actual.revalidate();
        
        if(estados != null)
        {
            jp_estado_actual.setLayout(new GridLayout(estados.size(),1));
            for (String entry: estados) {
                String key = entry;
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                
                ActionListener l = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (estadoActual != null) {
                           estadoActual.setEnabled(true); 
                        }
                        if (colorFondoBotones != null && estadoActual != null) {
                            estadoActual.setBackground(colorFondoBotones);
                        }
                        colorFondoBotones = btn.getBackground();
                        btn.setEnabled(false);
                        btn.setBackground(Color.gray);
                        estadoActual = btn;
                    }
                };
                btn.addActionListener(l);
                jp_estado_actual.add(btn);
            } 
        }   
    }
     private void actualizarEstadosSiguiente() {
        ArrayList<String> estados = controlador.obtenerEstadosString();
        jp_estado_siguiente.removeAll();
        jp_estado_siguiente.revalidate();
        
        if(estados != null)
        {
            jp_estado_siguiente.setLayout(new GridLayout(estados.size(),1));
            for (String entry: estados) {
                String key = entry;
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                
                ActionListener l = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (estadoSiguiente != null) {
                           estadoSiguiente.setEnabled(true);
                        }
                        if (colorFondoBotones != null && estadoSiguiente != null) {
                            estadoSiguiente.setBackground(colorFondoBotones);
                        }
                        colorFondoBotones = btn.getBackground();
                        btn.setEnabled(false);
                        btn.setBackground(Color.gray);
                        estadoSiguiente = btn;
                    }
                };
                btn.addActionListener(l);
                jp_estado_siguiente.add(btn);
            } 
        }   
    }
     private void actualizarSimbolos() {
        ArrayList<String> simbolos = controlador.obtenerSimbolos();
        jp_simbolos.removeAll();
        jp_simbolos.revalidate();
        
        if(simbolos != null)
        {
            jp_simbolos.setLayout(new GridLayout(simbolos.size(),1));
            for (String entry: simbolos) {
                String key = entry;
                JButton btn = new JButton(key);
                btn.setForeground(new  java.awt.Color(255, 255, 255));
                btn.setBackground(new Color(58,171,169));
                
                ActionListener l = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (simbolo != null) {
                           simbolo.setEnabled(true);
                        }
                        if (colorFondoBotones != null && simbolo != null) {
                            simbolo.setBackground(colorFondoBotones);
                        }
                        colorFondoBotones = btn.getBackground();
                        btn.setEnabled(false);
                        btn.setBackground(Color.gray);
                        simbolo = btn;
                    }
                };
                btn.addActionListener(l);
                jp_simbolos.add(btn);
            } 
        }   
    }
     
    private void crearTabla()
    {
        pn_contenedor_tabla_transiciones.removeAll();
        pn_contenedor_tabla_transiciones.revalidate();
        
        ArrayList<String> estados = controlador.obtenerEstadosString();
        ArrayList<String> simbolos = controlador.obtenerSimbolos();
        Object[] StrSimbolos = new Object[simbolos.size()+1];
        StrSimbolos[0] = "";      
        for (int i=0; i<simbolos.size();i++) {
            String key = simbolos.get(i);
            StrSimbolos[i+1] = key;
        }
        
        Object[][] mat = controlador.obtenerMatrizTransiciones(1);
        if (mat != null)
        {
            JTable table = new JTable(mat, StrSimbolos);
            table.addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent me) {
                    JTable table =(JTable) me.getSource();
                    Point p = me.getPoint();
                    int row = table.rowAtPoint(p);
                    int col = table.columnAtPoint(p);
                    if (me.getClickCount() == 2) {
                        Controlador controlador = Controlador.getInstance();
                        ArrayList<Estado> estados = controlador.obtenerEstados();
                        JFrame frame = new JFrame("Estados Sguientes");
                        frame.setSize(300, 200);
                        javax.swing.JPanel pn = new JPanel(new GridLayout(1, estados.size()));
                        for (int i = 0; i < estados.size(); i++) {
                            JButton btn = new JButton(estados.get(i).getData());
                            btn.setForeground(new  java.awt.Color(255, 255, 255));
                            btn.setBackground(new Color(58,171,169));
                            
                            ActionListener l = new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    if (simbolo != null) {
                                       simbolo.setEnabled(true);
                                    }
                                    if (colorFondoBotones != null && simbolo != null) {
                                        simbolo.setBackground(colorFondoBotones);
                                    }
                                    colorFondoBotones = btn.getBackground();
                                    btn.setEnabled(false);
                                    btn.setBackground(Color.gray);
                                    simbolo = btn;
                                }
                            };
                btn.addActionListener(l);

                            
                            pn.add(btn);
                        }
                        frame.add(pn);
                        frame.setVisible(true);
                        String estadoSig = "";
                        controlador.modificarEstado(estadoSig,row,col);
                    }
                }
});
            pn_contenedor_tabla_transiciones.add(table);
        }
        //DefaultTableModel model = new DefaultTableModel(StrSimbolos,estados.size());
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jp_estado_actual;
    private javax.swing.JPanel jp_estado_siguiente;
    private javax.swing.JPanel jp_estadoss;
    private javax.swing.JPanel jp_simbolos;
    private javax.swing.JPanel pn_contenedor_tabla_transiciones;
    // End of variables declaration//GEN-END:variables
}
