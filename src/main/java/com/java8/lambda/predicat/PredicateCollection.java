/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author djoshi
 *
 * Java example of predicates on collections, the program finds all admins in an
 * array-list of users
 */
public class PredicateCollection {

    static class User {

        private String name;
        private String role;

        User(String name, String role) {
            this.name = name;
            this.role = role;
        }

        public String getRole() {
            return role;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "User Name: " + name + " ,Role : " + role;
        }
    }

    private static List<User> process(List<User> users, Predicate<User> predicate) {
        List<User> results = new ArrayList<>();
        
        for (User user : users) {
            if (predicate.test(user)) {
                results.add(user);
            }
        }

        return results;
    }

    public static void main(String args[]) {
        List<User> users = new ArrayList<>();
        users.add(new User("Picard", "captain"));  // enterprise
        users.add(new User("karthryn", "captain")); // voyager
        users.add(new User("Data", "commander"));
        users.add(new User("Riker", "commander"));
        users.add(new User("wesly", "ensign"));
        users.add(new User("Harry", "ensign"));

        // print users with roles of captains
        List captains = process(users, (User u) -> (u.getRole().equals("captain")));
        System.out.println(captains);
        // print users with roles of comander
        List commanders = process(users, u -> u.getRole().equals("commander"));
        System.out.println(commanders);
        
    }
}
