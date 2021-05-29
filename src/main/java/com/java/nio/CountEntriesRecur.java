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
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CountEntriesRecur {

    public static void main(String args[]) throws IOException {
        try (Stream<Path> entries
                = Files.walk(Paths.get("."), 4, FileVisitOption.FOLLOW_LINKS)) {
            long numOfEntries = entries.count();
            System.out.printf("Found %d entries in the current path", numOfEntries);
        }
    }
}
