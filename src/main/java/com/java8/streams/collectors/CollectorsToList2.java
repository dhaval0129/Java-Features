/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToList2 {
    
    public static void main(String args[]) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
