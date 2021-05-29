/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author djoshi
 */
public class DbConnector {

    public static Connection connectToDb() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/";
        String database = "addressBook";
        String userName = "postgres";
        String password = "clarity2008!";
//        return DriverManager.getConnection(url + database, userName, password);
        Properties props = new Properties();
//        props.put("jdbc.drivers", "org.postgresql.Driver");
//        props.put("user", userName);
//        props.put("password", password);

        // Note: There is getProperty() but there is not get()
        props.setProperty("jdbc.drivers", "org.postgresql.Driver");
        props.setProperty("user", userName);
        props.setProperty("password", password);
        return DriverManager.getConnection(url + database, props);
    }
}
