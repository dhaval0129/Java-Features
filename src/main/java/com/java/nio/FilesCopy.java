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
public class FilesCopy {

    public static void main(String args[]) {
        try {
            Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
            Files.copy(Paths.get("/panda/bamboo.txt"), 
                    Paths.get("/panda-save/bamboo.txt"));
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
