/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author djoshi
 */
class DbCreateTable {

    public static void main(String[] args) {
        try (Connection connection = DbConnector.connectToDb();
                Statement statement = connection.createStatement()) {
            // use CREATE TABLE SQL statement to 
            // create table familyGroup
            statement.executeUpdate("CREATE TABLE familyGroup "
                    + "(id serial8 not null, nickName varchar(30) " 
                    + "not null, primary key(id));");
            System.out.println("Table created successfully");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
