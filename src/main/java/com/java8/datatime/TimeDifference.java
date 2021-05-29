/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author djoshi
 */
public class TimeDifference {

    public static void main(String args[]) {
        ZoneId singaporeZone = ZoneId.of("Asia/Singapore");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        ZonedDateTime dateTimeInSingapore = ZonedDateTime.of(date, time, singaporeZone);

        ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
        ZonedDateTime dateTimeInAuckland = dateTimeInSingapore.withZoneSameInstant(aucklandZone);

        Duration timeDifference = Duration.between(
                dateTimeInSingapore.toLocalTime(), dateTimeInAuckland.toLocalTime());
        System.out.printf("Time Difference between %s and %s zones in %d hours",
                singaporeZone, aucklandZone, timeDifference.toHours());
    }
}
