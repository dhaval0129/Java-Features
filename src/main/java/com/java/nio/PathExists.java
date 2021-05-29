/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class PathExists {

    public static void main(String args[]) {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path = Paths.get(dir + fs + "\\Test");

        if (Files.exists(path, LinkOption.NOFOLLOW_LINKS)) {
            System.out.println("The file/directory " + path.getFileName() + " exists");
            // check whether it is a file or directory
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
                System.out.println(path.getFileName() + " is a directory");
            } else {
                System.out.println(path.getFileName() + " is a path");
            }
        } else {
            System.out.println("The file/directory " + path.getFileName() + " does not exists");
        }
    }
}
