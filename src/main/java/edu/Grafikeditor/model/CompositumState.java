package edu.Grafikeditor.model;

import lombok.Getter;

import java.awt.*;

/**
 * class CompositumState, creates new state objects
 *
 * @author Kevin
 */
public class CompositumState {

    @Getter
    private final Component[] component;

    /**
     * Creates a new state object from Compositum.java
     *
     * @param component actual state
     */
    public CompositumState(Component[] component) {
        this.component = component;
    }
}
