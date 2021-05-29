/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 *
 * @author djoshi
 * 
 * Property implements Map, This makes method get available.
 */
public class PropertyMap {
    
    public static void main(String args[]) {
        Map<String, String> map = new TreeMap<>();
        map.put("tool", "hammer");
        map.put("problem", "nail");
        
        Properties props = new Properties();
        map.forEach((k, v) -> props.put(k, v));
        
        String t = props.getProperty("tool");
        String n = props.getProperty("nail");
        System.out.println(t + " " + n);
    }
}
