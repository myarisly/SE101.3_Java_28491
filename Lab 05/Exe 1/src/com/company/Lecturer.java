package com.company;

public class Lecturer extends Person {
    // Specific attributes for Lecturer
    private String programme;

    // Constructor
    public Lecturer(String name, int id, String programme) {
        // Calling the constructor of the superclass (Person)
        super(name, id);
        this.programme = programme;
    }

    // Getter and setter for programme
    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }
}