package com.company;

import java.io.Serializable;

public class Course implements Serializable{

    private String name;
    private int numOfStudents;

    public Course(String n, int i) {
        name = n;
        numOfStudents = i;
    }

    public Course() {
        this.name = null;
        this.numOfStudents = 0;
    }

    public void print() {
        System.out.printf(name + numOfStudents);
    }
}
