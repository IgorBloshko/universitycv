package com.company.educations;

import com.company.person.Student;
import com.company.person.Teacher;
import org.apache.commons.lang3.RandomUtils;

public class Exam {
    public int estimate;

    public Exam(int estimate) {
        this.estimate = estimate;
    }

    public int getEstimate() {
        return estimate;
    }

    public Exam() {
    }

    public static void examination(Student student, Teacher teacher, Subject subject) {
        int tried = 3;
        boolean exams = false;
        while (!exams && tried > 0) {
            student.passedExam(subject);
            exams = Teacher.estimateExam(student);
            tried--;

        }

    }

    public static void estimateExam(Student student, Subject subject1, Subject subject2, Subject subject3, Subject subject4,
                                    Subject subject) throws IllegalArgumentException {
        int estimate = RandomUtils.nextInt(0, 6);

        if (estimate == 0 || estimate == 1 || estimate == 2) {

            throw new IllegalArgumentException(" The estimate should be more than 2 ");
        } else {
           this.estimate = estimate;
        }

    }

}

