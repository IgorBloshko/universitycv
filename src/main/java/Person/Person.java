
package Person;

import java.util.Objects;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private String education;


    public Person(String firstName, String lastName, Integer age, String education) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.education = education;

    }

    protected Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(age, person.age) && Objects.equals(education, person.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, education);
    }
}
