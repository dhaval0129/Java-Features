/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.Console;

/**
 *
 * @author djoshi
 */
public class Echo {

    public static void main(String args[]) {
        Console console = System.console();
        if (console == null) {
            System.err.println("Cannot retrieve console object - are you running"
                    + " you application from IDE ? Exiting application");
            System.exit(-1);
        }
        // read line and print it through printf
        console.printf(console.readLine());
    }
}
