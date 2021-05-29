/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class Type {

    private static void processFile(String file) {
        try (Stream<String> lines = Files.lines(Paths.get(file))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("IOException occured while reading the file...exiting");
            System.exit(-1);
        }
    }

    public static void main(String[] args) throws IOException {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        args = new String[1];
        args[0] = dir + fs + "Test\\test.txt";
        // process each file passed as argument
        Arrays.stream(args).forEach(Type::processFile);
    }
}
