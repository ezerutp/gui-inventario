package gui.button;

import org.kordamp.ikonli.swing.FontIcon;

import gui.interfaces.Subject;
import gui.interfaces.Observer;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class panelButton extends javax.swing.JPanel implements Observer {
    
    private boolean isActive = false;
    private Color originalColor;
    private Color hoverColor;
    private Subject subject;
    private JPanel panel;
    
    @Override
    public void update(panelButton activePanel) {
        isActive = (activePanel == this);
        changeStatus();
    }
    
    public void setActive(boolean value){
        isActive = value;
        changeStatus();
    }

    private void changeStatus() {
        this.panel.setVisible(isActive);
        if (isActive) {
            this.setBackground(hoverColor);
        } else {
            this.setBackground(originalColor);
        }
    }

    public panelButton(Color hoverColor, int Xpoint, int Ypoint, Subject subject, JPanel panel) {
        
        initComponents();
        
        this.originalColor = this.getBackground();
        this.hoverColor = hoverColor;
        this.subject = subject;
        this.subject.registerObserver(panelButton.this);
        
        this.panel = panel;
        
        Point loc = new Point(Xpoint, Ypoint);
        this.setLocation(loc);
        this.setSize(220, 40);

        // Añadir MouseAdapter para manejar eventos del mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (!isActive){
                    setBackground(originalColor);
                }
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                subject.notifyObservers(panelButton.this);
            }
        });
    }
    
    public void setIcon(FontIcon icon) {
        this.iconButton.setIcon(icon);
    }
    
    public void setLabelProperties(String text, Color color, int fontSize) {
        this.lblButton.setText(text);
        this.lblButton.setForeground(color);
        this.lblButton.setFont(new java.awt.Font("Noto Sans", 1, fontSize));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconButton = new javax.swing.JLabel();
        lblButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 58, 64));
        setMaximumSize(new java.awt.Dimension(220, 40));
        setPreferredSize(new java.awt.Dimension(220, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4, 32, 32));

        lblButton.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        lblButton.setForeground(new java.awt.Color(255, 255, 255));
        lblButton.setText("Inventario");
        add(lblButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 11, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconButton;
    private javax.swing.JLabel lblButton;
    // End of variables declaration//GEN-END:variables
}
