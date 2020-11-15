package edu.Grafikeditor.model;

import lombok.Getter;

import java.awt.*;

public class CompositumState {

    @Getter
    private final Component component;

    /**
     * Erstellt ein neues Zustandsobjekt des Editors.
     *
     * @param component aktueller Zustand
     */
    public CompositumState(Component component) {
        this.component = component;
    }
}
