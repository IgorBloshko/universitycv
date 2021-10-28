package com.company.utils;

import com.company.educations.Subject;

import java.util.ArrayList;

public class SubjectUtil {

    public static ArrayList<Subject> createSubjectList() {
        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("biology"));
        subjects.add(new Subject("physics"));
        subjects.add(new Subject("english"));
        subjects.add(new Subject("chemistry"));
        subjects.add(new Subject("mathematics"));
        return subjects;
    }
}

