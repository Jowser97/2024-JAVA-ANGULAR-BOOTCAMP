CREATE DATABASE cine;

CREATE TABLE peliculas (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (100) NOT NULL,
    cal_edad INT NOT NULL
);

CREATE TABLE salas (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (100) NOT NULL,
    pelicula INT,
    KEY (pelicula),
    FOREIGN KEY (pelicula) REFERENCES peliculas (codigo) ON DELETE SET NULL ON UPDATE CASCADE
);