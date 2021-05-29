/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparator;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author djoshi
 */
public class MyStringComparator implements Comparator {

    static String[] sa = {"d", "bbb", "aaaa"};

    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.binarySearch(sa, "cc", new MyStringComparator()));
        System.out.println(Arrays.binarySearch(sa, "c", new MyStringComparator()));
    }
}
