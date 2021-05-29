/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author djoshi
 */
public class Student {

    public static enum Grade {
        A, B, C, D, F
    }
    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ":" + grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public static void main(String args[]) {
        List<Student> ls = Arrays.asList(
                new Student("S1", Student.Grade.A),
                new Student("S2", Student.Grade.A),
                new Student("S3", Student.Grade.C));

        Map<Student.Grade, List<Student>> grouping1
                = ls.stream().collect(Collectors.groupingBy(s -> s.getGrade()));
        System.out.println(grouping1);

        Map<Student.Grade, List<String>> grouping2 
                = ls.stream().collect(Collectors.groupingBy(
                        Student::getGrade, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println("\n"+grouping2);
    }
}
