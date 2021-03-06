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
public class NavigableMapTest {

    public static void main(String args[]) {
        NavigableMap<Integer, String> examScores = new TreeMap<>();
        examScores.put(90, "Sophia");
        examScores.put(20, "Isabella");
        examScores.put(10, "Emma");
        examScores.put(50, "Olivea");
        
        System.out.println("The data in the map is: " + examScores);
        System.out.println("The data descending order is: "+ examScores.descendingMap());
        System.out.println("Details of those who passed the exam: "+ examScores.tailMap(40));
        System.out.println("The lowest mark is: " + examScores.firstEntry());
        System.out.println("The higher scores above 40 are: "+ examScores.higherEntry(40));
    }
}
