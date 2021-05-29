/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 *
 * @author djoshi
 */
public class UsingZoneOffset {
  
    public static void main(String args[]) {        
        ZoneId zone = ZoneId.of("Asia/Kolkata");
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zDT = ZonedDateTime.of(dateTime, zone);
        ZoneOffset zoneOffset = zDT.getOffset();
        System.out.println(zoneOffset);
    }
}
