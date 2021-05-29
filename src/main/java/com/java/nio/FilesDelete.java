/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FilesDelete {

    public static void main(String args[]) {
        try {
            Files.delete(Paths.get("/vulture/feathers.txt")); // java.nio.file.NoSuchFileException:
            System.out.println(Files.deleteIfExists(Paths.get("/pigeon")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
