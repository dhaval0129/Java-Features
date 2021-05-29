/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.OptionalLong;
import java.util.stream.LongStream;

/**
 *
 * @author djoshi
 */
public class StreamLong {

    public static void main(String args[]) {
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10)
                .filter(n -> n > 5)
                .findFirst();

        if (opt.isPresent()) {
            System.out.println(opt.getAsLong());
        }
        opt.ifPresent(System.out::println);
    }
}
