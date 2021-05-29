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
class BoxPrinter<T> {
    private T val;
    
    BoxPrinter(T arg) {
        val = arg;
    }
    
    @Override
    public String toString() {
        return "[" + val + "]";
    }
}

public class BoxPrinterTest {
    public static void main(String args[]) {
        BoxPrinter<Integer> value1 = new BoxPrinter<>(new Integer(10));
        System.out.println(value1);
        
        BoxPrinter<String> value2 = new BoxPrinter<>("Hello World");
        System.out.println(value2);
    }
}
