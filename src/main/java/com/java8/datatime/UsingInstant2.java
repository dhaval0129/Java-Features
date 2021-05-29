/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author djoshi
 */
public class UsingInstant2 {
    
    public static void main(String args[]) {
        Instant start = Instant.parse("2015-06-25T16:13:30.00z"); 
        start.plus(10, ChronoUnit.HOURS); 
        System.out.println(start);  
        
        Duration timeToCook = Duration.ofHours(1); 
        Instant readyTime = start.plus(timeToCook); 
        System.out.println(readyTime);  
        
        Instant truncate = start.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncate);
        
        LocalDateTime ltd = LocalDateTime.ofInstant(readyTime, ZoneId.of("GMT+2")); 
        System.out.println(ltd);
    }
}
