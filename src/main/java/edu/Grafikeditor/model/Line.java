package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

/**
 * class Line, creating, drawing and moving a line
 *
 * @author Kevin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Line extends Figure {

    private Position end;

    /**
     * 1. Constructor, creates a new line
     *
     * @param start Startposition der Linie auf dem Display
     * @param end   end position of the line on the display
     */
    public Line(Position start, Position end) {
        this.setPosition(start);
        this.end = end;
    }

    /**
     * 2. Constructor, creates a new line
     *
     * @param x    equals the start position of the line on the display
     * @param y    equals the start position of the line on the display
     * @param endX end position of the line on the display
     * @param endY end position of the line on the display
     */
    public Line(int x, int y, int endX, int endY) {
        this(new Position(x, y), new Position(endX, endY));
    }

    /**
     * moveTo method to move the line across the graphic interface (hardcoded), no mouse events
     *
     * @param position is required to move the figure to another position
     */
    @Override
    public void moveTo(Position position) {
        this.getPosition().add(position);
        end.add(position);
    }

    /**
     * draw method to draw it to the graphic interface
     *
     * @param graphics is required to draw the figure
     */
    @Override
    public void draw(Graphics graphics) {
        graphics.drawLine(this.getPosition().getX(),
                this.getPosition().getY(),
                this.getEnd().getX(),
                this.getEnd().getY());
    }

    /**
     * clones the state/position of the object
     * @return the actual state/position
     */
    @Override
    public Line clone() {
       return new Line(getPosition().clone(), end.clone());
    }
}

