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
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author djoshi
 */
public class BasicFileAttributeViewSample {
    
    public static void main(String args[]) throws IOException {
        Path path = Paths.get("temp.data");
        
        BasicFileAttributeView view = 
                Files.getFileAttributeView(path, BasicFileAttributeView.class);
        BasicFileAttributes data = view.readAttributes();
        
        FileTime lastModifiedTime = FileTime.fromMillis( 
                data.lastModifiedTime().toMillis() + 10_000);
        
        view.setTimes(lastModifiedTime, 
                FileTime.fromMillis(System.currentTimeMillis()) , null);
    }
}
