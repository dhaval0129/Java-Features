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
public class LimitAndSkipOperation {
    
    public static void main(String args[]) {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(5).limit(4).forEach(System.out::print);
    }
}
