package Utils;

import Educations.Subject;

import java.util.ArrayList;

public class SubjectUtil {

    public static ArrayList<Subject> createSubjectList() {
        ArrayList<Subject> subjects = new ArrayList<>();
        Subject sub1 = new Subject("biology", 76);
        Subject sub2 = new Subject("physics", 64);
        Subject sub3 = new Subject("english", 70);
        Subject sub4 = new Subject("chemistry", 52);
        Subject sub5 = new Subject("mathematics", 70);
        subjects.add(sub1);
        subjects.add(sub2);
        subjects.add(sub3);
        subjects.add(sub4);
        subjects.add(sub5);
        return subjects;
    }
}

