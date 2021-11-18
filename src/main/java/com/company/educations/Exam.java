package com.company.educations;

import com.company.exceptions.EstimateException;
import com.company.person.Student;
import com.company.person.Teacher;
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

    public int scoreExam() throws EstimateException {
        int tried = 3;
        boolean exams = false;
        while (!exams && tried > 0) {
            estimate = student.passedExam(subject);
            exams = teacher.estimateExam(student);
            tried--;
        }
        if (estimate < 3) {
            student.failedExam(subject);
            {
                throw new EstimateException( " The estimate should be more than 2 ");
            }
                }
        return estimate;
    }
}