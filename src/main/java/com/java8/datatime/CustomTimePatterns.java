/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author djoshi
 */
public class CustomTimePatterns {
    
    public static void main(String args[]) {
        String[] timeFormats = {
            "h:mm",
            "hh 'o''clock'",
            "H:mm a",
            "hh:mm:ss:SS",
            "K:mm:ss a"
        };
        
        LocalTime now = LocalTime.now();
        for(String timeFormat: timeFormats){
            System.out.printf("Time in pattern \"%s\" is %s %n", 
                timeFormat, DateTimeFormatter.ofPattern(timeFormat).format(now));
        }
    }
}
