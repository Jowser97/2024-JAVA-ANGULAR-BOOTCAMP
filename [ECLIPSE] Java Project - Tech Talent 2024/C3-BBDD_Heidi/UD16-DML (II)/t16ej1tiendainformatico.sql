USE tiendainformatica; 

 INSERT INTO fabricantes (nombre_fabricante) VALUES
 ('MSI'),
 ('Corsair'),
 ('Gigabyte'),
 ('Kingston'),
 ('AMD'),
 ('Intel'),
 ('MarsGaming'),
 ('Asus'),
 ('Fabricante9'),
 ('Fabricante10');

 INSERT INTO articulos (nombre_articulo, precio, id_fabricante) VALUES
 ('grafica 4060', 899.99, 1),
 ('ram 32', 119, 2), 
 ('ram 16', 50, 2),
 ('placa base', 149, 3),
 ('fuente alimentacion', 80, 3),
 ('procesador i7', 600, 6),
 ('procesador i5', 300, 6),
 ('procesador ryzen 7', 409, 5),
 ('producto9', 400, 9),
 ('producto10', 800, 10);

--1.1.
SELECT nombre_articulo FROM articulos;

--1.2.
SELECT nombre_articulo, precio FROM articulos;

--1.3.
SELECT nombre_articulo FROM articulos WHERE precio <= 200;

--1.4.
SELECT nombre_articulo FROM articulos WHERE precio BETWEEN 60 AND 120;

--1.5.
SELECT nombre_articulo, precio*166.386 AS precio_pesetas FROM articulos;

--1.6.
SELECT AVG(precio) FROM articulos;

--1.7.
SELECT AVG(precio) FROM articulos WHERE id_fabricante=2;

--1.8.
SELECT COUNT(nombre_articulo) FROM articulos WHERE precio>=180;

--1.9.
SELECT nombre_articulo, precio FROM articulos WHERE precio>=180 ORDER BY precio DESC; 
SELECT nombre_articulo, precio FROM articulos WHERE precio>=180 ORDER BY nombre_articulo; 

--1.10.
SELECT articulos.*, fabricantes.*
FROM articulos JOIN fabricantes ON articulos.id_fabricante = fabricantes.id_fabricante;


--1.11.
SELECT articulos.nombre_articulo, articulos.precio, fabricantes.nombre_fabricante
FROM articulos
JOIN fabricantes ON articulos.id_fabricante = fabricantes.id_fabricante;

--1.12.
SELECT articulos.id_fabricante, AVG(articulos.precio) AS precio_medio
FROM articulos
GROUP BY articulos.id_fabricante;

--1.13.
SELECT fabricantes.nombre_fabricante, AVG(articulos.precio) AS precio_medio 
FROM fabricantes 
LEFT JOIN articulos ON fabricantes.id_fabricante = articulos.id_fabricante
GROUP BY fabricantes.nombre_fabricante;

--1.14.
SELECT fabricantes.nombre_fabricante, AVG(articulos.precio) 
FROM fabricantes 
LEFT JOIN articulos ON fabricantes.id_fabricante = articulos.id_fabricante
GROUP BY fabricantes.nombre_fabricante
HAVING AVG(articulos.precio) >= 150;

--1.15.
SELECT nombre_articulo, precio FROM articulos
WHERE precio = (SELECT MIN(precio) FROM articulos);

--1.16.
