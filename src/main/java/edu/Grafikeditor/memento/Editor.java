package edu.Grafikeditor.memento;

import lombok.Setter;

public class Editor {

    @Setter
    private String content;

    /**
     * Erstellt einen neuen Zustand des Editors mit dem aktuellen
     * Inhalt.
     *
     * @return aktueller Zustand des Editors
     */
    public EditorState createState() {
        return new EditorState(content);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                '}';
    }

    public void undo(EditorState state) {
        content = state.getContent();
    }
}