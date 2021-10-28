package com.company.educations;

public enum Course {
    FIRST("first"),
    SECOND("second"),
    THIRD("third"),
    FOURTH("fourth"),
    FIFTH("fifth");

    private String name;

    Course(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
