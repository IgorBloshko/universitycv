package com.company.educations;

import com.company.person.Student;
import com.company.person.Teacher;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Exam {
    private static final Logger LOGGER = LogManager.getLogger(Exam.class);
    private Student student;
    private Teacher teacher;
    private Subject subject;
    public int estimate;

    public Exam(Student student, Teacher teacher, Subject subject) {
        this.student = student;
        this.teacher = teacher;
        this.subject = subject;
    }

    public int getEstimate() {
        return estimate;
    }


    public Exam() {
    }

    public int scoreExam() throws IllegalArgumentException {
        int tried = 3;
        boolean exams = false;
        int estimate = RandomUtils.nextInt(0, 6);
        while (!exams && tried > 0 || estimate > 3) {
           student.passedExam(subject);
            //LOGGER.info( student + " passed exam with " + subject + " and get score " + estimate);
            exams = teacher.estimateExam(student);
            //LOGGER.info(" Teacher gives an estimate " + subject);
            tried--;
                 }
        if (estimate == 0 || estimate == 1 || estimate == 2) {
            throw new IllegalArgumentException(" The estimate should be more than 2 ");

        } else {
            student.failedExam(subject);
           LOGGER.info(" Retake! Student failed exam with " + subject);
            this.estimate = estimate;
            return estimate;
        }

    }
}

