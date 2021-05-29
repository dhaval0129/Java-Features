/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class ConcurrentListExample {
    
    public static void main(String args[]) {
        List<Integer> db = Collections.synchronizedList(new ArrayList<>());
        IntStream.iterate(1, i -> i + 1).limit(5)
                .parallel()
                .map(i -> {db.add(i); return i;})
                .forEachOrdered(System.out::print);
        
        System.out.println();
        db.forEach(System.out::print);
    }
}
