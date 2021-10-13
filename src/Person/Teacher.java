package Person;

public class Teacher extends Person {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String education;
    private String gender;
    private int experienceYear;
    private String resultExam;
    private int estimateExam;

    public Teacher(String firstName, String lastName, Integer age, String education, String gender, int experienceYear) {
        super(firstName, lastName, age, education);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.experienceYear = experienceYear;
        this.resultExam = resultExam;
        this.estimateExam = estimateExam;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }
    public void estimateExam(Student s1) {

    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getResultExam() {
        return resultExam;
    }

    public int getEstimateExam() {
        return estimateExam;
    }

}


