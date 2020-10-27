package edu.aufgabe4;

import lombok.Getter;
import lombok.ToString;


@Getter
@ToString
public class Apprentice extends Employee  {

    private int year_Of_Apprentice;
    Chef chef = new Chef(12,"Kevin", "von Ballmoos", "Lernender");

    public Apprentice(int personal_id, String last_name, String first_name, String division, int year_Of_Apprentice) {
        super(personal_id, last_name, first_name, division);
        this.year_Of_Apprentice = year_Of_Apprentice;
    }
}
