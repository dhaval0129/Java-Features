/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FilesLines {
    
    public static void main(String args[]) {
        try {
            Path path = Paths.get("./zoo.log");
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            
        }
    }
}
