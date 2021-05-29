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
public class Echo {

    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input passed to echo command....");
            System.exit(-1); // error status
        } else {
            for (String str : args) {
                System.out.print(str + " ");
            }
        }
    }
}
