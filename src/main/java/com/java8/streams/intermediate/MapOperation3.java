/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class MapOperation3 {

    public static void main(String args[]) {
        IntStream.of(100, 110, 120, 130, 140)
            .mapToDouble(i -> i / 3.0)
            .forEach(i -> System.out.format("%.2f ", i));
    }
}
