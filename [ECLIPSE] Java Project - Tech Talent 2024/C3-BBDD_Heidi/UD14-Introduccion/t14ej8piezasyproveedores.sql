CREATE DATABASE piezas_y_proveedores;

USE piezas_y_proveedores;
CREATE TABLE piezas (
    id_pieza INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (100) NOT NULL
);

USE piezas_y_proveedores;
CREATE TABLE proveedores (
    id_proveedor INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (100) NOT NULL
);

USE piezas_y_proveedores;
CREATE TABLE suministra (
    id_pieza INT,
    KEY (id_pieza),
    FOREIGN KEY (id_pieza) REFERENCES piezas (id_pieza) ON DELETE CASCADE ON UPDATE CASCADE,
    id_proveedor INT,
    KEY (id_proveedor),
    FOREIGN KEY (id_proveedor) REFERENCES proveedores (id_proveedor) ON DELETE CASCADE ON UPDATE CASCADE,
    precio INT NOT NULL
);