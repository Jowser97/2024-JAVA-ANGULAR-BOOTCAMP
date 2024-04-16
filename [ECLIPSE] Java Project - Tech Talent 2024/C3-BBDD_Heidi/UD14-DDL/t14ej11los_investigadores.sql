CREATE DATABASE los_investigadores;

USE los_investigadores;
CREATE TABLE facultad (
    id_facultad INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (100)
)

USE los_investigadores;
CREATE TABLE investigadores (
    dni VARCHAR (8) PRIMARY KEY,
    nom_apels VARCHAR (255) NOT NULL,
    id_facultad INT,
    KEY (id_facultad),
    FOREIGN KEY (id_facultad) REFERENCES facultad (id_facultad) ON DELETE RESTRICT ON UPDATE CASCADE
);

USE los_investigadores;
CREATE TABLE equipos (
    num_serie CHAR (4) PRIMARY KEY,
    nombre VARCHAR (100) NOT NULL,
    id_facultad INT,
    KEY (id_facultad),
    FOREIGN KEY (id_facultad) REFERENCES facultad (id_facultad) ON DELETE RESTRICT ON UPDATE CASCADE
);

USE los_investigadores;
CREATE TABLE reserva (
    dni VARCHAR (8),
    KEY (dni),
    FOREIGN KEY (dni) REFERENCES investigadores (dni) ON DELETE RESTRICT ON UPDATE RESTRICT,
    num_serie CHAR (4),
    KEY (num_serie),
    FOREIGN KEY (num_serie) REFERENCES equipos (num_serie) ON DELETE RESTRICT ON UPDATE RESTRICT
);

ALTER TABLE reserva ADD COLUMN comienzo DATETIME NOT NULL;
ALTER TABLE reserva ADD COLUMN fin DATETIME NOT NULL;