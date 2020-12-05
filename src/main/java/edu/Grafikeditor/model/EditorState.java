package edu.Grafikeditor.model;

import lombok.Getter;

/**
 * class CompositumState, creates new state objects
 *
 * @author Kevin
 */
public class EditorState implements Cloneable {

    @Getter
    private final Compositum compositum;

    /**
     * Creates a new state object from Compositum.java
     *
     * @param compositum actual state
     */
    public EditorState(Compositum compositum) {
        this.compositum = compositum;
    }

    public EditorState clone(){
        return new EditorState(compositum.clone());
    }
}
