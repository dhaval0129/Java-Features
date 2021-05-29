/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author djoshi
 */
public class UsingDuration {

    public static void main(String args[]) {
        LocalDateTime comingMidnight = LocalDateTime.of(
                LocalDate.now().plusDays(1), LocalTime.MIDNIGHT);
        LocalDateTime now = LocalDateTime.now();
        
        Duration between = Duration.between(now, comingMidnight);
        System.out.println(between);
    }
}
