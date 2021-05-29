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

/**
 *
 * @author djoshi
 */
public class BasicFileAttributesSample {

    public static void main(String args[]) {
        try {
            Path path = Paths.get("temp.data");
            BasicFileAttributes data = Files.readAttributes(
                    path, BasicFileAttributes.class);

            System.out.println("Is path a directory? " + data.isDirectory());
            System.out.println("Is path a regular file? " + data.isRegularFile());
            System.out.println("Is path a symboloc link? " + data.isSymbolicLink());
            System.out.println("Path not a file, directory, nor symbolic link? "
                    + data.isOther());

            System.out.println("Size (in bytes): " + data.size());

            System.out.println("Creation date/time: " + data.creationTime());
            System.out.println("Last modified date/time: " + data.lastModifiedTime());
            System.out.println("Last Accessed date/time: " + data.lastAccessTime());
            System.out.println("Unique file identifier (if available): " + data.fileKey());
            System.out.println("Is Other: " + data.isOther());
            
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
