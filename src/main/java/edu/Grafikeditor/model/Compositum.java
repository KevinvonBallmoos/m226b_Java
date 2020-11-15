package edu.Grafikeditor.model;

import lombok.Setter;

import java.awt.*;


public class Compositum extends Container {

    @Setter
    private Component component;

    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (Figure) component;
            figure.moveTo(position);
        }
    }

    public CompositumState createState() {
        return new CompositumState(component);
    }
    public void undo(CompositumState state) {
        component = state.getComponent();
    }
}
