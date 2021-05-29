/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author djoshi
 */
public class MergeFunction {
    // It takes BiFunction as third parameter
    public static void main(String args[]) {
        BiFunction<String, String, String> mapper1
                = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites1 = new HashMap<>();
        favorites1.put("Jenny", "Bus Tour");
        favorites1.put("Tom", "Tram");

        String jenny = favorites1.merge("Jenny", "Skyride", mapper1);
        String tom = favorites1.merge("Tom", "Skyride", mapper1);

        System.out.println(favorites1);
        System.out.println(jenny);
        System.out.println(tom);

        // if value of key does not exist then merger() will replace value for key
        BiFunction<String, String, String> mapper2 = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Sam", null);
        
        favorites2.merge("Tom", "Skyride", mapper2);
        favorites2.merge("Sam", "Skyride", mapper2);

        // If key exists then it removed from map,
        // if key does not exists then it added to map by merge function
        BiFunction<String, String, String> mapper3 = (v1, v2) -> null;
        
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Jenny", "Bus Tour");
        favorites3.put("Tom", "Bus Tour");
        
        favorites3.merge("Jenny", "Skyride", mapper3);
        favorites3.merge("Sam", "Skyride", mapper3);
        System.out.println(favorites3); // {Tom=Bus Tour, Sam=Skyride}
    }
}
