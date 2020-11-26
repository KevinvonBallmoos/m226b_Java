package edu.mockito;

import lombok.Data;

/**
 * Repräsentiert eine Person
 */
@Data
public class Person {

    private final String firstName;
    private final String lastName;
    private final int ID;

    /**
     * Initialisieren einer neuen Person.
     *
     * @param firstName Vorname der Person
     * @param lastName  Nachname der Person
     * @param ID        Personalnummer der Person
     */
    public Person(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }
}


