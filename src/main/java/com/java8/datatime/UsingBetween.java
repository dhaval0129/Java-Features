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
import java.time.Month;
import java.time.Period;

/**
 *
 * @author djoshi
 */
public class UsingBetween {

    public static void main(String args[]) {
        LocalDate nowDate = LocalDate.of(2015, 9, 2);
        LocalTime nowTime = LocalTime.of(1, 0, 0);
        LocalDateTime nowDateTime = LocalDateTime.of(nowDate, nowTime);
        
        Period p = Period.between(nowDate, LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(nowDateTime, LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
    }
}
