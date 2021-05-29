/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class ReadAllLines {

    public static void main(String args[]) {
        try {
            // By default it uses StandardCharsets.UTF_8
            List<String> lines = Files.readAllLines(Paths.get("file.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
        }
    }
}
