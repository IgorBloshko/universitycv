package Educations;

public class Subject {
    private String name;
    private Integer totalHours;

    public Subject(String name, Integer totalHours) {
        this.name = name;
        this.totalHours = totalHours;

    }

    public String getName() {
        return name;
    }

    public Integer getTotalHours() {
        return totalHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalHours(Integer totalHours) {
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
