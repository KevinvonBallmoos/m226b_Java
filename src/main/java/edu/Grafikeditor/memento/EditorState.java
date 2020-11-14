package edu.Grafikeditor.memento;

import lombok.Getter;

public class EditorState {

    @Getter
    private final String content;

    /**
     * Erstellt ein neues Zustandsobjekt des Editors.
     *
     * @param content aktueller Zustand
     */
    public EditorState(String content) {
        this.content = content;
    }
}