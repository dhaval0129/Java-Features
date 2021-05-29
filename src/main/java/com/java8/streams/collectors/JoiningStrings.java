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
public class JoiningStrings {

    private String id;
    private String name;

    public JoiningStrings(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]) {
        List<JoiningStrings> cList = Arrays.asList(
                new JoiningStrings("803", "OCAJP 7"), 
                new JoiningStrings("808", "OCAJP 8"), 
                new JoiningStrings("809", "OCPJP 8"));
        
        cList.stream()
                .filter(c -> c.getName().contains("8"))
                .map(c -> c.getId())
                .collect(Collectors.joining("1Z0-"));
        
        cList.stream().forEach(c->System.out.println(c.getId()));
        
    }
}
