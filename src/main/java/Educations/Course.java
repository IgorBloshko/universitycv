package Educations;

import java.util.Objects;

public class Course {
    private String courseNumber;
    private String faculty;
    private int subjects;

    public Course(String courseNumber, String faculty, int subjects) {

        this.courseNumber = courseNumber;
        this.faculty = faculty;
        this.subjects = subjects;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getDepartment() {
        return faculty;
    }

    public void setDepartment(String department) {
        this.faculty = department;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNumber=" + courseNumber +
                ", subject='" + faculty + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseNumber == course.courseNumber && subjects == course.subjects && Objects.equals(faculty, course.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNumber, faculty, subjects);
    }
}
