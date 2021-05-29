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
public class MultiCatch {

    public static void main(String args[]) {
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(System.in);

        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Error: An error occured while attempting to scan the integer");
        }
    }
}
