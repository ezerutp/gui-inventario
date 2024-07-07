package gui.button;

import gui.interfaces.Subject;
import java.awt.Color;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

public class ButtonFactory {
    
    public static panelButton createButton(ButtonConfig bc, Subject subject, JPanel content) {

        content.add(bc.getPanel(), new AbsoluteConstraints(bc.getPanel().getX(), bc.getPanel().getY(), -1, -1));
        PanelButtonBuilder builder = new PanelButtonBuilder();
        return builder.setHoverColor(new Color(0, 128, 0))
                        .setSubjet(subject)
                        .setIcon(bc.getIcon())
                        .setXPoint(bc.getXPoint())
                        .setYPoint(bc.getYPoint())
                        .setLabelText(bc.getLabelText())
                        .setPanel(bc.getPanel())
                        .setActive(bc.getIsActive())
                        .build();
    }
}
