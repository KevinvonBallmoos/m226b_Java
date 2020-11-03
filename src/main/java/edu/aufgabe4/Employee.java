package edu.aufgabe4;

public abstract class Employee {
    private int personal_id;
    private String last_name;
    private String first_name;
    private String division;


    public Employee(int personal_id, String first_name, String last_name, String division) {
        this.personal_id = personal_id;
        this.last_name = last_name;
        this.first_name = first_name;
        this.division = division;

    }

    public Employee() {

    }

    public Employee(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
