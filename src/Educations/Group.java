package Educations;

import java.util.Objects;

public class Group {
    private int groupNumber;
    private int studentsGroup;

       public Group (int groupNumber, int studentsGroup) {

           this.setGroupNumber(groupNumber);
           this.studentsGroup = studentsGroup;
       }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getStudentsGroup() {
        return studentsGroup;
    }

    public void setStudentsGroup(int studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", studentsGroup=" + studentsGroup +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return groupNumber == group.groupNumber && studentsGroup == group.studentsGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNumber, studentsGroup);
    }
}

