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
public class MethodReference {
    
    private static void printUpperCaseString(String s) {
        System.out.println(s.toUpperCase());
    }
    
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        strings.forEach(MethodReference::printUpperCaseString);
    }
}
