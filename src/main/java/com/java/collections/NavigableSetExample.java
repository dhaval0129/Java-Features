/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author djoshi
 */
public class NavigableSetExample {
    
    public static void main(String args[]) {
        NavigableSet<String> myset = new TreeSet<String>();
        myset.add("a"); myset.add("b"); myset.add("c");
        myset.add("ab"); myset.add("bb"); myset.add("cc");
        
        System.out.println(myset.floor("aa"));
        System.out.println(myset.ceiling("aaa"));
        System.out.println(myset.lower("a"));
        System.out.println(myset.higher("bb"));
    }
}
