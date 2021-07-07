package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Marek Grechuta")));
        students.add(new Student("Barbara Nowak", null));
        students.add(new Student("Anna Iksinska", new Teacher("Janusz Korczak")));
        students.add(new Student("Donald Duck", null));
        students.add(new Student("Miki Mouse", new Teacher("Walt Disney")));



        for ( int n= 0; n< students.size(); n++ ) {
            Optional<Teacher> optionalTeacher =Optional.ofNullable(students.get(n).getTeacher());
            String name = optionalTeacher.orElse(new Teacher("undefinied")).getName();
            System.out.println("uczen: " + students.get(n).getName() + ", nauczyciel: " + name);

        }

    }
}
