package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.awt.*;

/**
 * class Circle, creating, drawing and moving a circle
 *
 * @author Kevin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Circle extends Figure {

    private final int radius;

    /**
     * 1. Constructor, creates a new circle
     *
     * @param radius to calculate the size of the circle
     */
    public Circle(int radius) {
        this(new Position(), radius);
    }

    /**
     * 2. Constructor, creates a new circle
     *
     * @param position start position on the display
     * @param radius   to calculate the size of the circle
     */
    public Circle(Position position, int radius) {
        this.setPosition(position);
        this.radius = radius;
    }

    /**
     * 3. Constructor, creates a new circle
     *
     * @param x      start position of the circle
     * @param y      start position of the circle
     * @param radius to calculate the size of the circle
     */
    public Circle(int x, int y, int radius) {
        this(new Position(x, y), radius);
    }


    /**
     * moveTo method to move the circle the graphic interface (hardcoded), no mouse events
     *
     * @param position is required to move the figure to another position
     */
    @Override
    public void moveTo(Position position) {
        this.getPosition().add(position);
    }

    /**
     * draw method to draw it to the graphic interface
     *
     * @param graphics is required to draw the figure
     */
    @Override
    public void draw(Graphics graphics) {
        int radius = getRadius();
        int diameter = radius * 2;
        graphics.drawOval(
                getPosition().getX() - radius,
                getPosition().getY() - radius,
                diameter, diameter);
    }

    /**
     * clones the state/position of the object
     * @return the actual state/position
     */
    @Override
    public Circle clone() {
        return new Circle(getPosition().clone(), radius);
    }
}
