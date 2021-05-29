/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author djoshi
 */
public class UsingFormat {

    public static void main(String args[]) {
        LocalTime wakeupTime = LocalTime.of(6, 0, 0);
        System.out.println("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));
        
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd, MMM yyyy");
        System.out.println(customFormat.format(LocalDate.now()));
    }
}
