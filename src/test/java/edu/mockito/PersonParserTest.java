package edu.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lombok.Getter;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonParserTest {


    private PersonParser parser;

    @BeforeEach
    void setUp() {
        parser = new PersonParser(new FileDAOStub());
    }

    @Test
    void parse() {
        List<Person> list = parser.parse();
        assertEquals(3, list.size());
        assertEquals("Kevin", list.get(0).getFirstName());
        assertEquals("Peter", list.get(1).getFirstName());
        assertEquals("vonBallmoos", list.get(0).getLastName());
    }
}
