package Build;

import java.util.Objects;

public class Building {
    private String universityFaculty;
    private String universityChair;

    public Building(String universityFaculty, String universityChair) {

        this.universityFaculty = universityFaculty;
        this.universityChair = universityChair;
    }

    public String getUniversityFaculty() {
        return universityFaculty;
    }

    public void setUniversityFaculty(String UniversityFaculty) {
        this.universityFaculty = universityFaculty;
    }

    public String getUniversityChair() {
        return universityChair;
    }

    public void setUniversityChair() {
        this.universityChair = universityChair;
    }

    @Override
    public String toString() {
        return "Building{" +
                "universityFaculty='" + universityFaculty + '\'' +
                ", universityChair='" + universityChair + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(universityFaculty, building.universityFaculty) && Objects.equals(universityChair, building.universityChair);
    }

    @Override
    public int hashCode() {
        return Objects.hash(universityFaculty, universityChair);
    }
}

