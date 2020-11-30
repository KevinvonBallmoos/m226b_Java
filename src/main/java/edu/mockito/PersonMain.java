package edu.mockito;

import java.util.List;

public class PersonMain {

    public static void main(String[] args) {
        PersonParser parser = new PersonParser(new FileDAOStub());

        List<Person> list = parser.parse();
        System.out.println(list);
    }
}
