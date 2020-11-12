package edu.aufgabe1;

import lombok.Getter;
import lombok.ToString;

import java.awt.*;

@Getter
@ToString
public class Circle extends Figure {

    /**
     * Radius des Kreises.
     */
    private final int radius;

    /**
     * Erstellen eines neuen Kreises.
     *
     * @param radius Radius des Kreises
     */
    public Circle(int radius) {
        this(new Position(), radius);
    }

    /**
     * Erstellen eines neuen Kreises.
     *
     * @param position Position des Kreises auf dem Display
     * @param radius   Radius des Kreises
     */
    public Circle(Position position, int radius) {
        super(position);
        this.radius = radius;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */

    @Override
    public void moveTo(Position position){


    }

    @Override
    public void draw(Graphics g) {

        int radius = this.getRadius();
        int diameter = radius * 2;
        g.drawOval(
                this.getPosition().getX() - radius,
                this.getPosition().getY() - radius,
                diameter, diameter);
    }
}
