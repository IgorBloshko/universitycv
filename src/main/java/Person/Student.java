package Person;

import Educations.Course;

import java.util.Objects;

public class Student extends Person {
    private Course course;

    public Student(String firstName, String lastName, int age, String education, Course course) {
        super(firstName, lastName, age, education);
        this.course = course;
    }


    public Course getCourse() {
        return course;
    }

    public void setCourse() {
        this.course = course;
    }


    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), course);
    }

}
