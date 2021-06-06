package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<Integer> numberOfStudents = new ArrayList<>();

    public School (Integer... quantityOfStudentsInClasses ) {
        for (int studentsInClass : quantityOfStudentsInClasses)
            this.numberOfStudents.add(studentsInClass);
    }


    public int getSum() {
        int sum = 0;
        for (int studentsInClass : numberOfStudents )
            sum += studentsInClass;
        return sum;
    }

    @Override
    public String toString() {
        return "School: " + numberOfStudents.toString();
    }
}
