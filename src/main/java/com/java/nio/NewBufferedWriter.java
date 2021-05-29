/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class NewBufferedWriter {
    
    public static void main(String args[]) {
        Path path = Paths.get("/animals/gorilla.txt");
        List<String> data = new ArrayList();
        
        try(BufferedWriter writer = Files.newBufferedWriter(path, 
                Charset.forName("UTF-16"))) {
            writer.write("Hello World");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
