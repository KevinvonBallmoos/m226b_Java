package edu.Grafikeditor.model;

import lombok.Getter;

public class CompositumState {

    @Getter
    private final String content;

    /**
     * Erstellt ein neues Zustandsobjekt des Editors.
     *
     * @param content aktueller Zustand
     */
    public CompositumState(String content) {
        this.content = content;
    }
}
