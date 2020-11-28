package edu.mockito;

import edu.Grafikeditor.model.Figure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

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
        assertEquals();
    }
}