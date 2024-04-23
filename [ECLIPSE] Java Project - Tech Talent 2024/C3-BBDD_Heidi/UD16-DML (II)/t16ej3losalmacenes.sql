INSERT INTO almacenes (lugar, capacidad) VALUES ('lugar 1', 10),('lugar 2', 10),('lugar 3', 10),('lugar 4', 15),('lugar 5', 15),('lugar 6', 15),('lugar 7', 20),('lugar 8', 20),('lugar 9', 20),('lugar 10', 20);

INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES
('REF01', 'Electrónicos', 500, 1),
('REF02', 'Ropa', 200, 2),
('REF03', 'Libros', 300, 3),
('REF04', 'Herramientas', 400, 1),
('REF05', 'Alimentos', 150, 4),
('REF06', 'Juguetes', 250, 2),
('REF07', 'Artículos de cocina', 600, 5),
('REF08', 'Equipamiento deportivo', 350, 3),
('REF09', 'Muebles', 700, 4),
('REF10', 'Artículos de papelería', 180, 5);

--3.1.
SELECT * FROM almacenes;

--3.2.
SELECT * FROM cajas WHERE valor>150;

--3.3.
SELECT contenido FROM cajas;

--3.4.
SELECT AVG(valor) FROM cajas;

--3.5.
--chatGPT
SELECT a.codigo AS codigo_almacen, a.lugar, AVG(c.valor) AS valor_medio_cajas
FROM almacenes a
LEFT JOIN cajas c ON a.codigo = c.almacen
GROUP BY a.codigo, a.lugar;

--3.6. (Obtener los códigos de los almacenes en los cuales el valor medio de las cajas sea superior a 150 €.)


