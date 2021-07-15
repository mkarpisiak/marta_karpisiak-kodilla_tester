package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("warszawa", "madryt"));
        flights.add(new Flight("poznan", "berlin"));
        flights.add(new Flight("berlin", "londyn"));
        flights.add(new Flight("warszawa", "londyn"));

        return flights;
    }
}
