package com.company;
import com.company.educations.Course;
import com.company.educations.Exam;
import com.company.educations.Subject;
import com.company.person.Student;
import com.company.person.Teacher;
import com.company.utils.StudentUtil;
import com.company.utils.SubjectUtil;
import com.company.utils.TeacherUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] arg) {

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


        Exam exam1 = new Exam(student, teacher1, subject1);
        Exam exam2 = new Exam(student, teacher2, subject2);
        Exam exam3 = new Exam(student, teacher3, subject3);
        Exam exam4 = new Exam(student, teacher4, subject4);
        Exam exam5 = new Exam(student, teacher5, subject5);

        int score1 = exam1.scoreExam();
        int score2 = exam2.scoreExam();
        int score3 = exam3.scoreExam();
        int score4 = exam4.scoreExam();
        int score5 = exam5.scoreExam();

        final int AVG = (score1 + score2 + score3 + score4 + score5) / 5;
        LOGGER.error(" Student get an avg " + AVG + " score for 5 subjects " );


    }

}


