/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
class Toy {

    double price;
    String color;

    Toy(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

public class StreamMap {

    public static void main(String args[]) {
        List<Toy> toys = new ArrayList<>();
        toys.add(new Toy("red", 10));
        toys.add(new Toy("yellow", 10));
        toys.add(new Toy("red", 10));
        double totalPrice = toys.stream()
            .filter(e -> e.getColor() == "red")
            //.map(e -> e.getPrice())
            .mapToDouble(e -> e.getPrice())
            .sum();
        System.out.println("Total Price of Red Toys: " + totalPrice);
        findExample();
    }
    
    private static void spot(Optional<Collection> x) {
        x.filter(y -> !y.isEmpty())
        .map(y -> 8)
        .ifPresent(System.out::println);
    }
    
    private static void findExample() {
        Stream<Integer> stream = Stream.iterate(1, i -> i);
        boolean b = stream.allMatch(i -> i > 5);
        System.out.println(b);
    }
}
