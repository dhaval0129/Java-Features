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
 * 
 * This will throw run time exception, the lesson is avoid mixing raw type with Generics. 
 * 
 */
public class RawTest2 {

    public static void main(String args[]) {
        List<String> list = new LinkedList<>();
        list.add("First");
        list.add("Second");
        List strList = list;
        strList.add(10);
        for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();) {
            System.out.println("Item: " + itemItr.next());
        }
    }
}
