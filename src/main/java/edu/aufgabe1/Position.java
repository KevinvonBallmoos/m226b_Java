package edu.aufgabe1;

import lombok.Getter;
import lombok.ToString;

/**
 * Positionsobjekt für die Grafikelemente
 */
@Getter
@ToString
public class Position {
    private int x, y;

    /**
     * Erstellen eines neuen Positionsobjektes.      *      * @param x Koordinate auf dem Display      * @param y Koordinate auf dem Display
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position() {
        x = 0;
        y = 0;
    }

    public void add(Position position){
        this.x += position.getX();
        this.y += position.getY();
    }

}
