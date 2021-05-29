/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FilePermissions {

    public static void main(String args[]) {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path = Paths.get(dir + fs + "Test");
        System.out.printf("Readable: %b, Writable: %b, Executable: %b ",
                Files.isReadable(path), Files.isWritable(path), Files.isExecutable(path));

    }
}
