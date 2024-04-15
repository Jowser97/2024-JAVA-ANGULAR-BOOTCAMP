CREATE DATABASE los_cientificos;

USE los_cientificos;
CREATE TABLE cientificos (
    dni VARCHAR (8) PRIMARY KEY,
    nom_apels VARCHAR (255) NOT NULL
);

USE los_cientificos;
CREATE TABLE proyecto (
    id_proyecto CHAR (4) AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (255),
    horas INT
);

USE los_cientificos;
CREATE TABLE asignado_a (   
    cientifico VARCHAR (8),
    KEY (cientifico),
    FOREIGN KEY (cientifico) REFERENCES cientificos (dni) ON DELETE SET NULL ON UPDATE CASCADE,
    id_proyecto CHAR (4),
    KEY (id_proyecto),
    FOREIGN KEY (id_proyecto) REFERENCES proyecto (id_proyecto) ON DELETE SET NULL ON UPDATE CASCADE
);