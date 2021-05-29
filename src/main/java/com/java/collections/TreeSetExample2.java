/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.TreeSet;

/**
 *
 * @author djoshi
 */
public class TreeSetExample2 {
    
    public static void main(String args[]) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree);
        System.out.println(tree.ceiling("On"));
    }
}
