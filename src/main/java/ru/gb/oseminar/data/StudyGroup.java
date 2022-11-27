package ru.gb.oseminar.data;

import java.util.List;

public class StudyGroup {

    private Teachers teacher;
    private List<Students> studentsList;

    public StudyGroup(Teachers teacher, List<Students> studentsList) {
        this.teacher = teacher;
        this.studentsList = studentsList;
    }

    public Teachers getTeacher() {
        return teacher;
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public List<Students> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                " teacher = " + teacher +
                ", studentsList = " + studentsList +
                '}';
    }
}
