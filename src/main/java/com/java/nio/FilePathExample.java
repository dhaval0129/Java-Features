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
public class FilePathExample {
    
    public static void main(String args[]) {
        Path p1 = Paths.get("../sang").getParent().getParent();
        Path p2 = Paths.get("/sing").getParent().getRoot();
        Path p3 = Paths.get("/song").getRoot().getRoot();
//        Path p4 = Paths.get("../sung").getRoot().getParent();
    }
}
