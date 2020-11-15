package edu.Grafikeditor.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.*;

/**
 * class Figure, bequeath to circle, rectangle and line
 * extends class Container
 *
 * @author Kevin
 */
@Data
@EqualsAndHashCode(callSuper = true)
public abstract class Figure extends Container {

    private Position position;


    /**
     * draw method to draw the figures to the graphic interface
     * bequeath this method to circle, rectangle and line
     *
     * @param graphics is required to draw the figure
     */
    public abstract void draw(Graphics graphics);

}

