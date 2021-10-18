package Person;

public class Teacher extends Person {
    private String gender;
    private int experienceYear;
    private String resultExam;
    private int estimateExam;

    public Teacher(String firstName, String lastName, Integer age, String education, String gender, int experienceYear) {
        super(firstName, lastName, age, education);
        this.gender = gender;
        this.experienceYear = experienceYear;

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

    public void setResultExam(String resultExam) {
        this.resultExam = resultExam;
    }

    public void setEstimateExam(int estimateExam) {
        this.estimateExam = estimateExam;
    }
}


