package com.mycompany.mylittlebook.Contenedores;

import java.util.Date;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

public class Book {

    protected int id_book;
    protected String title;
    protected String author;
    protected Date release_year;
    protected String theme;
    protected String URL_image;
    protected int n_copies;
    protected String Synopsis;
    protected double price;

    public Book(int id_book, String title, String author, Date release_year, String theme, String URL_image, int n_copies, String Synopsis, double price) {
        this.id_book = id_book;
        this.title = title;
        this.author = author;
        this.release_year = release_year;
        this.theme = theme;
        this.URL_image = URL_image;
        this.n_copies = n_copies;
        this.Synopsis = Synopsis;
        this.price = price;
    }
}
