/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FlatMapExample2 {

    // prints unique words from three different sentences
    
    public static void main(String args[]) {
        String sentence1 = "Carpe diem. Seize the day, boys. Make your lives extraordinary.";
        String sentence2 = "Frankly, my dear, I don't give a damn!";
        String sentence3 = "Do I look like I give a damn?";
        List<String> sentences = Arrays.asList(sentence1, sentence2, sentence3);

        Stream<String> strm = sentences.stream()
                .flatMap(str -> Stream.of(str.split("[ ,.!?\r\n]")))
                .filter(s -> s.length() > 0)
                .distinct();

        strm.forEach(System.out::println);
    }
}
