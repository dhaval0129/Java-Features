/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author djoshi
 */
public class MergeOperation {

    public static void main(String args[]) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 1);
        map1.put("b", 1);
        map1.merge("b", 1, (i1, i2) -> i1 + i2); // takes bi-function as second argument
        map1.merge("c", 3, (i1, i2) -> i1 + i2); // takes bi-function as second argument
        System.out.println(map1);
    }
}
