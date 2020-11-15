package edu.Grafikeditor.model;

/**
 * abstract class Container, contains all figures
 *
 * @author Kevin
 */
public abstract class Container extends java.awt.Container {

    /**
     * moveTo method to move the figures across the graphic interface (hardcoded), no mouse events
     * the figure and composite class inherits this method, and circle, line and rectangle inherits from figure
     *
     * @param position is required to move the figure to another position
     */
    public abstract void moveTo(Position position);
}
