/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 */
class A {

    public void getItDone(int counter) {
        assert counter >= 0 : "Less than zero";
        for (int i = 0; i < counter; i++) {
        }
    }
}

class B extends A {

    @Override
    public void getItDone(int counter) {
        assert counter < 100 : "Greater than 100";
        for (int i = counter; i > 0; i--) {
        }
    }
}

public class AssertionExample2 {

    public static void main(String args[]) {
        A a = new B();
        a.getItDone(-4);
    }
}
