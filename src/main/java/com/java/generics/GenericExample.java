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
class A {
}

class B extends A {
}

class C extends B {
}

class D<C> {
}

public class GenericExample {
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();
}
