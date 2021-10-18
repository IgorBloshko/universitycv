package Utils;

import Person.Teacher;

import java.util.ArrayList;

public class TeacherUtil {

    public static ArrayList<Teacher> createTeacherList() {
        ArrayList<Teacher> teachers = new ArrayList<>();
            Teacher t1 = new Teacher("Antony", "Hopkins", 44, "high", "male", 12);
            Teacher t2 = new Teacher("Brad", "Pitt", 51, "high", "male", 16);
            Teacher t3 = new Teacher("Amanda", "Bremor", 48, "high", "female", 8);
            Teacher t4 = new Teacher("Jack", "London", 62, "high", "male", 24);
            Teacher t5 = new Teacher("John", "Doe", 40, "high", "female", 8);
            teachers.add(t1);
            teachers.add(t2);
            teachers.add(t3);
            teachers.add(t4);
            teachers.add(t5);
            return teachers;

    }
}