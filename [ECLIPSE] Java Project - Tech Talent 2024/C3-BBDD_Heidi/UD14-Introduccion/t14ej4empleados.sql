CREATE DATABASE empleados;

CREATE TABLE departamentos (
    codigo INT AUTO_INCREMENT PRIMARY KEY;
    nombre VARCHAR (100),
    presupuesto INT
);

CREATE TABLE empleados (
    dni VARCHAR (8) KEY,
    nombre VARCHAR (100),
    apellidos VARCHAR (255),
    departamento INT,
    KEY (departamento),
    FOREIGN KEY (departamento) REFERENCES departamentos (codigo) ON DELETE SET NULL ON UPDATE CASCADE 
);