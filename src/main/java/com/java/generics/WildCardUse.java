/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class WildCardUse {

    // for ? super types should be passed
    // replacing generics with concerete type is called type erasure
    static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println("[" + element + "]");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);

        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);
    }
}
