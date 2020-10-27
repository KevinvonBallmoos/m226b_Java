package edu.aufgabe4;

import java.util.List;
import java.util.Arrays;

public class Company {

    private final List<Employee> employees;

    public Company(Employee[] persons) {
        this.employees = Arrays.asList(persons);
    }


    public static void main(String[] args) {
        Company company = new Company(
                new Employee[]{
                        new Chef("Dan", "Parker"),
                        new Specialist("Andrew", "Webber")
                }); // <
    }

}