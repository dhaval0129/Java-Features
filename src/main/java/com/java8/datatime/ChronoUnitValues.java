/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.temporal.ChronoUnit;

/**
 *
 * @author djoshi
 */
public class ChronoUnitValues {

    public static void main(String args[]) {
        System.out.println("ChronoUnit \t DateBased \t TimeBased \t Duration");
        System.out.println("-----------\t-----------\t-----------\t---------");

        for (ChronoUnit unit : ChronoUnit.values()) {
            System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
                    unit, unit.isDateBased(),
                    unit.isTimeBased(), unit.getDuration());
        }
    }
}
