package com.mycompany.mylittlebook;

import com.mycompany.mylittlebook.Logic.Logic;
import java.sql.Connection;
import java.util.Date;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

public class MyLittleBook {
    public static void main(String[] args) {
        Logic book = new Logic();
        /*int id_book, n_copies, price;
	String title, author, theme, URL_image, Synopsis;
	Date release_year;*/

        /*book.register_Book(2, "Ensayo sobre la ceguera", "José Saramago", 1991, "Ensayo", "iSstock", 27, "Que pasaria en el mundo si todo el mundo fuese ciego", 20);*/
        book.register_BoardGame(24, "Monopoly", "Nando", "Compra", "Tom Nook.jpg", 3000, "Usurero", 35, 4, 18);
    }
}
