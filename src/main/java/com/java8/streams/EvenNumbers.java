/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class EvenNumbers {

    public static boolean isEven(int i) {
        return (i % 2) == 0;
    }

    public static void main(String args[]) {
        IntStream.rangeClosed(0, 10)
                .filter(i -> (i % 2) == 0)
                .forEach(System.out::println);
    }
}
