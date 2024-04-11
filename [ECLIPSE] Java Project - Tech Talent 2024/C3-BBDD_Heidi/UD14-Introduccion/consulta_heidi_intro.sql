CREATE DATABASE prueba_techtalent;
USE prueba_techtalent;
CREATE TABLE gente (nombre VARCHAR(40), fecha DATE);
CREATE TABLE usuarios 
(id INT AUTO_INCREMENT, 
nombre VARCHAR(100) NOT NULL, 
email VARCHAR(100) NOT NULL, 
PRIMARY KEY (id));
CREATE TABLE ciudad1 (nombre CHAR(20)NOT NULL, poblacion INT NULL);