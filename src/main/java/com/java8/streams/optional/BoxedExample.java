/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class BoxedExample {

    public static void main(String args[]) {
        Object v1 = IntStream.rangeClosed(10, 15)
                .boxed().filter(x -> x > 12)
                .parallel()
                .findAny();
        Object v2 = IntStream.rangeClosed(10, 15)
                .boxed()
                .filter(x -> x > 12)
                .sequential()
                .findAny();
        System.out.println(v1 + ":" + v2);
    }
}
