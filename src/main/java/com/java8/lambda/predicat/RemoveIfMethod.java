/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author djoshi
 */
public class RemoveIfMethod {
    
    public static void main(String args[]) {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");
        // remove all string from list which does not starts with 'h'
        greeting.removeIf(str -> !str.startsWith("h"));
        // similar to above
//        greeting.removeIf(((Predicate<String>) str -> str.startsWith("h")).negate());
        greeting.forEach(System.out::println);
    }
}
