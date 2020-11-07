package edu.aufgabe1;

import lombok.Getter;
import lombok.ToString;

import javax.swing.*;
import java.awt.*;

@Getter
@ToString
public class Line extends Figure {
    /**
     * Endposition der Linie auf dem Display.
     */
    private final Position end;

    /**
     * Erstellen einer neuen Linie. Die Position [x,y] entspricht der      * Startposition der Linie auf dem Display.      *      * @param start Startposition der Linie auf dem Display      * @param end Endposition der Linie auf dem Display
     */
    public Line(Position start, Position end) {
        super(start);
        this.end = end;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */
    @Override
    public void draw(Graphics g) {

        g.drawLine(this.getPosition().getX(),
                this.getPosition().getY(),
                this.getEnd().getX(),
                this.getEnd().getY());
    }
}

