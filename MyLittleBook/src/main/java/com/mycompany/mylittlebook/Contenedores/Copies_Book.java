package com.mycompany.mylittlebook.Contenedores;

import java.util.Date;

/**
 * 
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */

public class Copies_Book extends Book{
	private Boolean status;
	private int id_copy;
	public Copies_Book(int id_book, String title, String author, Date release_year, String theme, String URL_image, int n_copies, String Synopsis, double price, Boolean status, int id_copy) {
		super(id_book, title, author, release_year, theme, URL_image, n_copies, Synopsis, price);
		this.status = status;
		this.id_copy= id_copy;
	}
}
