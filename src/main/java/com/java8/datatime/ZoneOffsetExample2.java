/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 *
 * @author djoshi
 */
public class ZoneOffsetExample2 {

    public static void main(String args[]) {
        LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM. 
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);         
        ZoneId nyZone = ZoneId.of("America/New_York"); 
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset); 
        ZonedDateTime nyZdt = ldt.atZone(nyZone); 
        System.out.println(nyOdt.getOffset());
        System.out.println(nyZdt.getOffset());
        Duration d = Duration.between(nyOdt, nyZdt); 
        System.out.println(d);
    }
}
