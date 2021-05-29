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
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FindFiles {

    public static void main(String args[]) throws IOException {
        BiPredicate<Path, BasicFileAttributes> predicate = (path, attrs)
                -> attrs.isRegularFile() && path.toString().endsWith(".class");

        try (Stream<Path> entries = Files.find(Paths.get("."), 4, predicate)) {
            entries.limit(100).forEach(System.out::println);
        }
    }
}
