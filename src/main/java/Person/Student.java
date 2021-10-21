package Person;

import Interfaces.Exam;

public class Student extends Person implements Exam {

    public Student(String firstName, String lastName, int age, String education) {
        super(firstName, lastName, age, education);

    }


    @Override
    public void passedExam() {

    }
}