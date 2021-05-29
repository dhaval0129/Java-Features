/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.PrintStream;

/**
 *
 * @author djoshi
 */
public class StreamTest {

    public static void main(String args[]) {
        try {
            PrintStream ps = new PrintStream("log.txt");
            System.setOut(ps);
            System.out.println("Test output to System.out");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
