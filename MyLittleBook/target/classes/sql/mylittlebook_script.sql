-- Creación de la base de datos
CREATE DATABASE MyLittleBook;

-- Creación de las tablas
CREATE TABLE PENALTY (
	Id_Penalty INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    DESCRIPTION VARCHAR(6383)
);
CREATE TABLE USERS (
	Id_User VARCHAR(9) PRIMARY KEY NOT NULL,
    NICK VARCHAR(50) NOT NULL,
    USER_NAME VARCHAR(50) NOT NULL,
    SURNAME1 VARCHAR(50) NOT NULL,
    SURNAME2 VARCHAR(50) NOT NULL,
    EMAIL VARCHAR(50) NOT NULL,
    USER_PASSWORD VARCHAR(50) NOT NULL,
    Rol VARCHAR(6) NOT NULL DEFAULT('CLIENT')
);
ALTER TABLE USERS ADD CONSTRAINT Check_Rol CHECK (Rol in ('CLIENT', 'ADMIN'));
CREATE TABLE HAVE (
	Id_User VARCHAR(9) PRIMARY KEY NOT NULL,
    Id_Penalty INT NOT NULL,
    FOREIGN KEY (Id_User) REFERENCES USERS(Id_User) ON DELETE CASCADE,
    FOREIGN KEY (Id_Penalty) REFERENCES PENALTY(Id_Penalty) ON DELETE CASCADE
);
CREATE TABLE BOOK (
	Id_Book INT PRIMARY KEY NOT NULL,
    Title VARCHAR(100) NOT NULL,
    Author VARCHAR(100) NOT NULL,
    Release_Year INT(4) NOT NULL,
    Theme VARCHAR(100) NOT NULL,
    URL_Image VARCHAR(6383) NOT NULL,
    N_Copies INT NOT NULL,
    Synopsis VARCHAR(6383) NOT NULL,
    Price DECIMAL(10,2) NOT NULL
);
CREATE TABLE BOARDGAME (
	Id_BG INT PRIMARY KEY NOT NULL,
    Title VARCHAR(100) NOT NULL,
    Author VARCHAR(100) NOT NULL,
    Theme VARCHAR(100) NOT NULL,
    URL_Image VARCHAR(6383) NOT NULL,
    N_Copies INT NOT NULL,
    Synopsis VARCHAR(6383) NOT NULL,
    Price DECIMAL(10,2) NOT NULL,
    N_Players INT NOT NULL,
    Minimun_Age INT NOT NULL
);
CREATE TABLE COPIES_BOOK (
	Id_Copy INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Id_Book INT NOT NULL,
    Copy_Status VARCHAR(4),
    FOREIGN KEY (Id_Book) REFERENCES BOOK(Id_Book) ON DELETE CASCADE
);
ALTER TABLE USERS ADD CONSTRAINT Check_STATUS_B CHECK (Rol in ('RENT', 'FREE'));
CREATE TABLE COPIES_BOARDGAME (
	Id_Copy INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    Id_BG INT NOT NULL,
    Copy_Status VARCHAR(4),
    FOREIGN KEY (Id_BG) REFERENCES BOARDGAME(Id_BG) ON DELETE CASCADE
);
ALTER TABLE USERS ADD CONSTRAINT Check_STATUS_BG CHECK (Rol in ('RENT', 'FREE'));
CREATE TABLE COPIES_RENT_BOOK (
	Id_Copy INT PRIMARY KEY NOT NULL,
    Id_User VARCHAR(9) NOT NULL,
    Reservation_Date DATE,
    Return_Date DATE,
    FOREIGN KEY (Id_Copy) REFERENCES COPIES_BOOK(Id_Copy) ON DELETE CASCADE,
    FOREIGN KEY (Id_User) REFERENCES USERS(Id_User) ON DELETE CASCADE
);
CREATE TABLE COPIES_RENT_BOARDGAME (
	Id_Copy INT PRIMARY KEY NOT NULL,
    Id_User VARCHAR(9) NOT NULL,
    Reservation_Date DATE,
    Return_Date DATE,
    FOREIGN KEY (Id_Copy) REFERENCES COPIES_BOARDGAME(Id_Copy) ON DELETE CASCADE,
    FOREIGN KEY (Id_User) REFERENCES USERS(Id_User) ON DELETE CASCADE
);INSERT INTO BOOK(ID_BOOK, TITLE, AUTHOR, RELEASE_YEAR, THEME, URL_IMAGE, N_COPIES, SYNOPSIS, PRICE) VALUES (1, 'Ensayo sobre la ceguera', 'José Saramago', 1991, 'Ensayo', 'iSstock', 27, 'Que pasaria en el mundo si todo el mundo fuese ciego' 20);