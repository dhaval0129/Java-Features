/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 *
 * @author djoshi
 */
public class FunctionUse2 {

    public static void main(String args[]) {
        List<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");
        Function<List<String>, List<String>> f = list -> list.subList(2, 4);
        f.apply(vowels);
//        List<String> v = f.apply(vowels);
        vowels.forEach(System.out::print);
    }
}
