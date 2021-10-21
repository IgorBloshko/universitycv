package Utils;

import Person.Student;

import java.util.ArrayList;

public class StudentUtil {
    public static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("Paul", "Gregor", 18, "entrant");
        students.add(student);
        return students;


    }


}
