/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.generics;

/**
 *
 * @author djoshi
 */
class Pair<T1, T2> {

    private T1 object1;
    private T2 object2;

    Pair(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }
}

public class PairTest {

    public static void main(String args[]) {
        Pair<Integer, String> worldCup = new Pair<>(2018, "Russia");
        System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());
    }
}
