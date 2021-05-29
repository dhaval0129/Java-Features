/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.advanced;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class ExceptionCaseStudy {
    
    private static List<String> create() throws IOException {
        throw new IOException();
    }
    
    public static void main(String args[]) throws Exception {
        ExceptionCaseStudy.create().stream().count();
    }
}
