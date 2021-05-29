/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.Console;
import java.util.Arrays;

/**
 *
 * @author djoshi
 */
public class Login {

    public static void main(String args[]) {
        Console console = System.console();
        
        if (console != null) {
            String userName = null;
            char[] password = null;
            userName = console.readLine("Enter your username: ");
            // typed characters for password will not display on the screen
            password = console.readPassword("Enter password: ");
            if (userName.equals("scrat") && new String(password).equals(password)) {
                // We're hardcoding username and password here for 
                // illustration, don't do such hardcoding in practice!
                console.printf("login successful!");
            } else {
                console.printf("wrong user name or password");
            }
            Arrays.fill(password, ' ');
        }
    }
}
