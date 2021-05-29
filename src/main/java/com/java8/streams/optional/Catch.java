/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Optional;

/**
 *
 * @author djoshi
 */
public class Catch {

    public static void main(String args[]) {
        Optional opt = Optional.empty();
        try {
            apply(opt);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught it");
        }
    }

    private static void apply(Optional<Exception> opt) throws IllegalArgumentException {
//        opt.orElseThrow(IllegalArgumentException::new);
        opt.orElseThrow(IllegalArgumentException::new);
    }
}
