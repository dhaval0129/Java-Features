/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.innerclass;

/**
 *
 * @author djoshi
 */
public class NestedClass2 {

    public class A {
    }

    public static class B {
    }

    public void useClasses() { 
        new NestedClass2().new A();
        new NestedClass2.B();
        new A();
        new NestedClass2.A();
    } 
}
