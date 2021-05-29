/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class MapOperation {
    // The map() method creates a one-to-one mapping from the elements
    // in the stream to the elements of the next step in the stream
    
    public static void main(String args[]) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(x -> x.length()).forEach(System.out::print);
    }
}
