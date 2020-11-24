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
    private final Component[] components;

    /**
     * Creates a new state object from Compositum.java
     *
     * @param components actual state
     */
    public CompositumState(Component[] components) {
        this.components = components;
    }
}
