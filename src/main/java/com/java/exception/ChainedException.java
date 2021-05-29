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
class ChainedException {

    public static void foo() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException oob) {
            RuntimeException re = new RuntimeException(oob);
            re.initCause(oob);
            throw re;
        }
    }

    public static void main(String[] args) {
        try {
            foo();
        } catch (Exception re) {
            System.out.println(re.getClass());
        }
    }
}
