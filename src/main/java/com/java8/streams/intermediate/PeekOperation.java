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
public class PeekOperation {
    // It is useful for debugging because it allows us to perform a stream
    // operation without actually changing the stream
    public static void main(String args[]) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count();
        System.out.println(count);
    }
}
