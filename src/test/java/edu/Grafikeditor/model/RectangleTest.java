package edu.Grafikeditor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * class RectangleTest test method draw
 */
class RectangleTest {

    private final GraphicsStub graphics = new GraphicsStub();
    private Rectangle rectangle;

    /**
     * setup creates a new Rectangle
     */
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(100, 150);
    }

    /**
     * The calling of the methods anc comparing of the parameters will be done by mockito
     */
    @Test
    void draw() {
        rectangle.draw(graphics);

        assertEquals(2, GraphicsStub.getNumberOfCalls());
        assertEquals(0, graphics.getX());
        assertEquals(0, graphics.getY());
        assertEquals(100, graphics.getHeight());
        assertEquals(150, graphics.getWidth());
    }

}