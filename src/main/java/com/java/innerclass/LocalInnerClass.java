/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.innerclass;

/**
 * A local inner class can be declared within a block. This block can be either
 * a method body, initialization block, for loop or even an if statement.
 *
 * @author djoshi
 */
public class LocalInnerClass {

    // Declaration within a method body
    private void getValue() {
        // Note that local variable(sum) must be final till JDK 7 
        // hence this code will work only in JDK 8
        int sum = 20;

        // Local inner Class inside method
        class Inner {

            public int divisor;
            public int remainder;

            public Inner() {
                divisor = 4;
                remainder = sum % divisor;
            }

            private int getDivisor() {
                return divisor;
            }

            private int getRemainder() {
                return sum % divisor;
            }

            private int getQuotient() {
                System.out.println("Inside inner class");
                return sum / divisor;
            }
        }

        Inner inner = new Inner();
        System.out.println("Divisor = " + inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
    }

//    public static void main(String[] args) {
//        LocalInnerClass outer = new LocalInnerClass();
//        outer.getValue();
//    }

    // Declaration inside an if statement
    public int data = 10;

    public int getData() {
        return data;
    }

    public static void main(String[] args) {
        LocalInnerClass outer = new LocalInnerClass();

        if (outer.getData() < 20) {
            // Local inner class inside if clause
            class Inner {

                public int getValue() {
                    System.out.println("Inside Inner class");
                    return outer.data;
                }
            }

            Inner inner = new Inner();
            System.out.println(inner.getValue());
        } else {
            System.out.println("Inside Outer class");
        }
    }

}
