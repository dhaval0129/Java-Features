/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author djoshi
 */
public class HashSetExample {
    
    public static void main(String args[]) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        
        Iterator iter = numbers.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
