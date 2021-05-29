/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author djoshi
 */
public class NavigableMapExample2 {

    public static void main(String[] args) {
        NavigableMap<String, String> mymap = new TreeMap<>();
        mymap.put("a", "apple");
        mymap.put("b", "boy");
        mymap.put("c", "cat");
        mymap.put("aa", "apple1");
        mymap.put("bb", "boy1");
        mymap.put("cc", "cat1");
        mymap.pollLastEntry();      
        mymap.pollFirstEntry();   
        
        NavigableMap<String, String> tailmap = mymap.tailMap("bb", false);         
        System.out.println(tailmap.pollFirstEntry());          
        System.out.println(mymap.size()); 
    }
}
