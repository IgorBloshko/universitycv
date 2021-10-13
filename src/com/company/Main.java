package com.company;

import Educations.Course;
import Educations.Subject;
import Person.Student;
import Person.Teacher;

import java.util.Random;

public class Main {
    public static void main(String[] arg) {
        //ArrayList<Student> students = new ArrayList<>();
        Course c = new Course("first", "History", 21);
        Student s1 = new Student("Alex", "Pronto", 17, "entrant", c);
        Teacher t2 = new Teacher("Antony", "Hopkins", 44, "high", "male", 12);
        Teacher t3 = new Teacher("Brad", "Pitt", 51, "high", "male", 16);
        Teacher t4 = new Teacher("Amanda", "Bremor", 48, "high", "female", 8);
        Teacher t5 = new Teacher("Jack", "London", 62, "high", "male", 24);
        Teacher t1 = new Teacher("John", "Doe", 40, "high", "female", 8);
        Subject sub1 = new Subject("biology", 76);
        Subject sub2 = new Subject("physics", 64);
        Subject sub3 = new Subject("english", 70);
        Subject sub4 = new Subject("chemistry", 52);
        Subject sub5 = new Subject("mathematics", 70);

        s1.resultExam(sub1);
        t1.estimateExam(s1);
        {
            Random estimateExam1 = new Random();
            int estimate1 = estimateExam1.nextInt(6);
            if (estimate1 < 4) {
                System.out.println(s1 + " Passed exam in " + sub1 + t1 + " and get " + estimate1 + " score " + " 'There is no Scholarship'");
            } else if (estimate1 > 4) {
                System.out.println(s1 + " Successfully get a scholarship " + sub1 + t1 + " and get score " + estimate1 + "");
            }


        }

        s1.resultExam(sub2);
        t2.estimateExam(s1);
        {
            Random estimateExam2 = new Random();
            int estimate2 = estimateExam2.nextInt(6);
            if (estimate2 < 4) {
                System.out.println(s1 + " Passed exam in " + sub2 + t2 + " and get " + estimate2 + " score " + " 'There is no Scholarship'");
            } else if (estimate2 > 4) {
                System.out.println(s1 + " Successfully get a scholarship " + sub2 + t2 + " and get score " + estimate2 + "");

            }


        }
        s1.resultExam(sub3);
        t3.estimateExam(s1);
        {
            Random estimateExam3 = new Random();
            int estimate3 = estimateExam3.nextInt(6);
            if (estimate3 < 4) {
                System.out.println(s1 + " Passed exam in " + sub3 + t3 + " and get " + estimate3 + " score " + "'There is no Scholarship'");
            } else if (estimate3 > 4) {
                System.out.println(s1 + " Successfully get a scholarship " + sub3 + t3 + " and get score " + estimate3 + "");

            }


        }

        s1.resultExam(sub4);
        t4.estimateExam(s1);

        {
            Random estimateExam4 = new Random();
            int estimate4 = estimateExam4.nextInt(6);
            if (estimate4 < 4) {
                System.out.println(s1 + " Passed exam in " + sub4 + t4 + "and get " + estimate4 + " score " + "'There is no Scholarship'");
            } else if (estimate4 > 4) {
                System.out.println(s1 + " Successfully get a scholarship " + sub4 + t4 + " and get score " + estimate4 + "");

            }


        }
        s1.resultExam(sub5);
        t5.estimateExam(s1);
        {
            Random estimateExam5 = new Random();
            int estimate5 = estimateExam5.nextInt(6);
            if (estimate5 < 4) {
                System.out.println(s1 + " Passed exam in " + sub5 + t5 + " and get " + estimate5 + " score " + "'There is no Scholarship'");
            } else if (estimate5 > 4) {
                System.out.println(s1 + " Successfully get a scholarship " + sub5 + t5 + " and get score " + estimate5 + "");

            }


        }
    }
}


//ArrayList<Teacher> CreateTeacherList;
// ArrayList<Teacher> teachers = new ArrayList<>();

//
//       // teachers.add(t1);
//teachers.add(t2);
//teachers.add(t3);
// teachers.add(t4);
// teachers.add(t5);
//        PassExam passExam1 = new PassExam("four");
//        PassExam passExam2 = new PassExam("three");
//        PassExam passExam3 = new PassExam("five");
//        PassExam passExam4 = new PassExam("five");
//        PassExam passExam5 = new PassExam("four");


//        {
//            Random passExam1 = new Random();
//            int num = passExam1.nextInt(6);
//            if (num < 4) {
//                System.out.println("Don't get a scholarship " + num + "");
//            } else if (num > 4) {
//                System.out.println("Get a scholarship " + num + "");
//
//            }
//
//        }


// sum ()