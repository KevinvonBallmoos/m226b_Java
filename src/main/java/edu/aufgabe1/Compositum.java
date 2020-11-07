package edu.aufgabe1;


import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class Compositum extends Component {

    /**
     * Die Liste der dargestellten Figur-Objekte
     */
    private final List<Component> components = new ArrayList<>();

    public Compositum() {
        super();
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void moveTo(Position position) {
        for (Component component : components) {

        }
    }

    public void display() {

    }

    /**
     * Löscht alle Figuren und löst die Auffrischung des Fensterinhaltes aus.
     */
    @SuppressWarnings("unused")
    public void clear() {
        components.clear();
    }

}
