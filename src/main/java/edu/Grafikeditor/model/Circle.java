package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.awt.*;

@Data
@EqualsAndHashCode(callSuper = true)
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
        this.setPosition(position);
        this.radius = radius;
    }

    public Circle(int x, int y, int radius){
        this(new Position(x,y), radius);
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */

    @Override
    public void moveTo(Position position){
    this.getPosition().add(position);
    }

    @Override
    public void draw(Graphics graphics) {
        int radius = getRadius();
        int diameter = radius * 2;
        graphics.drawOval(
                getPosition().getX() - radius,
                getPosition().getY() - radius,
                diameter, diameter);
    }
}
