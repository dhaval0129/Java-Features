/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author djoshi
 */
public class PutIfAbsent {

    // It will add put value to map if key is not there or value for key is null
    
    public static void main(String args[]) {
        Map<String, String> favorites = new HashMap<>();

        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
    }
}
