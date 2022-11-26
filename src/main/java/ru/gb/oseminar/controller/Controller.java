package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentsView;

import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentsView studentsView = new StudentsView();

    public void createUser(String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentsView.sendOfConsole(students);
    }
}
