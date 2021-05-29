/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author djoshi
 */
public class CollectorsToList {
    
    public static void main(String args[]) {
        String frenchCounting = "un:deux:trois:quatre";
        List gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting)
                .collect(Collectors.toList()); // converts to toList()
        
        gmailList.forEach(System.out::println);
    }
}
