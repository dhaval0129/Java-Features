/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.io.IOException;
import java.io.InputStream;
import static java.lang.ClassLoader.getSystemClassLoader;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author djoshi
 */
public class ReadPropertiesExample {

    public static void main(String args[]) {
        Properties prop = new Properties();
        try (InputStream is = getSystemClassLoader().getResourceAsStream("Messages.properties")) {
            // Load properties
            prop.load(is);
            // Prints The video has been adde
            System.out.println(prop.getProperty("video.added"));
            // It prints a default value if the key is not foun
            System.out.println(prop.getProperty("video.add", "default"));
            // Get all properties keys
            Enumeration<?> e = prop.propertyNames();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
