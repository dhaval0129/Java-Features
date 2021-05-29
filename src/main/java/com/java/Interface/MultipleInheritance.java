/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Interface;

/**
 *
 * @author djoshi
 */
interface BaseInterface {

    default void foo() {
        System.out.println("BaseInterface's foo");
    }
}

interface DerivedInterface extends BaseInterface {

    @Override
    default void foo() {
        System.out.println("DerivedInterface's foo");
    }
}

interface AnotherInterface {

    public static void foo() {
        System.out.println("AnotherInterface's foo");
    }
}

public class MultipleInheritance implements DerivedInterface, AnotherInterface {

    public static void main(String[] args) {
        new MultipleInheritance().foo();
    }
}
