/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class UsingMap {
    
    public static void main(String args[]) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        integers.stream()
            .map(i -> i * i)
            .forEach(System.out::println);
    }
}
