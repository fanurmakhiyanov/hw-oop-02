package ru.gb.oseminar.data;

public class Teachers extends User {
    private Long teacherID;

    public Teachers(String firstName, String patronymic, String lastName, Long teacherID) {
        super(firstName, patronymic, lastName);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
}
