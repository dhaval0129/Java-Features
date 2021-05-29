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
public class AvaliableLocalesEnglish {

    public static void main(String args[]) {
        Arrays.stream(Locale.getAvailableLocales())
                .filter(locale -> locale.getLanguage().equals("en"))
                .forEach(locale -> System.out.printf("Locale code: %s and it stands for %s %n",
                locale, locale.getDisplayName()));
    }
}
