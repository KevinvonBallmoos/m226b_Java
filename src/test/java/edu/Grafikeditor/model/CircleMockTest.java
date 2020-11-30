package edu.Grafikeditor.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.awt.*;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleMockTest {

    // Erstellen eines Objektes mitz Hilfe von Mockito
    private final Graphics graphics = mock(Graphics.class);
    private Circle circle;


    @BeforeEach
    void setUp() {
        circle = new Circle(100, 100, 15);
    }

    @Test
    void draw() {
        circle.draw(graphics);

        verify(graphics, times(1)).drawOval(85,85,30,30);
    }
}