package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

/**
 * class Rectangle, creating, drawing and moving a rectangle
 *
 * @author Kevin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Rectangle extends Figure {

    private final int height, width;

    /**
     * 1. Constructor, creates a new rectangle
     *
     * @param height length of the rectangle
     * @param width  width of the rectangle
     */
    public Rectangle(int height, int width) {
        this(new Position(), height, width);
    }

    /**
     * 2. Constructor, creates a new rectangle
     *
     * @param position Position of the rectangle on the display
     * @param height   length of the rectangle
     * @param width    width of the rectangle
     */
    public Rectangle(Position position, int height, int width) {
        this.setPosition(position);
        this.height = height;
        this.width = width;
    }

    /**
     * 3. Constructor, creates a new rectangle
     *
     * @param x      equals the start position of the rectangle on the display
     * @param y      equals the start position of the rectangle on the display
     * @param height length of the rectangle on the display
     * @param width  width of the rectangle on the display
     */
    public Rectangle(int x, int y, int height, int width) {
        this(new Position(x, y), height, width);
    }

    /**
     * moveTo method to move the rectangle across the graphic interface (hardcoded), no mouse events
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
        graphics.drawRect(
                getPosition().getX(),
                getPosition().getY(),
                getWidth(), getHeight());
    }

    /**
     * clones the state/position of the object
     * @return the actual state/position
     */
    @Override
    public Rectangle clone() {
        return new Rectangle(getPosition().clone(), height, width);
    }
}


