/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author djoshi
 */
public class SetExample {
    
    public static void main(String args[]) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(d -> System.out.println(d));
        System.out.println();
        s.forEach(System.out::println);
    }
}
