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
public class PathInfo1 {

    public static void main(String[] args) {
        // create a Path object by calling static method get() in Paths class
        String dir = System.getProperty("user.dir");
        String fs = System.getProperty("file.separator");
        Path testFilePath = Paths.get(dir + fs + "testfile.txt");

        // retrieve basic information about path
        System.out.println("Printing file information: ");
        System.out.println("\t file name: " + testFilePath.getFileName());
        System.out.println("\t root of the path: " + testFilePath.getRoot());
        System.out.println("\t parent of target: " + testFilePath.getParent());
        System.out.println("\t get Name Count: " + testFilePath.getNameCount());
        System.out.println("\t get index : " + testFilePath.getName(0));
        // print path elements
        System.out.println("Printing elements of the path: ");
        for (Path element : testFilePath) {
            System.out.println("\t path element: " + element);
        }
    }
}
