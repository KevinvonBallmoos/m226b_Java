package edu.aufgabe1;

import lombok.Getter;
import lombok.ToString;

import javax.swing.*;
import java.awt.*;

@Getter
@ToString
public class Rectangle extends Figure {
    /**
     * Länge und Breite des Rechteckes.
     */
    private final int height, width;

    /**
     * Erstellen eines neuen Rechteckes.      *      * @param height Länge des Rechteckes      * @param width Breite des Rechteckes
     */
    public Rectangle(int height, int width) {
        this(new Position(), height, width);
    }

    /**
     * Erstellen eines neuen Rechteckes. Die Position [x,y] entspricht      * der oberen, linken Ecke des Rechteckes.      *      * @param position Position des Rechteckes auf dem Display      * @param height Länge des Rechteckes      * @param width Breite des Rechteckes
     */
    public Rectangle(Position position, int height, int width) {
        super(position);
        this.height = height;
        this.width = width;
    }

    /**
     * Zeichnet eine Figur auf dem Display.
     */
    @Override
    public void draw(Graphics g) {
        g.drawRect(
                this.getPosition().getX(),
                this.getPosition().getY(),
                this.getWidth(), this.getHeight());
    }

    @Override
    public void moveTo(Position position) {
        


    }
}


