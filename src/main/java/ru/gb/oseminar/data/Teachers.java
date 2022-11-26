package ru.gb.oseminar.data;

public class Teachers extends User {
    private Long teacherID;

    public Teachers(String firstName, String lastName, String patronymic, Long teacherID) {
        super(firstName, lastName, patronymic);
        this.teacherID = teacherID;
    }

    public Long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Long teacherID) {
        this.teacherID = teacherID;
    }
}
