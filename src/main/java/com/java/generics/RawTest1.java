/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class RawTest1 {

    public static void main(String args[]) {
        List list = new LinkedList();
        list.add("First");
        list.add("Second");

        List<String> strList = list;
        for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();) {
            System.out.println("Item: " + itemItr.next());
        }
        System.out.println("\n\n");
        
        List<String> strList2 = new LinkedList<>();
        strList2.add("First");
        strList2.add("Second");
        List list2 = strList2;
        for (Iterator<String> itemItr = list2.iterator(); itemItr.hasNext();) {
            System.out.println("Item: " + itemItr.next());
        }
    }
}
