package ru.gb.oseminar.data;

public abstract class User {
    private String firstName;
    private String patronymic;
    private String lastName;


    public User(String firstName, String patronymic, String lastName) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User {" +
                "firstName = '" + firstName + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", lastName = '" + lastName +'\'' +
                '}';
    }
}
