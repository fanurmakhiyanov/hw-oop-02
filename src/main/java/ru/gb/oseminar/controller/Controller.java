package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teachers;
import ru.gb.oseminar.data.User;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentsView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentsView studentsView = new StudentsView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createUser(String firstName, String patronymic, String lastName) {
        userService.createUser(firstName, patronymic, lastName);
    }

    public Teachers createTeacher(String firstName, String patronymic, String lastName, Long teacherId){
        return userService.createUser(firstName, patronymic, lastName, teacherId);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentsView.sendOnConsole(students);
    }

    public List<Students> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teachers teachers) {
        List<User> teacher = new ArrayList<>();
        teacher.add(teachers);
        studentsView.sendOnConsole(teacher);
    }

    public List<StudyGroup> createTimetable(Teachers teachers, List<Students> studentsList){
        return studyGroupService.completeStudyGroup(teachers, studentsList);
    }

    public void showStudyGroups(List<StudyGroup> StudyGroups) {
        studentsView.showStudyGroups(StudyGroups);
    }

    public void showSortStudyGroup(List <Students> studentsList){
        studentsList.sort(new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.getLastName().equalsIgnoreCase(o2.getLastName())) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        studentsView.showStudents(studentsList);
    }




}
