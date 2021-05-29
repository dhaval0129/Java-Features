/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author djoshi
 */
public class FilesMove {

    public static void main(String args[]) {
        try {
            Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
            Files.move(Paths.get("c:\\user\\address.txt"), 
                Paths.get("c:\\zoo-new\\addresses.txt"));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
