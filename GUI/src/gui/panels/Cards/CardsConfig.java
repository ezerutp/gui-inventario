package gui.panels.Cards;

import gui.panels.Cards.Cards.COLORES;
import java.awt.Color;

public class CardsConfig {
    
    private COLORES bg;
    private String titulo;
    private String label;
    private String iconPath;

    public CardsConfig(COLORES bg, String titulo, String label, String iconPath) {
        this.bg = bg;
        this.titulo = titulo;
        this.label = label;
        this.iconPath = iconPath;
    }

    public COLORES getBg() {
        return bg;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getLabel() {
        return label;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setBg(COLORES bg) {
        this.bg = bg;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    
}
