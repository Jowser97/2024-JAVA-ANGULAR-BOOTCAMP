USE directores;

ALTER TABLE despachos CHANGE numero numero INT(11) NOT NULL AUTO_INCREMENT;

INSERT INTO despachos (capacidad) VALUES
(10),(10),(10),(15),(15),(15),(20),(20),(20),(25); 

INSERT INTO directores (dni, nom_apels, despacho) VALUES 
(39481723, 'María Fernández López', 4),
(57293648, 'Juan Martínez Rodríguez', 7),
(68932475, 'Ana García Pérez', 2),
(82147563, 'Carlos Sánchez Ruiz', 6),
(46821394, 'Laura González Martínez', 3);

INSERT INTO directores (dni, nom_apels, despacho, dni_jefe) VALUES
(93572841, 'Javier Pérez Gómez', 4, 39481723),
(57632189, 'Isabel Rodríguez García', 4, 39481723),
(31259847, 'Daniel López Fernández', 4, 39481723),
(69475218, 'Marta Martínez López', 2, 68932475),
(87412365, 'Alejandro García Ruiz', 2, 68932475);