/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author djoshi
 */
class Person2 {

    String name;
    String dob;

    public Person2(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}

public class SortTest {

    public static void main(String args[]) {
        ArrayList<Person2> al = new ArrayList<>();
        al.add(new Person2("Paul", "01012000"));
        al.add(new Person2("Peter", "01011990"));
        al.add(new Person2("Patrick", "01012002"));

        Collections.sort(al, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                return o1.dob.compareTo(o2.dob);
            }
        });

        for (Person2 a : al) {
            System.out.println(a.name + " " + a.dob);
        }
    }
}
