/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author djoshi
 */
public class MyComparator implements Comparator<String> {
    
    @Override
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }
    
    public static void main(String args[]) {
        String[] values = { "123", "Abb", "aab" };
        Arrays.sort(values, new MyComparator());
        
        for(String s: values) {
            System.out.print(s + " ");
        }
    }
 }
