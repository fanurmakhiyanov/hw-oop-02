package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Students;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teachers;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public List<StudyGroup> completeStudyGroup(Teachers teacher, List<Students> studentsList) {
        List<StudyGroup> studyGroupList = new ArrayList<>();
        studyGroupList.add(new StudyGroup(teacher, studentsList));
        return studyGroupList;
    }
}
