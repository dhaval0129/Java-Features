/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 *
 * @author djoshi
 */
public class ComputeIfPresent {
   // It takes BiFunction as second parameter
    
    public static void main(String args[]) {
        Map<String, Integer> counts1 = new HashMap<>();
        counts1.put("Jenny", 1);

        BiFunction<String, Integer, Integer> mapper1 = (k, v) -> v + 1;
        Integer jenny = counts1.computeIfPresent("Jenny", mapper1);
        Integer sam = counts1.computeIfPresent("Sam", mapper1);
        System.out.println(counts1); // {Jenny=2}
//        System.out.println(jenny); // 2
//        System.out.println(sam); // null

        Map<String, Integer> counts2 = new HashMap<>();
        counts2.put("Jenny", 1);
        counts2.computeIfPresent("Jenny", (k, v) -> null);
        counts2.computeIfAbsent("Sam", k -> null);
        System.out.println(counts2); // {}
    }
}
