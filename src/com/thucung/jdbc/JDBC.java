package com.thucung.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.*;

/**
 *
 * @author 💖 Trần Lại 💖
 * @copyright 💖 GirlkuN 💖
 *
 */
public class JDBC {

    private static final String server;
    private static final String port;
    private static final String database;
    private static final String userName;
    private static final String passWord;

    static {
        String[] configs = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            BufferedReader br = new BufferedReader(new FileReader(new File("data/db/config.txt")));
            String config = br.readLine();
            br.close();
            configs = config.split(" ");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        server = configs[0];
        port = configs[1];
        database = configs[2];
        userName = configs[3];
        passWord = configs[4];
    }
    
    private Connection connection;

    private JDBC() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://" + server + ":" + port
                    + ";databasename=" + database, userName, passWord);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static synchronized JDBC getInstance() {
        return JDBCHelper.INSTANCE;
    }

    public Connection getConnection() {
        return connection;
    }
    
    public static void open(){
        getInstance();
    }

    public static void closeConnection() {
        if (JDBCHelper.INSTANCE != null) {
            try {
                JDBCHelper.INSTANCE.connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static class JDBCHelper{
        private static final JDBC INSTANCE = new JDBC();
    }
}
