package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> foundFlights = flightFinder.findFlightsFrom("warszawa");

        assertEquals(2,foundFlights.size());
    }

    @Test
    public void testFindFlightsTo(){
        FlightFinder flightFinder = new FlightFinder();

        List<Flight> foundFlights = flightFinder.findFlightsTo("madryt");
        assertEquals(1,foundFlights.size());

    }


}