/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author djoshi
 * 
 * A pangram is a sentence that uses all letters in the alphabet at least once.
 */
public class TreeSetExample3 {

    public static void main(String args[]) {
        String pangram = "the quick brown fox jumps over the lazy dog";
        Set<Character> aToZee = new TreeSet<>();
        for (char gram : pangram.toCharArray()) {
            if (gram != ' ') {
                aToZee.add(gram);
            }
        }
        System.out.println("The Pangram is: " + pangram);
        System.out.println("Sorted pangram characters are: " + aToZee);
    }
}
