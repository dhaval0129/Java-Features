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
class Person1 {

    private static int count = 0;
    private String id = "0";
    private String interest;

    public Person1(String interest) {
        this.interest = interest;
        this.id = "" + ++count;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public String toString() {
        return id;
    }
}

public class StudyGroup {

    String name = "MATH";
    TreeSet<Person1> set = new TreeSet<Person1>();

    public void add(Person1 p) {
        if (name.equals(p.getInterest())) {
            set.add(p);
        }
    }

    public static void main(String[] args) {
        StudyGroup mathGroup = new StudyGroup();
        mathGroup.add(new Person1("MATH"));
        System.out.println("A");
        mathGroup.add(new Person1("MATH"));
        System.out.println("B");
        System.out.println(mathGroup.set);
    }
}
