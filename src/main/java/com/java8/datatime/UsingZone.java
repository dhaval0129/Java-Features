/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.ZoneId;
import java.util.Set;

/**
 *
 * @author djoshi
 */
public class UsingZone {

    public static void main(String args[]) {
        System.out.println("My zone id is: " + ZoneId.systemDefault());
        Set<String> zones = ZoneId.getAvailableZoneIds();
        
        System.out.println("Number of available time zones is: " + zones.size());
        zones.forEach(System.out::println);

    }
}
