package com.mycompany.mylittlebook.Contenedores;

/**
 *
 * @author Eduardo Claros Escalante
 * @author Fernando Garcia Bernabe
 * @author Antonio Urbano Gomez
 * @author Daniel Boza Garcia
 */
public class User {

    private int id_User;
    private String nick;
    private String name;
    private String surname1;
    private String surname2;
    private String email;
    private String password;
    private String rol;

    public User(int id_user, String nick, String surname1, String surname2, String email, String password, String rol) {
        this.id_User = id_user;
        this.nick = nick;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }
;
}
