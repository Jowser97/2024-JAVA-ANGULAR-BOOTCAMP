CREATE DATABASE escuela_idiomas;

USE escuela_idiomas;

CREATE TABLE profesores (
    nombre_completo VARCHAR (255) NOT NULL UNIQUE,
    dni VARCHAR (9),
    PRIMARY KEY (dni),
    direccion VARCHAR (255),
    gana INT NOT NULL
);

USE escuela_idiomas;
CREATE TABLE cursos (
    nombre_curso VARCHAR (255) NOT NULL UNIQUE,
    cod_curso INT PRIMARY KEY AUTO_INCREMENT,
    dni_profesor VARCHAR (9) NOT NULL,
    KEY (dni_profesor),
    FOREIGN KEY (dni_profesor) REFERENCES profesores (dni) ON DELETE CASCADE ON UPDATE CASCADE,
    max_alumnos_recom INT,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL CHECK (fecha_inicio<fecha_fin),
    num_horas INT NOT NULL
);

USE escuela_idiomas;
CREATE TABLE alumnos (
    nombre_completo VARCHAR (255) NOT NULL UNIQUE,
    dni VARCHAR (9),
    PRIMARY KEY (dni),
    direccion VARCHAR (255),
    sexo CHAR(1),
    --para darle nombre CONSTRAINT sexo_check
    CHECK (sexo='H' OR sexo='M'),
    fecha_nacimiento DATE,
    curso INT,
    KEY (curso),
    FOREIGN KEY (curso) REFERENCES cursos (cod_curso) ON DELETE CASCADE ON UPDATE CASCADE
);