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
public class UseOptional3 {

    private static Optional<Integer> ToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    public static void main(String args[]) {
        System.out.println(ToInt("a").get());
    }

}
