package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {


        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("blue flower", 2.3,1.8,false));
        stamps.add(new Stamp("black horse", 3.7,2.8, true));
        stamps.add(new Stamp("moon", 1.5,1.5, true));
        stamps.add(new Stamp("black horse", 3.7,2.8, true));
        stamps.add(new Stamp ("summer", 10, 12.8, false));
        stamps.add(new Stamp("black horse", 3.7,2.8, true));

        System.out.println(stamps.size());

    }
}
