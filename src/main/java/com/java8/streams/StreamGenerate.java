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
public class StreamGenerate {

    public static void main(String args[]) {
        Stream.generate(() -> "1")
                .limit(10)
                .forEach(System.out::println);
    }
}
