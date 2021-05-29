/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

/**
 *
 * @author djoshi
 */
public class UsingDST {
    // Dealing with Day Light Saving
    public static void main(String args[]) {
        ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
        Duration kolkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Kolkata zone DST is: %d hours %n", kolkataDST.toHours());
        
        ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
        Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
        System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());
    }
    
}
