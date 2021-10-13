package Educations;

public class Subject {
    public String name;
    public Integer totalHours;

    public Subject (String name, Integer totalHours) {
        this.name = name;
        this.totalHours = totalHours;

           }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
