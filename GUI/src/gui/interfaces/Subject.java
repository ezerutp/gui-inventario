package gui.interfaces;

import gui.button.panelButton;

public interface Subject {
    void registerObserver(panelButton o);
    void removeObserver(panelButton o);
    void notifyObservers(panelButton activePanel);
}
