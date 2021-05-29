/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class PathCompare1 {

    public static void main(String args[]) {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path1 = Paths.get("Test");
        Path path2 = Paths.get( dir + fs + "Test");
       
        // comparing two paths using compareTo() method
        System.out.println("(path1.compareTo(path2) == 0) is: "
                + (path1.compareTo(path2) == 0));
        // comparing two paths using equals() method
        System.out.println("path1.equals(path2) is: " + path1.equals(path2));

        // comparing two paths using equals() method with absolute path
        System.out.println("path2.equals(path1.toAbsolutePath()) is "
                + path2.equals(path1.toAbsolutePath()));
    }
}
