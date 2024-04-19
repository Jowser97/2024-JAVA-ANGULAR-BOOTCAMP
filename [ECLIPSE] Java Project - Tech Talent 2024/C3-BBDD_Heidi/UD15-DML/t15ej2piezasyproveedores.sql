USE piezas_y_proveedores;
INSERT INTO piezas (nombre) VALUES ('procesador'), ('tarjeta gráfica'), ('placa base'), ('memoria RAM'), ('disco duro'), ('fuente de alimentación'), ('ventilador de CPU'), ('SSD'), ('caja de la computadora'), ('teclado');

USE piezas_y_proveedores;
INSERT INTO proveedores (nombre) VALUES 
('PCComponentes'),('Coolmod'),('Amazon'), ('Proveedor D'),('Proveedor E'),('Proveedor F'), ('Proveedor G'),('Proveedor H'),('Proveedor I'), ('Proveedor J');

ALTER TABLE suministra
	CHANGE COLUMN precio precio DOUBLE NOT NULL DEFAULT; --modifico tabla para que pueda poner doubles

USE piezas_y_proveedores;
INSERT INTO suministra (id_pieza, id_proveedor, precio) VALUES (1, 1, 899.99), (2, 1,  1499.99), (3, 1, 200), (4, 1, 249.99), (5, 1, 100.75), (6, 2, 89.99), (7, 2, 19.99), (8, 2, 149.99), (9, 3, 60), (10, 3, 47.34);

