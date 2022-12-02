package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.StudyGroupComparator;
import ru.gb.oseminar.data.User;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (StudyGroup group : studyGroups) {
            log.info(group.toString());
        }
    }

    public void showStudents(List<Student> students ){
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (Student group : students) {
            log.info(group.toString());
        }
    }

    public void showStudentsInGroup( List<StudyGroup> studyGroupList){
        Logger log = Logger.getAnonymousLogger();
        for (StudyGroup groups : studyGroupList) {
            System.out.println("Group №: " + groups.getIdStudentGroup());
            List <Student> studentsList = groups.getStudentsList();
            studentsList.sort(new StudyGroupComparator());
            for (Student student:studentsList){
                System.out.println(student);
            };
        }

    }

}