package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.*;
import ru.gb.oseminar.service.StudyGroupService;
import ru.gb.oseminar.service.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Controller {
    private final UserService userService = new UserService();
    private final StudentView studentsView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private List<Student> studentsList;

    public void createUser(String firstName, String patronymic, String lastName) {
        userService.createUser(firstName, patronymic, lastName);
    }

    public Teacher createTeacher(String firstName, String patronymic, String lastName, Long teacherId){
        return userService.createUser(firstName, patronymic, lastName, teacherId);
    }

    public void showAllStudents() {
        List<User> students = userService.getAll();
        studentsView.sendOnConsole(students);
    }

    public List<Student> getOnlyStudents(){
        return userService.getAllStudents();
    }

    public void showTeacherInfo(Teacher teachers) {
        List<User> teacher = new ArrayList<>();
        teacher.add(teachers);
        studentsView.sendOnConsole(teacher);
    }

    public void showStudyGroups(){
        studentsView.showStudyGroups(this.studyGroupService.getStudyGroupList());
    }

    public void showSortStudyGroup(List<Student> studentsList) {
        studentsList.sort(new StudyGroupComparator());
        studentsView.showStudents(studentsList);
    }

    public void createTimetable(Teacher teachers, List<Student> studentsList){
        studyGroupService.completeStudyGroup(teachers, studentsList);
    }

    public void showStudyGroups(List<StudyGroup> StudyGroups) {
        studentsView.showStudyGroups(StudyGroups);
    }

    public void showSortStudyGroup(List <Student> studentsList){
        studentsList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getLastName().equalsIgnoreCase(o2.getLastName())) {
                    return o1.getFirstName().compareTo(o2.getFirstName());
                }
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        studentsView.showStudents(studentsList);
    }

    public void showStudentsInGroups() {
        this.studentsView.showStudentsInGroup(this.studyGroupService.getStudyGroupList());
    }
}
