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
public class PathCompare2 {
    
    public static void main(String args[]) throws IOException {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path1 = Paths.get("Test");
        Path path2 = Paths.get(dir + fs + "Test");
        
        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}
