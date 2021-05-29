/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FilesWalk {

    public static void main(String args[]) {
        try {
            Path path = Paths.get(".");
            
            Files.walk(path,8, FileVisitOption.FOLLOW_LINKS)
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(System.out::println);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
