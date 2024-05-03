CREATE DATABASE losalmacenes;

CREATE TABLE almacenes (
    codigo INT AUTO_INCREMENT PRIMARY KEY,
    lugar VARCHAR (100) NOT NULL,
    capacidad INT NOT NULL
);

CREATE TABLE cajas (
    num_referencia CHAR (5) PRIMARY KEY,
    contenido VARCHAR (100) NOT NULL,
    valor INT,
    almacen INT,
    KEY (almacen),
    FOREIGN KEY (almacen) REFERENCES almacenes (codigo) ON DELETE SET NULL ON UPDATE CASCADE
);