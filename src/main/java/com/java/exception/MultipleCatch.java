/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author djoshi
 *
 * multiple catch example
 */
public class MultipleCatch {

    public static void main(String args[]) {
//        String integerStr = "100";
        System.out.println("The string to scan integer from it is: ");
        Scanner consoleScanner = new Scanner(System.in);

        try {
            System.out.println("The integer value scanned from string is: "
                    + consoleScanner.nextInt());
            
        } catch (InputMismatchException ime) {
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch (NoSuchElementException nsee) {
            System.out.println("Error: Cannot scan an integer from the given string");
        } catch (IllegalStateException ise) {
            System.out.println("Error: nextInt() called on a closed Scanner object");
        }
    }
}
