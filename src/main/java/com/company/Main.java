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

import static com.company.utils.StudentUtil.createStudentList;
import static com.company.utils.TeacherUtil.createTeacherList;


public class Main {
    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] arg) {

        Teacher teacher1 = createTeacherList().get(0);
        Student student = createStudentList().get(0);
        Subject subject1 = SubjectUtil.createSubjectList().get(0);
        Teacher teacher2 = createTeacherList().get(1);
        Subject subject2 = SubjectUtil.createSubjectList().get(1);
        Teacher teacher3 = createTeacherList().get(2);
        Subject subject3 = SubjectUtil.createSubjectList().get(2);
        Teacher teacher4 = createTeacherList().get(3);
        Subject subject4 = SubjectUtil.createSubjectList().get(3);
        Teacher teacher5 = createTeacherList().get(4);
        Subject subject5 = SubjectUtil.createSubjectList().get(4);

           {
            createStudentList()
                    .stream()
                    .filter(n->n.getAge()==18)
                    .forEach(LOGGER::info);
        }

        {
            createTeacherList()
                    .stream()
                    .filter(n->n.getExperienceYear()>20)
                    .forEach(LOGGER::info);
        }

        {
            createTeacherList()
                    .stream()
                    .filter(n->n.getAge()>45)
                    .map(n-> n.getFirstName())
                    .sorted()
                    .forEach(LOGGER::info);
                }
        {
            SubjectUtil.createSubjectList()
                    .stream()
                    .filter(n->n.getName()=="biology")
                    .map(n-> n.getName())
                    .sorted()
                    .forEach(LOGGER::info);
        }

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
    if (AVG >= 4) {
    LOGGER.info(" Student get an avg " + AVG + " score from 5 subjects and get a scholarship. Congratulations!!! ");
    }
    else {
    LOGGER.info(" Student get an avg " + AVG + " score for 5 subjects and not pretend on scholarship" );
}

//String verify = "false";
//    boolean tester = Boolean.parseBoolean(verify);
//        System.out.println(tester);
//        double digit = 3.14;
//        String number = String.valueOf(digit);
//        System.out.println(number);
}

}


