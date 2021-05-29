/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

/**
 *
 * @author djoshi
 */
public class PrintWriterExample {

    public static void main(String args[]) {
        try (PrintWriter pw = new PrintWriter("file.txt")) {
            pw.write("Hi"); // Writing a String
            pw.write(100); // Writing a character

            // write the string representation of the argument
            // it has versions for all primitives, char[], String, and Object
            pw.print(true);
            pw.print(10);

            // same as print() but it also writes a line break as defined by
            // System.getProperty("line.separator") after the value
            pw.println(); // Just writes a new line
            pw.println("A new line...");

            // format() and printf() are the same methods
            // They write a formatted string using a format string,
            // its arguments and an optional Locale
            pw.format("%s %d", "Formatted string ", 1);
            pw.printf("%s %d", "Formatted string ", 2);
            pw.format(Locale.GERMAN, "%.2f", 3.1416);
            pw.printf(Locale.GERMAN, "%.3f", 3.1416);
        } catch (FileNotFoundException e) {
            // if the file cannot be opened or created
            e.printStackTrace();
        }
    }
}
