package com.company.person;

import com.company.educations.Exam;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Teacher extends Person {
    private String gender;
    private int experienceYear;
    private int estimate;

    private static final Logger LOGGER = LogManager.getLogger(Teacher.class);

    public Teacher(String firstName, String lastName, Integer age, String education, String gender, int experienceYear) {
        super(firstName, lastName, age, education);
        this.gender = gender;
        this.experienceYear = experienceYear;

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

    public static boolean estimateExam(Student student) {
        if (student.examScore >= 3) {
            LOGGER.info(student + " is passed exam ");
            return true;

    } else {
           LOGGER.error(student + " is failed exam ");
            return false;
    }
}
}



