package gui.panels.Cards;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class Cards extends javax.swing.JPanel {

    private int cornerRadius = 15;
    private Color backgroundColor;

    public Cards(CardsConfig cc) {
        initComponents();
        this.txtMainLabel.setText(cc.getLabel());
        this.lblTitulo.setText(cc.getTitulo().toUpperCase());
        this.backgroundColor = paintcolor(cc.getBg());
        setIcon(cc.getIconPath());
        
        //this.pnlCard
    }
    
    private void setIcon(String iconPath) {
        this.iconCards.setIcon(new ImageIcon(getClass().getResource("/resources/images/" + iconPath)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMainLabel = new javax.swing.JLabel();
        iconCards = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(155, 110));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMainLabel.setFont(new java.awt.Font("Noto Sans", 1, 48)); // NOI18N
        txtMainLabel.setForeground(new java.awt.Color(255, 255, 255));
        txtMainLabel.setText("2");
        add(txtMainLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 42));

        iconCards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/image-cards/proveedor.png"))); // NOI18N
        add(iconCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 80, 80));

        lblTitulo.setFont(new java.awt.Font("Noto Sans", 1, 13)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("USUARIOS");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja el fondo redondeado
        graphics.setColor(backgroundColor);
        graphics.fillRoundRect(0, 0, width, height, arcs.width, arcs.height);
        
        
    }
    
    private Color paintcolor(COLORES c) {
        switch (c) {
            case INFO:
                return new Color(23, 162, 184);
            case SUCCESS:
                return new Color(40, 167, 69);
            case WARNING:
                return new Color(255, 193, 7);
            case DANGER:
                return new Color(220, 53, 69);
            default:
                return new Color(255, 255, 255); // Color por defecto
        }
    }
    
    public enum COLORES{
        INFO,
        SUCCESS,
        WARNING,
        DANGER
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconCards;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel txtMainLabel;
    // End of variables declaration//GEN-END:variables
}
