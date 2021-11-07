package com.company.utils;

import com.company.educations.Course;
import com.company.person.Student;

import java.util.ArrayList;

public class StudentUtil {
    public static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Paul", "Gregor", 18, "entrant", Course.FIRST));
        return students;
    }
}
