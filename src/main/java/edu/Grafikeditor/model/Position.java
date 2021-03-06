package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * class Position, creates or calculates a new position
 *
 * @author Kevin
 */
@Data
public class Position implements Cloneable {
    private int x, y;

    /**
     * 1. Constructor, creates a new position object
     *
     * @param x coordinate on the display
     * @param y coordinate on the display
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 2. Constructor, creates a new position object
     * void Constructor, takes 0 parameters
     */
    public Position() {
        x = 0;
        y = 0;
    }

    /**
     * add the position to the actual position
     *
     * @param position required to calculate the new position
     */
    public void add(Position position) {
        this.x += position.getX();
        this.y += position.getY();
    }

    /**
     * clones the state/position of the object
     * @return the actual state/position
     */
    @Override
    public Object clone() {
        return new Position(x, y);
    }
}
