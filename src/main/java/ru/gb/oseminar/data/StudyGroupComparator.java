package ru.gb.oseminar.data;

import java.util.Comparator;

public class StudyGroupComparator implements Comparator <Students>{
    @Override
    public int compare(Students o1, Students o2) {
        if (o1.getLastName().equalsIgnoreCase(o2.getLastName())){
            return o1.getFirstName().compareTo(o2.getFirstName());
        }

        return o1.getLastName().compareTo(o2.getLastName());
    }
}
