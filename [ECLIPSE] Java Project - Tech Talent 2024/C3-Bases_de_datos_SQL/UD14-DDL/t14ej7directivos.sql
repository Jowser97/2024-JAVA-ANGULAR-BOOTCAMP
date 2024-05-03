CREATE DATABASE directores;

CREATE TABLE despachos (
    numero INT PRIMARY KEY,
    capacidad INT NOT NULL
);

CREATE TABLE directores (
    dni VARCHAR (8) PRIMARY KEY,
    nom_apels VARCHAR (255) NOT NULL,
    despacho INT KEY,
    FOREIGN KEY (despacho) REFERENCES despachos (numero) ON DELETE SET NULL ON UPDATE CASCADE,
    dni_jefe VARCHAR (8),
    dni_jefe KEY,
    FOREIGN KEY (dni_jefe) REFERENCES directores (dni) ON DELETE SET NULL ON UPDATE CASCADE
);