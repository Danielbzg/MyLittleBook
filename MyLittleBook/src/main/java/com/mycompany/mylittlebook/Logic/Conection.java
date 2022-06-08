package com.mycompany.mylittlebook.Logic;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conection {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String BBDD = "jdbc:mysql://localhost:3306/mylittlebook";

    public Conection() {
        connect();
    }

    public static Connection connect() {
        Connection conec = null;
        try {
            Class.forName(DRIVER);
            conec = DriverManager.getConnection(BBDD, USER, PASSWORD);
        } catch (Exception e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        }
        return conec;
    }

    public static void cerrarConexion(Connection conec) {
        try {
            conec.close();
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        }
    }
}