/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author djoshi
 */
public class COWList {
    
    public static void main(String args[]) {
        List<String> aList = new CopyOnWriteArrayList<>();
        aList.add("one");
        aList.add("two");
        aList.add("three");
        
        Iterator listItr = aList.iterator();
        while(listItr.hasNext()) {
            System.out.println(listItr.next());
            aList.add("four");
        }
        
        System.out.println(aList);
    }
}
