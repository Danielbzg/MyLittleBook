package com.mycompany.mylittlebook.Logic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String BBDD = "jdbc:mysql://localhost:3306/mysql";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public static Connection conexionBBDD() {
        Connection conec = null; // Controlamos las excepciones que aparecen al interactuar en la BBDD
        try {
            Class.forName(DRIVER);
            //Crear una conexion a la base de datos
            conec = DriverManager.getConnection(BBDD, USUARIO, PASSWORD);
        } catch (Exception e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        }
        return conec;
    }

    public static void cerrarConexion(Connection connection) {
        try {
            //Cierre de conexion
            connection.close();
        } catch (SQLException e) {
            System.err.println("Se ha producido un error al conectar con la base de datos.\n" + e);
        }
    }

    public static void creacionBD() throws IOException {

        Connection conn = conexionBBDD();
        if (conn != null) {
            try {
                Statement stmt = conn.createStatement();
                try {
                    stmt.executeQuery("SELECT * FROM MYLITTLEBOOK.USER");
                    System.out.println("La base de datos ya está creada");
                } catch (SQLException e) {
                    System.out.println("Base de datos creada");
                    stmt.execute("CREATE DATABASE MYLITTLEBOOK;");
                    stmt.execute("USE MYLITTLEBOOK");
                    String sCadena = "";
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("./resources/sql/bd_mylittlebook.sql"));
                        while ((sCadena = br.readLine()) != null) {
                            //System.out.println("Cadena: " + sCadena);
                            stmt.execute(sCadena);
                        }
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                cerrarConexion(conn);
            }
        } else {
            System.out.println("No se ha realizado la conexion");
        }
    }
}