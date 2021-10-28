package com.company.utils;

import com.company.person.Teacher;

import java.util.ArrayList;

public class TeacherUtil {

    public static ArrayList<Teacher> createTeacherList() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add (new Teacher("Antony", "Hopkins", 44, "high", "male", 12));
        teachers.add (new Teacher("Brad", "Pitt", 51, "high", "male", 16));
        teachers.add (new Teacher("Amanda", "Trevor", 48, "high", "female", 8));
        teachers.add (new Teacher("Jack", "London", 62, "high", "male", 24));
        teachers.add (new Teacher("John", "Doe", 40, "high", "female", 8));
        return teachers;

    }
}