/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class Computer implements Comparable<Computer> {

    private String brand;
    private int id;

    public Computer(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    @Override
    public int compareTo(Computer other) {
        int result = this.brand.compareTo(other.brand);

        if (result == 0) {
            if (this.id > other.id) {
                result = 1;
            } else if (this.id < other.id) {
                result = -1;
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Computer)) {
            return false;
        }

        return this.brand.equals(other)
                && this.id == ((Computer) other).id;
    }

    public static void main(String args[]) {
        Computer c1 = new Computer("Lenovo", 1);
        Computer c2 = new Computer("Apple", 2);
        Computer c3 = new Computer("Dell", 3);
        Computer c4 = new Computer("Lenevo", 2);

        // Some comparisons
        System.out.println(c1.compareTo(c1)); // c1 == c1
        System.out.println(c1.compareTo(c2)); // c1 > c2
        System.out.println(c2.compareTo(c1)); // c2 < c1
        System.out.println(c1.compareTo(c4)); // c1 < c2
        System.out.println(c1.equals(c4)); // c1 != c2

        System.out.println("\n\n");
        // creating the list and sorting it
        List<Computer> list = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list);
        list.forEach(c -> System.out.format("%s-%d\n", c.brand, c.id));

        Comparator<Computer> sortById = new Comparator<Computer>() {
            @Override
            public int compare(Computer c1, Computer c2) {
                int result = Integer.compare(c1.id, c2.id);
                return result == 0
                        ? c1.brand.compareTo(c2.brand) : result;
            }
        };

        System.out.println("\n\n");
        List<Computer> list1 = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list1, sortById);
        list1.forEach(
                c -> System.out.format("%d-%s\n", c.id, c.brand)
        );

        System.out.println("\n\n");
        List<Computer> list3 = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list3,
            Comparator.comparing((Computer c) -> c.id).reversed());
            list.forEach(c -> System.out.format("%d-%s\n", c.id, c.brand));
    }
}
