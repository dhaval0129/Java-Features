/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author djoshi
 */
public class CustomExceptionTest {

    private static int readIntFromConsole() {
        Scanner consoleScanner = new Scanner(System.in);
        int typedInt = 0;

        try {
            typedInt = consoleScanner.nextInt();
        } catch (NoSuchElementException nsee) {
            System.out.println("Wrapping up the exception and throwing it...");
            throw new InvalidInputException("Invalid integer input typed in console", nsee);
        }
        return typedInt;
    }

    public static void main(String args[]) {
        System.out.println("Type an integer in the console: ");
        try {
            System.out.println("You typed the integer value: " + readIntFromConsole());
        } catch (InvalidInputException iie) {
            System.out.println("Error: Invalid input in console...");
            System.out.println("The current caught exception is of type: " + iie);
            System.out.println("The originally caught exception is of type: "
                    + iie.getCause());
        }
    }
}
