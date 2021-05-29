/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.IOException;

/**
 *
 * @author djoshi
 */
public class Read {

    public static void main(String args[]) {
        System.out.print("Type a character: ");
        int val = 0;

        try {
            val = System.in.read();

        } catch (IOException ie) {
            System.err.println("Cannot read input " + ie);
            System.exit(-1);
        }
        System.out.println("You typed: " + val);
    }
}
