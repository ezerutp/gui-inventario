package gui.button;

import gui.interfaces.Subject;
import gui.panels.*;
import java.awt.Color;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ButtonFactory {
    
    public static panelButton createButton(int buttonType, Subject subject, JPanel content) {

        PanelButtonBuilder builder = new PanelButtonBuilder();
        switch (buttonType) {
            case 1:
                JPanel panel0 = new HomePanel();
                content.add(panel0, new AbsoluteConstraints(panel0.getX(), panel0.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/home_w.png")
                        .setXPoint(0)
                        .setYPoint(140)
                        .setLabelText("Home")
                        .setPanel(panel0)
                        .setActive(true)
                        .build();
            case 2:
                JPanel panel1 = new InventarioPanel();
                content.add(panel1, new AbsoluteConstraints(panel1.getX(), panel1.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/inventario_w.png")
                        .setXPoint(0)
                        .setYPoint(180)
                        .setLabelText("Inventario")
                        .setPanel(panel1)
                        .build();
            case 3:
                JPanel panel2 = new EntradaPanel();
                content.add(panel2, new AbsoluteConstraints(panel2.getX(), panel2.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/transfer-in.png")
                        .setXPoint(0)
                        .setYPoint(220)
                        .setLabelText("Entrada")
                        .setPanel(panel2)
                        .build();
            case 4:
                JPanel panel3 = new SalidaPanel();
                content.add(panel3, new AbsoluteConstraints(panel3.getX(), panel3.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/transfer-out.png")
                        .setXPoint(0)
                        .setYPoint(260)
                        .setLabelText("Salida")
                        .setPanel(panel3)
                        .build();
            case 5:
                JPanel panel4 = new UsuarioPanel();
                content.add(panel4, new AbsoluteConstraints(panel4.getX(), panel4.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/user.png")
                        .setXPoint(0)
                        .setYPoint(300)
                        .setLabelText("Usuarios")
                        .setPanel(panel4)
                        .build();
            case 6:
                JPanel panel5 = new ProveedoresPanel();
                content.add(panel5, new AbsoluteConstraints(panel5.getX(), panel5.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/briefcase.png")
                        .setXPoint(0)
                        .setYPoint(340)
                        .setLabelText("Proveedores")
                        .setPanel(panel5)
                        .build();
            case 7:
                JPanel panel6 = new EmpresaPanel();
                content.add(panel6, new AbsoluteConstraints(panel6.getX(), panel6.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/building-factory.png")
                        .setXPoint(0)
                        .setYPoint(380)
                        .setLabelText("Empresa")
                        .setPanel(panel6)
                        .build();
            case 8:
                JPanel panel7 = new ConfiguracionPanel();
                content.add(panel7, new AbsoluteConstraints(panel7.getX(), panel7.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/adjustments.png")
                        .setXPoint(0)
                        .setYPoint(420)
                        .setLabelText("Configuracion")
                        .setPanel(panel7)
                        .build();
            case 9:
                JPanel panel8 = new HomePanel();
                content.add(panel8, new AbsoluteConstraints(panel8.getX(), panel8.getY(), -1, -1));
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIconPath("24x24/logout-2.png")
                        .setXPoint(0)
                        .setYPoint(460)
                        .setLabelText("Salir")
                        .setPanel(panel8)
                        .build();
            // Agrega más casos según sea necesario
            default:
                return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setXPoint(30)
                        .setYPoint(30)
                        .setLabelText("Botón por defecto")
                        //.setPanel(panel)
                        .build();
        }
    }
}
