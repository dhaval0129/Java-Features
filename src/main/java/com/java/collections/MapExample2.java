/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author djoshi
 */
public class MapExample2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        
        map.replace(1, "1", null);
        map.replace(3, null);
        
        System.out.println(map.values());
    }
}
