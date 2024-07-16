package gui.panels.Cards;

import gui.panels.Cards.Cards.COLORES;
import java.awt.Color;

public class CardsConfig {
    
    private COLORES bg;
    private String titulo;
    private int cant;
    private String iconPath;

    public CardsConfig(COLORES bg, String titulo, int cant, String iconPath) {
        this.bg = bg;
        this.titulo = titulo;
        this.cant = cant;
        this.iconPath = iconPath;
    }

    public COLORES getBg() {
        return bg;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCant() {
        return cant;
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

    public void setCant(int cant) {
        this.cant = cant;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }
    
}
