package edu.aufgabe4;

public class Specialist extends Employee {
    Chef chef = new Chef();

    public Specialist(int personal_id, String last_name, String first_name, String division) {
        super(personal_id, last_name, first_name, division);
    }

    public Specialist(String first_name, String last_name) {
        super(first_name, last_name);

    }

}
