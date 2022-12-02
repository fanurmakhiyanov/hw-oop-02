package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class StudyGroupService {

    private  final List<StudyGroup> studyGroupList;

    public StudyGroupService() {
        this.studyGroupList = new ArrayList<>();
    }

    public void completeStudyGroup(Teacher teacher, List<Student> studentsList) {
        this.studyGroupList.add(new StudyGroup(teacher, studentsList));
    };

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }
}