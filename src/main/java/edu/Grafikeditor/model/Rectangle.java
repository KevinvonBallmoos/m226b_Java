package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

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
     *
     * @param height Länge des Rechteckes
     * @param width  Breite des Rechteckes
     */
    public Rectangle(int height, int width) {
        this(new Position(), height, width);
    }

    /**
     * Erstellen eines neuen Rechteckes. Die Position [x,y] entspricht
     * der oberen, linken Ecke des Rechteckes.
     *
     * @param position Position des Rechteckes auf dem Display
     * @param height   Länge des Rechteckes
     * @param width    Breite des Rechteckes
     */
    public Rectangle(Position position, int height, int width) {
        this.setPosition(position);
        this.height = height;
        this.width = width;
    }
    public Rectangle(int x, int y, int height, int width){
        this(new Position(x,y), height, width);
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */

    @Override
    public void moveTo(Position position) {
        this.getPosition().add(position);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.drawRect(
                getPosition().getX(),
                getPosition().getY(),
                getWidth(), getHeight());
    }

}


