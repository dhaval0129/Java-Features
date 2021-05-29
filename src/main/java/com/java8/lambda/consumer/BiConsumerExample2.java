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
public class BiConsumerExample2 {

    public static void main(String args[]) {
        Map<String, String> map = new HashMap<>();
        
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (k, v) -> map.put(k, v);
        
        b1.accept("chicken", "Cluck");
        b2.accept("chick", "Tweep");
        System.out.println(map);
    }
}
