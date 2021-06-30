package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("korelacja", LocalDate.of(2021, 06, 30), LocalDate.of(2021, 7, 8)));
        tasks.add(new Task("zwrot", LocalDate.of(2021, 05, 15), LocalDate.of(2021, 5, 29)));
        tasks.add(new Task("wdrozenie", LocalDate.of(2021, 06, 25), LocalDate.of(2021, 7, 1)));
        tasks.add(new Task("reklamacja", LocalDate.of(2021, 06, 29), LocalDate.of(2021, 7, 7)));
        return tasks;
    }
}
