package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentsView {
    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getAnonymousLogger();

        for (User user : users) {
            logger.info(user.toString());
        }

    }
    public void showStudyGroups(List<StudyGroup> studyGroups) {
        Logger logger = Logger.getLogger(StudentsView.class.getName());
        for (StudyGroup group : studyGroups) {
            logger.info(group.toString());
        }
    }
    public void showStudents(List<Students> studyGroups) {
        Logger logger = Logger.getLogger(StudentsView.class.getName());
        for (Students group : studyGroups) {
            logger.info(group.toString());
        }
    }

}
