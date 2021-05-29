/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author djoshi
 */
public class FlightTravel {

    public static void main(String args[]) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy hh.mm a");

        ZonedDateTime departure = ZonedDateTime.of(
                LocalDateTime.of(2016, Month.JANUARY, 1, 6, 0),
                ZoneId.of("Asia/Singapore"));

        System.out.println("Departure: " + dateTimeFormatter.format(departure));

        // Arrival on the same day in 10 hours in Auckland
        ZonedDateTime arrival = departure.withZoneSameInstant(
                ZoneId.of("Pacific/Auckland")).plusHours(10);
        System.out.println("Arrival: " + dateTimeFormatter.format(arrival));
    }
}
