package edu.Grafikeditor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    private final  GraphicsStub graphics = new GraphicsStub();
    private Circle circle;

    @BeforeEach
    void setUp() {
    circle = new Circle(100, 100, 15);
    }

    @Test
    void draw() {
        circle.draw(graphics);

        assertEquals(1, GraphicsStub.getNumberOfCalls());
        assertEquals(85, graphics.getX());
        assertEquals(85, graphics.getY());
        assertEquals(30, graphics.getHeight());
        assertEquals(30, graphics.getWidth());
    }
}