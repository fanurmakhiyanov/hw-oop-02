package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName,
                           String lastName,
                           String patronymic) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Students) {
                if (id < ((Students) item).getStudentID()) {
                    id = ((Students) item).getStudentID();
                }
            }
        }
        this.users.add(new Students(firstName, lastName, patronymic, id++));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item: this.users) {
            if (item instanceof Students) {
                if (id.equals(((Students) item).getStudentID())) {
                    this.users.remove(item);
                }
            }
        }
    }
}
