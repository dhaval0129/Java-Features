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
public class MapOperation2 {
    
    public static void main(String args[]) {
        Stream.of('a', 'b', 'c', 'd', 'e')
            .map(c -> (int) c)
            .forEach(i -> System.out.format("%d ", i));
    }
}
