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
public class FileAttributes2 {

    public static void main(String args[]) {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path = Paths.get(dir + fs + "Test\\test.txt");

        try {
            BasicFileAttributes fileAttributes
                    = Files.readAttributes(path, BasicFileAttributes.class);
            System.out.println("File Size: " + fileAttributes.size());
            System.out.println("isDirectory: " + fileAttributes.isDirectory());
            System.out.println("isRegaular File: " + fileAttributes.isRegularFile());
            System.out.println("isSymbolicLink: " + fileAttributes.isSymbolicLink());
            System.out.println("File last accessed time: " + fileAttributes.lastAccessTime());
            System.out.println("File last modified time: " + fileAttributes.lastModifiedTime());
            System.out.println("File creation time: " + fileAttributes.creationTime());
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
