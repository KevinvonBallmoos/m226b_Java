package edu.mockito;

import lombok.val;

import java.util.ArrayList;
import java.util.List;

public class PersonParser {

    private final FileDAOStub dao;

    /**
     * Erstellt einen neuen Parser für das Einlesen von Personendaten.
     *
     * @param dao Data Access Object
     */
    public PersonParser(FileDAOStub dao) {
        this.dao = dao;
    }


    public List<Person> parse() {
        List<Person> list = new ArrayList<>();
        String[] personData = dao.readNextLine();
        while (personData != null && personData.length == 3) {
            val person = new Person(
                    personData[0],
                    personData[1],
                    Integer.parseInt(personData[2]));
            list.add(person);
            personData = dao.readNextLine();
        }
        return list;
    }

}
