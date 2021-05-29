/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author djoshi
 */
class Book {

    String title;
    double price;

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

public class MapExample {

    public static void main(String args[]) {
        List<Book> books1 = Arrays.asList(
                new Book("Gone with the wind", 5.0),
                new Book("Gone with the wind", 10.0),
                new Book("Atlas Shrugged", 15.0));

        books1.stream().collect(Collectors
                .toMap(b -> b.getPrice(), b -> b.getTitle()))
                .forEach((a, b) -> System.out.println(a + " " + b));

        List<Book> books2 = Arrays.asList(
                new Book("Thinking in Java", 30.0),
                new Book("Java in 24 hrs", 20.0),
                new Book("Java Recipies", 10.0));
        
        double averagePrice = books2.stream()
                .filter(b -> b.getPrice() > 10)
                .mapToDouble(b -> b.getPrice())
                .average().getAsDouble();
        System.out.println("\n"+averagePrice);
    }
}
