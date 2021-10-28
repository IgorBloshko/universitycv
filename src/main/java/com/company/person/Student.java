package com.company.person;
import com.company.educations.Subject;
import com.company.interfaces.Exam;

public class Student extends Person implements Exam {

    public Student(String firstName, String lastName, int age, String education) {
        super(firstName, lastName, age, education);

    }


    @Override
    public void passedExam(Subject subject) {

    }


}