/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 *
 * @author djoshi
 */
public class BiConsumerExample {
    
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;  // method references
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);  // lambda expressions
        
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        
        System.out.println(map);
    }
}
