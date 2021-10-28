package com.company.person;

import java.util.Objects;

public class EducationForm {
    private String form;
    private String education;

    EducationForm (String form, String education) {
        this.setForm(form);
        this.setEducation(education);
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "EducationForm{" +
                "form='" + form + '\'' +
                ", education='" + education + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EducationForm that = (EducationForm) o;
        return Objects.equals(form, that.form) && Objects.equals(education, that.education);
    }

    @Override
    public int hashCode() {
        return Objects.hash(form, education);
    }

}

