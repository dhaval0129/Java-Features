/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.innerclass;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author djoshi
 */
enum SIZE {
    Tall, JUMBO, GRANDE;
}

public class NaturalOrderEnum {
    
    public static void main(String args[]) {
        TreeSet<SIZE> hs = new TreeSet<SIZE>();
        hs.add(SIZE.Tall); hs.add(SIZE.JUMBO); hs.add(SIZE.GRANDE);
        hs.add(SIZE.Tall); hs.add(SIZE.JUMBO); hs.add(SIZE.GRANDE);
        
        for(SIZE s: hs) {
            System.out.println(s);
        }
        
        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(0);
        System.out.println(set);
        set.stream().map(i -> i).forEach(System.out::println);
    }
}
