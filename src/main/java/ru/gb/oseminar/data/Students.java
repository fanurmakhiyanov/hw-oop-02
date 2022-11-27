package ru.gb.oseminar.data;

public class Students extends User {

    private Long studentID;

    public Students(String firstName, String patronymic, String lastName, Long studentID) {
        super(firstName, patronymic, lastName);
        this.studentID = studentID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }
}
