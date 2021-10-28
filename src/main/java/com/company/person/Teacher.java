package com.company.person;

public class Teacher extends Person {
    private String gender;
    private int experienceYear;
    private int estimate;

    public Teacher(String firstName, String lastName, Integer age, String education, String gender, int experienceYear) {
        super(firstName, lastName, age, education);
        this.gender = gender;
        this.experienceYear = experienceYear;

    }

    public static boolean estimateExam(Student student) {
        return false;
    }

    public Teacher(int estimate) {
        this.estimate = estimate;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}


