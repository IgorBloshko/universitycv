package com.company.person;
import com.company.educations.Course;
import com.company.educations.Exam;
import com.company.educations.Subject;
import com.company.interfaces.IExam;
import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Student extends Person implements IExam {
public Course course;
public int examScore;

    private static final Logger LOGGER = LogManager.getLogger(Student.class);
    public Student(String firstName, String lastName, int age, String education, Course course) {
        super(firstName, lastName, age, education);

    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public int passedExam(Subject subject) {
        examScore = RandomUtils.nextInt(1, 6);
        LOGGER.info(" Student pass exam with " + subject +  " and get estimate " + examScore);
        return examScore;
    }

    @Override
    public void failedExam (Subject subject) {
        LOGGER.info(" Retake! Student failed exam with " + subject);
}
}