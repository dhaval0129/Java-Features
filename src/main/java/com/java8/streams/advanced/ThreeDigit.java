/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.advanced;

import java.util.Optional;

/**
 *
 * @author djoshi
 */
public class ThreeDigit {

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(m -> "" + m)
                .filter(s -> s.length() >= 3)
                .ifPresent(System.out::println);
    }
    
    public static void main(String args[]) {
        Optional<Integer> opt = Optional.of(123);
        threeDigit(opt);
    }
}
