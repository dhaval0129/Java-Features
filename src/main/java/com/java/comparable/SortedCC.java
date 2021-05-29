/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author djoshi
 */
public class SortedCC implements Comparable<SortedCC>, Comparator<SortedCC>{
    
    private int num;
    private String text;
    
    SortedCC(int n, String t) {
        this.num = n;
        this.text = t;
    }
    
    @Override
    public String toString() {
        return "" + num;
    }
    
    @Override
    public int compareTo(SortedCC s) {
        return text.compareTo(s.text);
    }
    
    @Override
    public int compare(SortedCC s1, SortedCC s2) {
        return s1.num - s2.num;
    }
    
    public static void main(String args[]) {
        SortedCC s1 = new SortedCC(88, "a");
        SortedCC s2 = new SortedCC(55, "b");
        
        TreeSet<SortedCC> t1 = new TreeSet<>();
        t1.add(s1); t1.add(s2);
        
        TreeSet<SortedCC> t2 = new TreeSet<>(s2);
        t2.add(s1); t2.add(s2);
        
        System.out.println(t1 + " " + t2);
    }
}
