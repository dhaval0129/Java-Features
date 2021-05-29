/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author djoshi
 * 
 * checked exception with try and catch statements
 */
public class Catch {

    public static void main(String args[]) {
        System.out.println("Type an integer in the console: ");
        Scanner consoleScanner = new Scanner(System.in);
        try {
            System.out.println("You typed the integer value: "
                    + consoleScanner.nextInt());
        } catch (InputMismatchException ime) {
            System.out.println("Error: You type some text that is not integer value...");
        }
    }
}
