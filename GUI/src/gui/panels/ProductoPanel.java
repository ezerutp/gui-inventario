package gui.panels;

import appinventario.controllers.ProductoController;
import appinventario.models.Producto;
import appinventario.tablas.ProductoTableModel;
import java.util.List;

public class ProductoPanel extends ConfigPanel {

    private ProductoController controlador;
    
    public ProductoPanel() {
        initComponents();
        this.controlador = new ProductoController();
        llenarTabla();
    }

    private void llenarTabla(){
        List<Producto> usuarios = controlador.obtenerTodosProductos();
        ProductoTableModel modelo = new ProductoTableModel(usuarios);
        this.tablaProducto.setModel(modelo);
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
        tablaProducto = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lblTitulo.setText("Productos");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));

        pnlLista.setLayout(new javax.swing.BoxLayout(pnlLista, javax.swing.BoxLayout.LINE_AXIS));

        jScrollJava.setOpaque(false);

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaProducto.setRowHeight(34);
        jScrollJava.setViewportView(tablaProducto);

        pnlLista.add(jScrollJava);

        add(pnlLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 640, 320));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollJava;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLista;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables
}