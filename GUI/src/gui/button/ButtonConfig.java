package gui.button;

import javax.swing.JPanel;
import org.kordamp.ikonli.swing.FontIcon;

public class ButtonConfig {
    
    private String labelText;
    private FontIcon icon;
    private int xPoint;
    private int yPoint;
    private boolean isActive;
    private JPanel panel;

    public ButtonConfig(String labelText, FontIcon icon, int xPoint, int yPoint, boolean isActive, JPanel panel) {
        this.labelText = labelText;
        this.icon = icon;
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.isActive = isActive;
        this.panel = panel;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    public FontIcon getIcon() {
        return this.icon;
    }

    public void setIcon(FontIcon icon) {
        this.icon = icon;
    }

    public int getXPoint() {
        return this.xPoint;
    }

    public void setXPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getYPoint() {
        return this.yPoint;
    }

    public void setYPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public JPanel getPanel() {
        return this.panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
}
