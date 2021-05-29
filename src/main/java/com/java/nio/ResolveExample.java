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
public class ResolveExample {

    public static void main(String args[]) {
        Path p1 = Paths.get("/photos/vacation");
        Path p2 = Paths.get("/yellowstone");
        System.out.println(p1.resolve(p2) + "  " + p1.relativize(p2));
    }
}
