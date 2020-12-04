package edu.Grafikeditor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.mockito.Mockito.*;

/**
 * class RectangleMockTest test method draw
 */
public class RectangleMockTest {


    private final Graphics graphics = mock(Graphics.class);
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

        verify(graphics, times(1)).drawRect(0, 0, 150, 100);
    }
}
