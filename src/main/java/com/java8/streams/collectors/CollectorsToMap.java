/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToMap {

    public static void main(String args[]) {
        Map<String, Integer> nameLength = Stream
                .of("Arnold", "Alois", "Schwarzenegger")
                .collect(Collectors.toMap(name -> name, name -> name.length()));
        
        nameLength.forEach((name, len) -> System.out.printf("%s - %d \n", name, len));
    }
}
