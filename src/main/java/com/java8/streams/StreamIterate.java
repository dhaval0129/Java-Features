/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class StreamIterate {

    public static void main(String args[]) {
        Stream<String> stream1 = Stream.iterate("-",s -> s + 1)
                .limit(3);
        stream1.forEach(System.out::print);
        
        System.out.println();
        
        Stream<String> stream2 = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream2.limit(2).map(x -> x + "2"));
    }
}
