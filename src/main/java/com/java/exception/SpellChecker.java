/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 */
class SpellingException extends RuntimeException {
}

public class SpellChecker {

    public final static void main(String... participants) {
        try {
            if (!"cat".equals("kat")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException | ArithmeticException e) {
            System.out.println("Spelling Problem");
        } catch (Exception e) {
            System.out.println("Unknown Problem!");
        } finally {
            System.out.println("Done!");
        }
    }
}
