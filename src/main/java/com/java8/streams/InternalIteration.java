/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class InternalIteration {
    
    public static void main(String args[]){
        List<String> strings = Arrays.asList("eeny", "menny", "miny", "mo");
        strings.forEach(s -> System.out.println(s)); // for - each takes supplier as argument
    }
}
