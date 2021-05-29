/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author djoshi
 */
public class LocaleExample2 {
    
    public static void main(String args[]) {
        Locale locale = Locale.getDefault();
        
        System.out.println("Country Code: " + locale.getCountry());
        System.out.println("Country Name: " + locale.getDisplayCountry());
        System.out.println("Language Code: " + locale.getLanguage());
        System.out.println("Language Name: " + locale.getDisplayLanguage());
        
        Locale[] locales = Locale.getAvailableLocales();
        Arrays.stream(locales).limit(10).forEach(System.out::println);
    }
}
