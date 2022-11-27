package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.Teachers;
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
                           String patronymic,
                           String lastName) {
        Long id = 0L;
        for (User item : this.users) {
            if (item instanceof Students) {
                if (id < ((Students) item).getStudentID()) {
                    id = ((Students) item).getStudentID();
                }
            }
        }
        this.users.add(new Students(firstName, patronymic, lastName, id++));
    }

    public Teachers createUser(String firstName, String patronymic, String lastName, Long Id) {
        return new Teachers(firstName, patronymic, lastName, Id);
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

    public List<Students> getAllStudents(){
        List<Students> listStudents = new ArrayList<>();
        for (User user:this.getAll()){
            if(user instanceof Students) {
                listStudents.add((Students) user);
            }
        }
        return listStudents;
    }

}
