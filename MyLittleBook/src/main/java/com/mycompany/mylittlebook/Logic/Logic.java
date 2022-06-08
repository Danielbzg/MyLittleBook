package com.mycompany.mylittlebook.Logic;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */
public class Logic {

    public Logic() {}

    public void register_Book(int id_book, String title, String author, int release_year, String theme, String URL_image, int n_copies, String Synopsis, double price) {
        Connection conn = Conection.connect();
        if (conn != null) {
            try {
                Statement statement = conn.createStatement();
                System.out.println("INSERT INTO BOOK(ID_BOOK, TITLE, AUTHOR, RELEASE_YEAR, THEME, URL_IMAGE, N_COPIES, SYNOPSIS, PRICE) VALUES (" + id_book + ", '" + title + "', '" + author + "', " + release_year + ", '" + theme + "', '" + URL_image + "', " + n_copies + ", '" + Synopsis + "', " + price + ");");
                statement.executeUpdate("INSERT INTO BOOK(ID_BOOK, TITLE, AUTHOR, RELEASE_YEAR, THEME, URL_IMAGE, N_COPIES, SYNOPSIS, PRICE) VALUES (" + id_book + ", '" + title + "', '" + author + "', " + release_year + ", '" + theme + "', '" + URL_image + "', " + n_copies + ", '" + Synopsis + "', " + price + ");");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conection.cerrarConexion(conn);
            }
        }
    }

    public void register_BoardGame(int id_bg, String title, String author, String theme, String URL_image, int n_copies, String Synopsis, double price, int n_players, int minimun_age) {
        Connection conn = Conection.connect();
        if (conn != null) {
            try {
                Statement statement = conn.createStatement();
                System.out.println("INSERT INTO BOARDGAME(ID_BG, TITLE, AUTHOR, THEME, URL_IMAGE, N_COPIES, SYNOPSIS, PRICE, N_PLAYERS, MINIMUN_AGE) VALUES (" + id_bg + ", '" + title + "', '" + author + "', '" + theme + "', '" + URL_image + "', " + n_copies + ", '" + Synopsis + "', " + price + ", " + n_players + ", " + minimun_age + ");");
                statement.executeUpdate("INSERT INTO BOARDGAME(ID_BG, TITLE, AUTHOR, THEME, URL_IMAGE, N_COPIES, SYNOPSIS, PRICE, N_PLAYERS, MINIMUN_AGE) VALUES (" + id_bg + ", '" + title + "', '" + author + "', '" + theme + "', '" + URL_image + "', " + n_copies + ", '" + Synopsis + "', " + price + ", " + n_players + ", " + minimun_age + ");");
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conection.cerrarConexion(conn);
            }
        }

    }

    public void rent_Book() {

    }

    public void rent_BoardGame() {

    }

    public void sell_BoardGame() {

    }
}
