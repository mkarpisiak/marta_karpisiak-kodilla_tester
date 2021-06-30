package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .filter(u->u.getAge()>=40)
                .mapToInt(u->u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postow dla uzytkownikow, ktorych wiek jest >= 40 to: " + avg);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter(u->u.getAge()<40)
                .mapToInt(u->u.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println("Srednia liczba postow dla uzytkownikow, ktorych wiek jest < 40 to: " + avg2);

    }


}
