package gui.panels;

import appinventario.controllers.SuministroController;
import appinventario.utils.FillTable;

public class EntradaPanel extends ConfigPanel {

    private final SuministroController controlador;
    
    public EntradaPanel() {
        initComponents();
        this.controlador = new SuministroController();
        FillTable.setearTabla(tablaSuministro, controlador.modeloSuministros());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlLista = new javax.swing.JPanel();
        jScrollJava = new javax.swing.JScrollPane();
        tablaSuministro = new javax.swing.JTable();
        pnlBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        bntEliminar = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lblTitulo.setText("Suministro");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        pnlLista.setLayout(new javax.swing.BoxLayout(pnlLista, javax.swing.BoxLayout.LINE_AXIS));

        jScrollJava.setOpaque(false);

        tablaSuministro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaSuministro.setRowHeight(34);
        jScrollJava.setViewportView(tablaSuministro);

        pnlLista.add(jScrollJava);

        add(pnlLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 640, 320));

        pnlBotones.setLayout(new java.awt.GridLayout());

        btnAgregar.setBackground(new java.awt.Color(40, 167, 69));
        btnAgregar.setText("Agregar");
        pnlBotones.add(btnAgregar);

        btnModificar.setBackground(new java.awt.Color(255, 193, 7));
        btnModificar.setText("Modificar");
        btnModificar.setFocusPainted(false);
        pnlBotones.add(btnModificar);

        bntEliminar.setBackground(new java.awt.Color(220, 53, 69));
        bntEliminar.setText("Eliminar");
        bntEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntEliminar.setFocusPainted(false);
        pnlBotones.add(bntEliminar);

        add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 410, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEliminar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollJava;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JTable tablaSuministro;
    // End of variables declaration//GEN-END:variables
}
