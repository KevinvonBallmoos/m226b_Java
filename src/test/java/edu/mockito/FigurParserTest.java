package edu.mockito;

import edu.Grafikeditor.model.Figure;
import edu.Grafikeditor.model.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class FigurParserTest {

    private FigurParser parser;

    @BeforeEach
    void setUp() {
        parser = new FigurParser(new FigureFileDAOStub());
    }

    @Test
    void parse() {
        List<Figure> list = parser.parse();
        assertEquals(3, list.size());
        assertEquals(200, list.get(0).getPosition().getX());
        assertEquals(100, list.get(1).getPosition().getY());
        assertEquals(400, list.get(2).getPosition().getX());
        assertEquals("Rectangle", list.get(0).getName());

    }
}
