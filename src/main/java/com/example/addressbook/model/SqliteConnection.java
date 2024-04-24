package com.example.addressbook.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * A class that creates a connection to a specified database.
 */
public class SqliteConnection {

    /**
     * The instance of a database connection.
     */
    private static Connection instance = null;

    /**
     * Creates the connection to the specified database.
     */
    private SqliteConnection() {
        String url = "jdbc:sqlite:contacts.db";
        try {
            instance = DriverManager.getConnection(url);
        } catch (SQLException sqlEx) {
            System.err.println(sqlEx);
        }
    }

    /**
     * Checks to see if a database connection exists, and creates one if there is none.
     * @return The database connection instance.
     */
    public static Connection getInstance() {
        if (instance == null) {
            new SqliteConnection();
        }
        return instance;
    }
}