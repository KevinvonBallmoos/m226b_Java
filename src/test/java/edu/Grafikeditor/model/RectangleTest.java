package edu.Grafikeditor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private final GraphicsStub graphics = new GraphicsStub();
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(100, 150);
    }

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