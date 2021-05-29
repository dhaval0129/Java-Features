/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Instant;

/**
 *
 * @author djoshi
 */
public class UsingInstant {

    public static void main(String args[]) {
        // prints the current timestamp with UTC as time zone 
        // Prior to 1972, this time was called Greenwich Mean Time (GMT) 
        // but is now referred to as Coordinated Universal Time or Universal Time Coordinated (UTC)
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timestamp is: " + currTimeStamp);

        // prints the number of seconds as Unix timestamp from epoch time
        System.out.println("Number of second elapsed: " + currTimeStamp.getEpochSecond());

        // prints the Unix timestamp in milliseconds
        System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());
    }

}
