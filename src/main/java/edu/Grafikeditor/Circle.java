package edu.Grafikeditor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class Circle extends Figure {

    /**
     * Radius des Kreises.
     */
    private int radius;

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
        this.radius = this.getRadius();
        int diameter = radius * 2;
        g.drawOval(
                this.getPosition().getX() - radius,
                this.getPosition().getY() - radius,
                diameter, diameter);
    }
}
