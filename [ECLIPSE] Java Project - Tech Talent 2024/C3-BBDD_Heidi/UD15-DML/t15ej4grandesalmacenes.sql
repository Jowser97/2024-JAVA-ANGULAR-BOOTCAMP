USE grandes_almacenes;
INSERT INTO cajeros (nom_apels) VALUES
('Juan Pérez'),('María García'),('Ana Martínez'),('Luis Rodríguez'),('Laura González'),('Carlos Sánchez'),('Elena Martín'),('David López'),('Sara Ruiz'),('Pedro Fernández');

--Altero la tabla para que me deje poner decimales
ALTER TABLE productos CHANGE COLUMN precio precio DOUBLE NOT NULL DEFAULT;

INSERT INTO productos (nombre, precio) VALUES 
('Arroz', 2.50),
('Leche', 1.20),
('Pan', 1.00),
('Huevos', 2.00),
('Manzanas', 3.50),
('Pollo', 5.00),
('Pasta', 1.50),
('Aceite de Oliva', 4.00),
('Patatas', 1.80),
('Agua Mineral', 0.80);

INSERT INTO maq_registradoras (piso) VALUES 
(1),
(2),
(3),
(4),
(5),
(6),
(7),
(8),
(9),
(10);

INSERT INTO venta (id_producto, id_cajero, id_maquina) VALUES  (3, 7, 2), (9, 4, 6), (1, 8, 5), (10, 2, 4), (6, 1, 9), (5, 3, 7), (8, 10, 1), (2, 6, 8), (7, 5, 3), (4, 9, 10);






