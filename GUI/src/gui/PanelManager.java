package gui;

import gui.button.panelButton;
import gui.interfaces.Subject;
import java.util.ArrayList;
import java.util.List;

public class PanelManager implements Subject {

    private List<panelButton> observers = new ArrayList<>();

    @Override
    public void registerObserver(panelButton o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(panelButton o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(panelButton activePanel) {
        for (panelButton observer : observers) {
            observer.update(activePanel);
        }
    }
}