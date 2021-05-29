/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    private Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }
    
    public static void main(String args[]) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 10));
        ducks.add(new Duck("Puddles", 20));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
