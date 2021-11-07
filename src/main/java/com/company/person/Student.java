package com.company.person;
import com.company.educations.Course;
import com.company.educations.Subject;
import com.company.interfaces.Exam;

public class Student extends Person implements Exam {
public Course course;

    public Student(String firstName, String lastName, int age, String education, Course course) {
        super(firstName, lastName, age, education);

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public void passedExam(Subject subject) {

    }

@Override
    public void failedExam (Subject subject) {

}
}