INSERT INTO peliculas (nombre, cal_edad) VALUES 
('El Padrino', 18),
('Titanic', 12),
('El Señor de los Anillos: La Comunidad del Anillo', 12),
('Toy Story', 3),
('El Rey León', 3),
('Interestelar', 12),
('La La Land', 7),
('Harry Potter y la piedra filosofal', 7),
('Avengers: Endgame', 12),
('Pulp Fiction', 18);

INSERT INTO salas (nombre, pelicula) VALUES 
('Sala 1', 1),
('Sala 2', 2),
('Sala 3', 3),
('Sala 4', 4),
('Sala 5', 5),
('Sala 6', 6),
('Sala 7', 7),
('Sala 8', 8),
('Sala 9', 9),
('Sala 10', 10);

--4.1. Mostrar el nombre de todas las películas.
SELECT nombre FROM peliculas;

--4.2. Mostrar las distintas calificaciones de edad que existen.
SELECT DISTINCT cal_edad FROM peliculas;

--4.3. Mostrar todas las películas que no han sido calificadas.
SELECT * FROM peliculas WHERE cal_edad IS NULL;

--4.4. Mostrar todas las salas que no proyectan ninguna película.
SELECT * FROM salas WHERE pelicula IS NULL;

--4.5. Mostrar la información de todas las salas y, si se proyecta alguna película en la sala,  mostrar también la información de la película.
SELECT s.codigo AS codigo_sala, s.nombre AS nombre_sala, 
       p.codigo AS codigo_pelicula, p.nombre AS nombre_pelicula, p.cal_edad
FROM salas s
LEFT JOIN peliculas p ON s.pelicula = p.codigo;

--4.6. Mostrar la información de todas las películas y, si se proyecta en alguna sala, mostrar también la información de la sala.
SELECT p.codigo AS codigo_pelicula, p.nombre AS nombre_pelicula, p.cal_edad,
       s.codigo AS codigo_sala, s.nombre AS nombre_sala
FROM peliculas p
LEFT JOIN salas s ON p.codigo = s.pelicula;

--4.7. Mostrar los nombres de las películas que no se proyectan en ninguna sala.
SELECT p.nombre
FROM peliculas p
LEFT JOIN salas s ON p.codigo = s.pelicula
WHERE s.codigo IS NULL;

--4.8. Añadir una nueva película 'Uno, Dos, Tres', para mayores de 7 años.
INSERT INTO peliculas (nombre, cal_edad) VALUES ('Uno, Dos, Tres', 7);

--4.9. Hacer constar que todas las películas no calificadas han sido calificadas 'no reco- mendables para menores de 13 años'.
UPDATE peliculas
SET cal_edad = 13
WHERE cal_edad IS NULL;

SELECT nombre, cal_edad FROM peliculas WHERE cal_edad < 13;

--4.10. Eliminar todas las salas que proyectan películas recomendadas para todos los públicos.
DELETE FROM salas
WHERE pelicula IN (SELECT codigo FROM peliculas WHERE cal_edad <= 3);

SELECT nombre, cal_edad FROM peliculas WHERE cal_edad <= 3;