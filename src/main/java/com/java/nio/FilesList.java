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
public class FilesList {

    public static void main(String args[]) throws IOException {
        Path path = Paths.get(".");
        
        Files.list(path)
            .filter(p -> !Files.isDirectory(p))
            .map(p -> p.toAbsolutePath())
            .forEach(System.out::println);
    }
}
