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
public class StreamReuse {
    
    public static void main(String args[]) {
        IntStream chars = "bookkeep".chars();
//        System.out.println(chars.count());
        chars.distinct()
                .sorted()
                .forEach(ch -> System.out.printf("%c ", ch));
    }
}
