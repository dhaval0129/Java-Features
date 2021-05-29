/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FileAttributes {

    public static void main(String args[]) {
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path path = Paths.get(dir + fs + "Test");

        try {
            Object object = Files.getAttribute(path, "creationTime", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Creation time: " + object);

            object = Files.getAttribute(path, "lastModifiedTime", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Last modified time: " + object);

            object = Files.getAttribute(path, "size", LinkOption.NOFOLLOW_LINKS);
            System.out.println("Size: " + object);

            object = Files.getAttribute(path, "dos:hidden", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isHidden: " + object);

            object = Files.getAttribute(path, "isDirectory", LinkOption.NOFOLLOW_LINKS);
            System.out.println("isDirectory: " + object);
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
