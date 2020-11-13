package edu.aufgabe1;

import lombok.Data;

import java.awt.*;

@Data
public abstract class Figure extends Component{
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
    public abstract void draw(Graphics g);

    public void moveTo(Position position){

    }


}

