package gui.panels;

import appinventario.controllers.*;

import gui.panels.Cards.Cards;
import gui.panels.Cards.Cards.COLORES;
import gui.panels.Cards.CardsConfig;

public class HomePanel extends ConfigPanel {

    HomeController ctr;
    
    public HomePanel() {
        initComponents();
        
        this.ctr = new HomeController();
        crearCards();
        
        //Setear las tablas
        this.tablaConsumo.setModel(ctr.listaConsumos());
        this.tablaSuministro.setModel(ctr.listaSuministros());
       
    }
    
    private void crearCards() {
        
        //Obtenemos los datos de la base de datos
        int users = ctr.cantidadUsers();
        int producto = ctr.cantidadProductos();
        int proveedor = ctr.cantidadProveedores();
        int stockbajo = ctr.cantidadInventario();
        
        //Definimos la configuracion de los cards de inicio
        CardsConfig cc = new CardsConfig(COLORES.INFO, "usuarios", users, "image-cards/usuarios.png");
        CardsConfig c1 = new CardsConfig(COLORES.SUCCESS, "producto", producto, "image-cards/inventario.png");
        CardsConfig c2 = new CardsConfig(COLORES.WARNING, "proveedor", proveedor, "image-cards/proveedor.png");
        CardsConfig c3 = new CardsConfig(COLORES.DANGER, "inventario", stockbajo, "image-cards/inventario.png");

        //Creamos los cards
        Cards pan = new Cards(cc);
        Cards pan2 = new Cards(c1);
        Cards pan3 = new Cards(c2);
        Cards pan4 = new Cards(c3);

        //Agregamos los cards al panel
        this.jPanel1.add(pan);
        this.jPanel1.add(pan2);
        this.jPanel1.add(pan3);
        this.jPanel1.add(pan4);
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
        jPanel1 = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        panelTables = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaSuministro = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaConsumo = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(720, 530));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lblTitulo.setText("Inicio");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, -1));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 640, 120));

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        panelTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelTitulo.setLayout(new java.awt.GridLayout(1, 0));

        lblTitulo1.setFont(new java.awt.Font("Noto Sans", 1, 10)); // NOI18N
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("ÚLTIMOS INGRESOS");
        panelTitulo.add(lblTitulo1);

        lblTitulo2.setFont(new java.awt.Font("Noto Sans", 1, 10)); // NOI18N
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("ÚLTIMAS SALIDAS");
        panelTitulo.add(lblTitulo2);

        add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 264, 640, 30));

        panelTables.setBackground(new java.awt.Color(255, 255, 255));
        panelTables.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        panelTables.setLayout(new javax.swing.BoxLayout(panelTables, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane5.setOpaque(false);

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
        jScrollPane5.setViewportView(tablaSuministro);

        panelTables.add(jScrollPane5);

        tablaConsumo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaConsumo.setRowHeight(34);
        jScrollPane4.setViewportView(tablaConsumo);

        panelTables.add(jScrollPane4);

        add(panelTables, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 640, 200));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPanel panelTables;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaConsumo;
    private javax.swing.JTable tablaSuministro;
    // End of variables declaration//GEN-END:variables
}
