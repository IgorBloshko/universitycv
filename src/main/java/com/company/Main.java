package com.company;

import Educations.Course;
import Educations.Subject;
import Person.Student;
import Person.Teacher;
import Utils.TeacherUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static void main(String[] arg) {
//
//        LOGGER.info("Info message");
//        LOGGER.warn("Info message");
//        LOGGER.error("asaasa");
        //Student s1 = new Student();
        Teacher t1 = (Teacher) TeacherUtil.createTeacherList().get(0);
        Teacher t2 = (Teacher) TeacherUtil.createTeacherList().get(1);
        Teacher t3 = (Teacher) TeacherUtil.createTeacherList().get(2);
        Teacher t4 = (Teacher) TeacherUtil.createTeacherList().get(3);
        Teacher t5 = (Teacher) TeacherUtil.createTeacherList().get(4);


       // s1.resultExam(sub1);
       // t1.estimateExam(s1);
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
//Course c = new Course("first", "History", 21);

// sum ()