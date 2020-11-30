package edu.Grafikeditor.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.mockito.Mockito.*;

public class RectangleMockTest {

    // Erstellen eines Objektes mitz Hilfe von Mockito
    private final Graphics graphics = mock(Graphics.class);
    private Rectangle rectangle;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(100, 150);
    }

    @Test
    void draw() {
        rectangle.draw(graphics);

        // Die Überprüfung des korrekten Aufrufes und der korrekten Parameter
        // übernimmt an dieser Stelle nun auch Mockito
        verify(graphics, times(1)).drawRect(0, 0, 150, 100);
    }
}
