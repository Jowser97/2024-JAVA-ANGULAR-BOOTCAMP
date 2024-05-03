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
SELECT a.codigo
FROM almacenes a
LEFT JOIN cajas c ON a.codigo = c.almacen
GROUP BY a.codigo
HAVING AVG(c.valor) > 150;

--3.7. Obtener el número de referencia de cada caja junto con el nombre de la ciudad en la que se encuentra.
SELECT c.num_referencia, a.lugar AS nombre_ciudad
FROM cajas c
INNER JOIN almacenes a ON c.almacen = a.codigo;

--3.8. Obtener el numero de cajas que hay en cada almacén.
SELECT a.codigo AS codigo_almacen, COUNT(c.num_referencia) AS numero_de_cajas
FROM almacenes a
LEFT JOIN cajas c ON a.codigo = c.almacen
GROUP BY a.codigo;

--3.9. Obtener los códigos de los almacenes que están saturados (los almacenes donde el numero de cajas es superior a la capacidad).
SELECT a.codigo
FROM almacenes a
LEFT JOIN (
    SELECT almacen, COUNT(*) AS numero_de_cajas
    FROM cajas
    GROUP BY almacen
) c ON a.codigo = c.almacen
WHERE c.numero_de_cajas > a.capacidad;

--3.10.
SELECT c.num_referencia
FROM cajas c
INNER JOIN almacenes a ON c.almacen = a.codigo
WHERE a.lugar = 'Bilbao';

--3.11. Insertar un nuevo almacén en Barcelona con capacidad para 3
cajas.
INSERT INTO almacenes (lugar, capacidad) VALUES ('Barcelona', 4);

--3.12. Insertar una nueva caja, con número de referencia 'H5RT', con contenido 'Papel', valor 200, y situada en el almacén 2.
INSERT INTO cajas (num_referencia, contenido, valor, almacen) VALUES (H5RT, 'papel', 200, 2);

--3.13. Rebajar el valor de todas las cajas un 15 %.
SELECT cajas.*, valor*0.85 AS valor_rebajado FROM cajas;

--3.14. Rebajar un 20 % el valor de todas las cajas cuyo valor sea superior al valor medio de todas las cajas.
SELECT cajas.*, valor*0.80 AS valor_rebajado FROM cajas WHERE valor > (SELECT AVG(valor) FROM cajas);

--3.15. Eliminar todas las cajas cuyo valor sea inferior a 100 €.
SELECT num_referencia FROM cajas WHERE valor < 100;
DELETE FROM cajas WHERE valor < 100;


--3.16. Vaciar el contenido de los almacenes que están saturados.
SELECT a.codigo
FROM almacenes a
LEFT JOIN (
    SELECT almacen, COUNT(*) AS numero_de_cajas
    FROM cajas
    GROUP BY almacen
) c ON a.codigo = c.almacen
WHERE c.numero_de_cajas > a.capacidad;

DELETE FROM cajas
WHERE almacen IN (
    SELECT a.codigo
    FROM almacenes a
    LEFT JOIN (
        SELECT almacen, COUNT(*) AS numero_de_cajas
        FROM cajas
        GROUP BY almacen
    ) c ON a.codigo = c.almacen
    WHERE c.numero_de_cajas > a.capacidad
);