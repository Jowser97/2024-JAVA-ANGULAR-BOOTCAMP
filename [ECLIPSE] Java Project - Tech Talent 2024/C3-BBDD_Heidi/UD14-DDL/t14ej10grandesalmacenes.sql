CREATE DATABASE grandes_almacenes;

USE grandes_almacenes;
CREATE TABLE productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio INT NOT NULL
);

USE grandes_almacenes;
CREATE TABLE cajeros (
    id_cajero INT AUTO_INCREMENT PRIMARY KEY,
    nom_apels VARCHAR (255)
);

USE grandes_almacenes;
CREATE TABLE maq_registradoras (
    id_maquina INT AUTO_INCREMENT PRIMARY KEY,
    piso INT NOT NULL
);

USE grandes_almacenes;
CREATE TABLE venta (
    id_producto INT,
    KEY (id_producto),
    FOREIGN KEY (id_producto) REFERENCES productos (id_producto) ON DELETE RESTRICT ON UPDATE RESTRICT,
    id_cajero INT,
    KEY (id_cajero),
    FOREIGN KEY (id_cajero) REFERENCES cajeros (id_cajero) ON DELETE RESTRICT ON UPDATE RESTRICT,
    id_maquina INT,
    KEY (id_maquina),
    FOREIGN KEY (id_maquina) REFERENCES maq_registradoras (id_maquina) ON DELETE RESTRICT ON UPDATE RESTRICT
);