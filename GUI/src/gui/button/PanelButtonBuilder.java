package gui.button;

import gui.interfaces.Subject;
import java.awt.Color;
import javax.swing.JPanel;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.swing.FontIcon;

public class PanelButtonBuilder {
    
    //Valores por default
    private Color hoverColor = new Color(0, 128, 0);
    private int xPoint = 0;
    private int yPoint = 0;
    private FontIcon icon = FontIcon.of(FontAwesomeSolid.USERS, 22, Color.white);
    private String labelText = "panelButton";
    private Color labelColor = Color.WHITE;
    private int labelFontSize = 14;
    private int width = 220;
    private int height = 40;
    private boolean isActive = false;
    
    private JPanel panelcontenido;
    
    //Observador
    private Subject subject;

    public PanelButtonBuilder setSubjet(Subject subject) {
        this.subject = subject;
        return this;
    }
    
    public PanelButtonBuilder setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
        return this;
    }

    public PanelButtonBuilder setXPoint(int xPoint) {
        this.xPoint = xPoint;
        return this;
    }

    public PanelButtonBuilder setYPoint(int yPoint) {
        this.yPoint = yPoint;
        return this;
    }

    public PanelButtonBuilder setIcon(FontIcon icon) {
        this.icon = icon;
        return this;
    }

    public PanelButtonBuilder setLabelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    public PanelButtonBuilder setLabelColor(Color labelColor) {
        this.labelColor = labelColor;
        return this;
    }

    public PanelButtonBuilder setLabelFontSize(int labelFontSize) {
        this.labelFontSize = labelFontSize;
        return this;
    }
    
    public PanelButtonBuilder setWidth(int w){
        this.width = w;
        return this;
    }
    
    public PanelButtonBuilder setHeight(int h){
        this.width = h;
        return this;
    }
    
    public PanelButtonBuilder setPanel(JPanel panel){
        this.panelcontenido = panel;
        return this;
    }
    
    public PanelButtonBuilder setActive(boolean value){
        this.isActive = value;
        return this;
    }

    public panelButton build() {
        panelButton panel = new panelButton(hoverColor, xPoint, yPoint, subject, panelcontenido);
        panel.setIcon(icon);
        panel.setSize(width, height);
        panel.setActive(isActive);
        panel.setLabelProperties(labelText, labelColor, labelFontSize);
        return panel;
    }
}