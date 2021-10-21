package com.company;


import Educations.Subject;
import Person.Student;
import Person.Teacher;
import Utils.StudentUtil;
import Utils.SubjectUtil;
import Utils.TeacherUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;


public class Main {
    private static final Logger Logger = LogManager.getLogger(Main.class);

    public static void main(String[] arg) {
        Teacher t1 = TeacherUtil.createTeacherList().get(0);
        Student student = StudentUtil.createStudentList().get(0);
        Subject sub1 = SubjectUtil.createSubjectList().get(0);
        Teacher t2 = TeacherUtil.createTeacherList().get(1);
        Subject sub2 = SubjectUtil.createSubjectList().get(1);
        Teacher t3 = TeacherUtil.createTeacherList().get(2);
        Subject sub3 = SubjectUtil.createSubjectList().get(2);
        Teacher t4 = TeacherUtil.createTeacherList().get(3);
        Subject sub4 = SubjectUtil.createSubjectList().get(3);
        Teacher t5 = TeacherUtil.createTeacherList().get(4);
        Subject sub5 = SubjectUtil.createSubjectList().get(4);

        int estimate1;
        {
            Random estimateExam1 = new Random();
            estimate1 = estimateExam1.nextInt(6);
            if (estimate1 < 4) {
                System.out.println(student + " Passed exam in " + sub1 + t1 + " and get " + estimate1 + " score " + " ");
            } else if (estimate1 > 4) {
                System.out.println(student + " Successfully " + sub1 + t1 + " and get score " + estimate1 + "");
            }

        }

        int estimate2;
        {
            Random estimateExam2 = new Random();
            estimate2 = estimateExam2.nextInt(6);
            if (estimate2 < 4) {
                System.out.println(student + " Passed exam in " + sub2 + t2 + " and get " + estimate2 + " score " + " ");
            } else if (estimate2 > 4) {
                System.out.println(student + " Successfully " + sub2 + t2 + " and get score " + estimate2 + "");
            }

        }
        int estimate3;
        {
            Random estimateExam3 = new Random();
            estimate3 = estimateExam3.nextInt(6);
            if (estimate3 < 4) {
                System.out.println(student + " Passed exam in " + sub3 + t3 + " and get " + estimate3 + " score " + " ");
            } else if (estimate3 > 4) {
                System.out.println(student + " Successfully " + sub3 + t3 + " and get score " + estimate3 + "");
            }

        }
        int estimate4;
        {
            Random estimateExam4 = new Random();
            estimate4 = estimateExam4.nextInt(6);
            if (estimate4 < 4) {
                System.out.println(student + " Passed exam in " + sub4 + t4 + " and get " + estimate4 + " score " + " ");
            } else if (estimate4 > 4) {
                System.out.println(student + " Successfully " + sub4 + t4 + " and get score " + estimate4 + "");
            }

        }
        int estimate5;
        {
            Random estimateExam5 = new Random();
            estimate5 = estimateExam5.nextInt(6);
            if (estimate5 < 4) {
                System.out.println(student + " Passed exam in " + sub5 + t5 + " and get " + estimate5 + " score " + " ");
            } else if (estimate5 > 4) {
                System.out.println(student + " Successfully " + sub5 + t5 + " and get score " + estimate5 + "");
            }
        }
        int estimateFinal = (estimate1 + estimate2 + estimate3 + estimate4 + estimate5) / 5;
        if (estimateFinal < 4) {
            System.out.println(student + " Passed exam and get " + estimateFinal + " score " + " 'There is no Scholarship'");
        } else if (estimateFinal > 4)
            System.out.println(student + " Congratulations scholarship " + estimateFinal);
    }

}

//
//        LOGGER.info("Info message");
//        LOGGER.warn("Info message");
//        LOGGER.error("asaasa");

//         public Teacher(int estimateExam) throws IllegalArgumentException {
//            super(estimateExam);
//            if (estimateExam == 0 || estimateExam == 1 || estimateExam == 2) {
//                throw new IllegalArgumentException("The estimate should be more than 3");
//            } else {
//                this.estimateExam = estimateExam;
//            }
//
//            System.out.println("прпрпр ");


//
//       // s1.resultExam(sub1);
//       // t1.estimateExam(s1);
//

