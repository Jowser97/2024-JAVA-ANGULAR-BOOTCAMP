USE los_cientificos;

INSERT INTO cientificos (dni, nom_apels) VALUES 
(12345678, 'Juan Pérez'),
(23456789, 'María García'),
(34567890, 'Ana Martínez'),
(45678901, 'Luis Rodríguez'),
(56789012, 'Laura González'),
(67890123, 'Carlos Sánchez'),
(78901234, 'Elena Martín'),
(89012345, 'David López'),
(90123456, 'Sara Ruiz'),
(01234567, 'Pedro Fernández');

USE los_cientificos;
INSERT INTO proyecto (id_proyecto, nombre, horas) VALUES 
(1, 'Proyecto Alpha', 40),
(2, 'Proyecto Beta', 30),
(3, 'Proyecto Gamma', 35),
(4, 'Proyecto Delta', 45),
(5, 'Proyecto Epsilon', 50),
(6, 'Proyecto Zeta', 25),
(7, 'Proyecto Eta', 55),
(8, 'Proyecto Theta', 20),
(9, 'Proyecto Iota', 60),
(10, 'Proyecto Kappa', 15);

USE los_cientificos;
INSERT INTO asignado_a (cientifico, id_proyecto) VALUES 
(12345678, 1),
(23456789, 2),
(34567890, 3),
(45678901, 4),
(56789012, 5),
(67890123, 6),
(78901234, 7),
(89012345, 8),
(90123456, 9),
(01234567, 10);