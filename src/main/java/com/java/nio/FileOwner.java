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
import java.nio.file.attribute.UserPrincipal;

/**
 *
 * @author djoshi
 */
public class FileOwner {
    
    public static void main(String args[]) {
        try {
            Path path = Paths.get("temp.data");
            System.out.println(Files.getOwner(path).getName());
            
            // Change owner of file
            UserPrincipal owner = path.getFileSystem()
                    .getUserPrincipalLookupService().lookupPrincipalByName("djoshi");
            Files.setOwner(path, owner);
            
            // Output the updated owner information
            System.out.println(Files.getOwner(path).getName());
        } catch(IOException ie) {
            ie.printStackTrace();
        }
    }
}
