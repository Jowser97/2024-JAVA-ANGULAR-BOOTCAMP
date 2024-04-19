USE los_investigadores;

INSERT INTO facultad (nombre) VALUES
('Universidad Nacional Autónoma de México'),
('Universidad de Buenos Aires'),
('Universidad de São Paulo'),
('Universidad de Chile'),
('Universidad de Barcelona'),
('Universidad Nacional de Colombia'),
('Universidad de Santiago de Compostela'),
('Universidad Autónoma de Madrid'),
('Universidad de Costa Rica'),
('Universidad Nacional de Córdoba');

INSERT INTO investigadores (dni, nom_apels, id_facultad) VALUES
(39481723, 'María Fernández López', 3),
(57293648, 'Juan Martínez Rodríguez', 7),
(68932475, 'Ana García Pérez', 5),
(82147563, 'Carlos Sánchez Ruiz', 1),
(46821394, 'Laura González Martínez', 8),
(93572841, 'Javier Pérez Gómez', 6),
(57632189, 'Isabel Rodríguez García', 2),
(31259847, 'Daniel López Fernández', 4),
(69475218, 'Marta Martínez López', 9),
(87412365, 'Alejandro García Ruiz', 10);

INSERT INTO equipos (num_serie, nombre, id_facultad) VALUES
(1, 'Los Leones', 7),
(2, 'Los Tigres', 3),
(3, 'Los Águilas', 8),
(4, 'Los Lobos', 5),
(5, 'Los Panteras', 1),
(6, 'Los Osos', 10),
(7, 'Los Halcones', 2),
(8, 'Los Dragones', 6),
(9, 'Los Fénix', 4),
(10, 'Los Canguros', 9);

INSERT INTO reserva (dni, num_serie, comienzo, fin) VALUES
(39481723, 3, '2024-04-20', '2024-04-25'),
(57293648, 7, '2024-04-21', '2024-04-26'),
(68932475, 5, '2024-04-22', '2024-04-27'),
(82147563, 1, '2024-04-23', '2024-04-28'),
(46821394, 8, '2024-04-24', '2024-04-29'),
(93572841, 6, '2024-04-25', '2024-04-30'),
(57632189, 2, '2024-04-26', '2024-05-01'),
(31259847, 4, '2024-04-27', '2024-05-02'),
(69475218, 9, '2024-04-28', '2024-05-03'),
(87412365, 10, '2024-04-29', '2024-05-04');