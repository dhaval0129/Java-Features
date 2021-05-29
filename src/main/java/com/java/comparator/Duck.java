/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class Duck {
    private int weight;
    private String name;

    @Override
    public String toString() {
        return  name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Duck(String name, int weight) {
        this.weight = weight;
        this.name = name;
    }
    
    public static void main(String args[]) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            @Override
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);
        
    }
}
