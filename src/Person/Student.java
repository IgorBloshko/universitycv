package Person;

import Educations.Course;
import Educations.Subject;

import java.util.Objects;

public class Student extends Person {
    public Course course;
      public Student(String firstName, String lastName, Integer age, String education, Course course) {
        super(firstName, lastName, age, education);
        this.course = course;
    }

      public void resultExam(Subject sub1) {

}
    public Course getCourse() {
        return course;
    }

    public void setCourse() {
        this.course = course;
    }


    @Override
    public String toString() {
        return super.toString()+ "Student{" +
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
