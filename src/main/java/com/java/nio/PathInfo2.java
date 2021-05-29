/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class PathInfo2 {
    
    public static void main(String args[]) throws IOException {
        // get a path object with relative path
        Path testFilePath = Paths.get("C:/OCPJP/programs/NIO2/");
        System.out.println("The file name is: " + testFilePath.getFileName());
        System.out.println("Its URI is: " + testFilePath.toUri());
        System.out.println("Its absolute path is: " + testFilePath.toAbsolutePath());
        System.out.println("Its normalized path is: " + testFilePath.normalize());
        
        // get another path object with normalized relative path
        Path testPathNormalized = Paths.get(testFilePath.normalize().toString());
        System.out.println("Its normalized absolute path is: " 
                + testPathNormalized.toAbsolutePath());
//        System.out.println("Its normalized real path is: " 
//                + testFilePath.toRealPath(LinkOption.NOFOLLOW_LINKS));
        System.out.println("Path resolveSibling: "  + testFilePath.resolveSibling("test.txt") );
        
        Path dirName = Paths.get("D:\\OCPJP\\programs\\NIO2");
        Path resolvedPath = dirName.resolve("Test");
        
        System.out.println(resolvedPath);
    }
}
