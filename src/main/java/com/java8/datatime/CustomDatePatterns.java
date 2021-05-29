/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author djoshi
 */
public class CustomDatePatterns {

    public static void main(String args[]) {
        // patterns from simple to complex ones
        String[] dateTimeFormats = {
            "dd-MM-yyyy",
            "d '('E')' MMM, YYYY",
            "w'th week of' YYYY",
            "EEEE, dd'th' MMMM, YYYY"
        };

        LocalDateTime now = LocalDateTime.now();

        for (String dateTimeFormat : dateTimeFormats) {
            System.out.printf("Pattern \"%s\" is %s %n", dateTimeFormat, 
                    DateTimeFormatter.ofPattern(dateTimeFormat).format(now));
        }
    }
}
