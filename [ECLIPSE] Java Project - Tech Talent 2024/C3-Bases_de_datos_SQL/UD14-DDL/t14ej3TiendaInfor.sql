CREATE DATABASE tiendaInformatica;

CREATE TABLE fabricantes (
    id_fabricante INT AUTO_INCREMENT PRIMARY KEY,
    nombre_fabricante VARCHAR (40) NOT NULL);
    
ALTER TABLE fabricantes
MODIFY COLUMN nombre_fabricante VARCHAR(100);

CREATE TABLE articulos (
    id_articulo INT AUTO_INCREMENT PRIMARY KEY,
    nombre_articulo VARCHAR (100),
    precio INT,
    id_fabricante INT,
    KEY (id_fabricante),
    FOREIGN KEY (id_fabricante) REFERENCES fabricantes (id_fabricante) ON DELETE SET NULL ON UPDATE CASCADE);
