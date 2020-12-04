package edu.Grafikeditor.model;

import lombok.Getter;

/**
 * class GraphicsStub, has Override Methods from the ConcreteGraphics class
 *
 * @author Kevin
 */
@Getter
public class GraphicsStub extends ConcreteGraphics {

    private static int numberOfCalls;
    private int x, y;
    private int width, height;

    /**
     * getter for variable numberOfCalls
     * @return variable numberOfCalls
     */
    public static int getNumberOfCalls() {
        return numberOfCalls;
    }

    /**
     * Override Method from drawRect
     * @param x x
     * @param y y
     * @param width width
     * @param height height
     */
    @Override
    public void drawRect(int x, int y, int width, int height) {
        numberOfCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Override Method from drawOval
     * @param x x
     * @param y y
     * @param width width
     * @param height height
     */
    @Override
    public void drawOval(int x, int y, int width, int height) {
        numberOfCalls++;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

}
