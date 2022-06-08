package com.mycompany.mylittlebook.Contenedores;

import java.util.Date;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

public class BoardGame {

    protected int id_bg;
    protected String title;
    protected String author;
    protected String theme;
    protected String URL_image;
    protected int n_copies;
    protected String Synopsis;
    protected double price;
    protected int n_players;
    protected int minimun_age;

    public BoardGame(int id_bg, String title, String author, String theme, String URL_image, int n_copies, String Synopsis, double price, int n_players, int minimun_age) {
        this.id_bg = id_bg;
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.URL_image = URL_image;
        this.n_copies = n_copies;
        this.Synopsis = Synopsis;
        this.price = price;
        this.n_players = n_players;
        this.minimun_age = minimun_age;
    }
}
