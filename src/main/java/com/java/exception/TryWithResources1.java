/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

import java.util.Scanner;

/**
 *
 * @author djoshi
 */
public class TryWithResources1 {

    public static void main(String[] args) {
        System.out.println("Type an integer in the console: ");
        try (Scanner consoleScanner = new Scanner(System.in)) {
            System.out.println("You typed the integer value: " 
                    + consoleScanner.nextInt());
        } catch (Exception e) {
            // catach all other exceptions here..
            System.out.println("Error: Encoutered an exception"
                    + " and could not read an integer from the console");
            System.out.println("Exiting the program - restart and try the program again!");
        }
    }
}
