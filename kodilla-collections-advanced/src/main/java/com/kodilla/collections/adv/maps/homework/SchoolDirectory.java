package com.kodilla.collections.adv.maps.homework;



import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> school = new HashMap<>();
        Principal uam = new Principal("Jan", "Kowalski");
        Principal awf = new Principal("Adam", "Nowak");
        Principal ue =  new Principal("Eryk", "Majewicz");

        School uamSum = new School(27, 32, 12, 54, 120);
        School awfSum = new School(55, 76, 26, 94);
        School ueSum = new School(44, 57, 36, 87, 98);

        school.put(uam, uamSum);
        school.put(awf, awfSum);
        school.put(ue, ueSum);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + " " +
                    principalEntry.getKey().getLastname()+"- there is " +
                    principalEntry.getValue().getSum() + " students in his college.");


    }

}
