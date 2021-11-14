package com.company.utils;

import com.company.educations.Course;
import com.company.person.Student;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class StudentUtil {
    private static final Logger LOGGER = LogManager.getLogger(StudentUtil.class);
    public static ArrayList<Student> createStudentList() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Paul", "Gregor", 18, "entrant", Course.FIRST));
        return students;
    }

}
