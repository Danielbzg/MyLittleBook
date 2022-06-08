package com.mycompany.mylittlebook.Contenedores;

import java.util.Date;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

public class Copies_BoardGame extends BoardGame {

    private Boolean status;
    private int id_copy;

    public Copies_BoardGame(int id_bg, String title, String author, String theme, String URL_image, int n_copies, String Synopsis, double price, int n_players, int minimun_age, Boolean status, int id_copy) {
        super(id_bg, title, author, theme, URL_image, n_copies, Synopsis, price, n_players, minimun_age);
        this.status = status;
        this.id_copy = id_copy;
    }

}
