package com.company.utils;

import com.company.educations.Subject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class SubjectUtil {
    private static final Logger LOGGER = LogManager.getLogger(SubjectUtil.class);
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


