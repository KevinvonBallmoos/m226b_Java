package edu.aufgabe1;

import lombok.Data;

@Data
public abstract class Figure {
    /**
     * Position der Figur(en) auf dem Display
     */
    private final Position position;

    public Figure(Position position) {
        this.position = position;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */
    public abstract void draw();
}

