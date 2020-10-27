package edu.aufgabe4;

import java.util.ArrayList;

public class Chef extends Employee {

    ArrayList<Employee> specialist = new ArrayList<>();

    public Chef(int personal_id, String first_name, String last_name, String division) {
        super(personal_id, first_name, last_name, division);

    }

    public Chef(){


    }
    public Chef(String first_name, String last_name){
        super(first_name, last_name);

    }
}
