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
public class PathRelativize {

    public static void main(String args[]) {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = Paths.get("c:\\personal\\index.html");
        Path p3 = p1.relativize(p2);
        System.out.println(p3);

        Path p4 = Paths.get("\\photos\\vacation");
        Path p5 = Paths.get("\\yellowstone");
        System.out.println(p4.resolve(p5) + "  " + p4.relativize(p5));
    }
}
