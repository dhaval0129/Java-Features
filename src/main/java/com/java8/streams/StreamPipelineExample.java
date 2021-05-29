/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;

/**
 *
 * @author djoshi
 */
public class StreamPipelineExample {
    
    public static void main(String args[]) {
        Arrays.stream(Object.class.getMethods())    // source
                .map(method -> method.getName())    // intermediate operation
                .distinct()                         // intermediate operation
                .forEach(System.out::println);      // terminal operation
    }
}
