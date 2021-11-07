package com.company.interfaces;

import com.company.educations.Subject;

public interface Exam {
    void passedExam(Subject subject);


    void failedExam(Subject subject);
}