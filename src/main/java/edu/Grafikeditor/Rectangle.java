package edu.Grafikeditor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class Rectangle extends Figure {
    /**
     * Länge und Breite des Rechteckes.
     */
    private final int height, width;

    /**
     * Erstellen eines neuen Rechteckes.
     * @param height Länge des Rechteckes
     * @param width Breite des Rechteckes
     */
    public Rectangle(int height, int width) {
        this(new Position(), height, width);
    }

    /**
     * Erstellen eines neuen Rechteckes. Die Position [x,y] entspricht
     * der oberen, linken Ecke des Rechteckes.
     * @param position Position des Rechteckes auf dem Display
     * @param height Länge des Rechteckes
     * @param width Breite des Rechteckes
     */
    public Rectangle(Position position, int height, int width) {
        this.setPosition(position)
        this.height = height;
        this.width = width;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */

    @Override
    public void moveTo(Position position) {
//        this.getPosition().add
    }

    @Override
    public void draw(Graphics graphics) {
        g.drawRect(
                this.getPosition().getX(),
                this.getPosition().getY(),
                this.getWidth(), this.getHeight());
    }

}


