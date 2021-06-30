package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {

        List<LocalDate> deadLines = TaskRepository.getTasks()
                .stream()
                .map(u->u.getDeadline())
                .filter(e->e.isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        System.out.println(deadLines);

    }
}
