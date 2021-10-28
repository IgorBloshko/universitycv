package com.company;

import com.company.educations.Course;
import com.company.educations.Exam;
import com.company.educations.Subject;
import com.company.person.Student;
import com.company.person.Teacher;
import com.company.utils.StudentUtil;
import com.company.utils.SubjectUtil;
import com.company.utils.TeacherUtil;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] arg) {
        // LOGGER.info("Info message");
        // LOGGER.warn("Warn message");
        // LOGGER.error("Error");


        Teacher teacher1 = TeacherUtil.createTeacherList().get(0);
        Student student = StudentUtil.createStudentList().get(0);
        Subject subject1 = SubjectUtil.createSubjectList().get(0);
        Teacher teacher2 = TeacherUtil.createTeacherList().get(1);
        Subject subject2 = SubjectUtil.createSubjectList().get(1);
        Teacher teacher3 = TeacherUtil.createTeacherList().get(2);
        Subject subject3 = SubjectUtil.createSubjectList().get(2);
        Teacher teacher4 = TeacherUtil.createTeacherList().get(3);
        Subject subject4 = SubjectUtil.createSubjectList().get(3);
        Teacher teacher5 = TeacherUtil.createTeacherList().get(4);
        Subject subject5 = SubjectUtil.createSubjectList().get(4);


        Exam.examination(student, teacher1, subject1);
        Exam.examination(student, teacher2, subject2);
        Exam.examination(student, teacher3, subject3);
        Exam.examination(student, teacher4, subject4);
        Exam.examination(student, teacher5, subject5);

        Exam.estimateExam(student, subject1, subject2, subject3, subject4, subject5);

        RandomUtils.nextInt(0, 6);

        String name = Course.FIRST.getName();
        LOGGER.info(name);
        LOGGER.info(student);
        LOGGER.error(" Exam is failed ");



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


