/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author djoshi
 */
public class ArrayListExample {

    public static void main(String args[]) {
        ArrayList<String> languageList = new ArrayList<>();
        languageList.add("C");
        languageList.add("C++");
        languageList.add("Java");

//        for (String language : languageList) {
//            System.out.println(language);
//        }
        Iterator<String> itr = languageList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
