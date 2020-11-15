package edu.Grafikeditor.model;

import lombok.Setter;

import java.awt.*;

/**
 * class Compositum
 * extends Container
 *
 * @author Kevin
 */
public class Compositum extends Container {

    @Setter
    private Component component;

    /**
     * moveTo method to call the specific moveTo method in circle, line or rectangle
     *
     * @param position is required to move the figure to another position
     */
    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (Figure) component;
            figure.moveTo(position);
        }
    }

    /**
     * #Todo
     * work in progress
     * creates a new state of composite with the actual content
     *
     * @return actual state of composite
     */
    public CompositumState createState() {
        return new CompositumState(component);
    }

    /**
     * #Todo
     * work in progress
     * undo the state
     *
     * @param state actual state of composite
     */
    public void undo(CompositumState state) {
        component = state.getComponent();
    }
}
