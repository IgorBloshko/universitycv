package Educations;

import java.util.Objects;

class EducationDegree {
    String degree; 
        EducationDegree (String degree){
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "EducationDegree{" +
                "degree='" + degree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationDegree that = (EducationDegree) o;
        return Objects.equals(degree, that.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(degree);
    }
}


