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
public class UseOptional4 {

    public static void main(String args[]) {
        System.out.println(
                Optional.of(-1).orElse(1)
        );
    }
}
