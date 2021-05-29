/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

/**
 *
 * @author djoshi
 */
public class Animal implements Comparable<Animal> {
    private int id;
    
    @Override
    public int compareTo(Animal ca) {
        return this.id - ca.id;
    }
    
    public static void main(String args[]) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        a1.id = 5;
        a2.id = 7;
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
    }
}
