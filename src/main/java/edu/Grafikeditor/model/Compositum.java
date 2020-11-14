package edu.Grafikeditor.model;

import lombok.Setter;

import java.awt.*;


public class Compositum extends Container {

    @Setter
    private String content;

    public void moveTo(Position position) {
        for (Component component : this.getComponents()) {
            Figure figure = (Figure) component;
            figure.moveTo(position);
        }
    }

    public CompositumState createState() {
        return new CompositumState(content);
    }
    public void undo(CompositumState state) {
        content = state.getContent();
    }
}
