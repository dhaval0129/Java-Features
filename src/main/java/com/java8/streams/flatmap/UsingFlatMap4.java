/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.Arrays;

/**
 *
 * @author djoshi
 */
public class UsingFlatMap4 {
    
    public static void main(String args[]) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(string)
            .map(word -> word.split(""))
            .distinct()
            .forEach(System.out::println);
        
    }
}
