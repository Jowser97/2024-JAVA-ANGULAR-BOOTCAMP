--altero la tabla para que departamento no tenga autoincrement, para que tenga algo de sentido los ejercicios que me pide.
ALTER TABLE departamentos CHANGE codigo codigo INT(11) NOT NULL;


INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (14, 'compras', 500000),(37, 'logistica', 200000),(77, 'it', 400000),(22, 'telares', 20000),(65, 'acabados', 30000),(43, 'laboratorio', 35000),(23, 'catalogos', 10000),(31, 'revision', 15000),(15, 'ventas', 5000),(24, 'marqueting', 50000);

INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES ('11111111', 'Fran', 'Lopez', 65),('22222222', 'Charo', 'Manzano', 14),('33333333', 'Nuria', 'Perez', 77),('44444444', 'Nuria', 'Lopez', 22),('55555555', 'Maria', 'Caparra', 24),('66666666', 'Jose', 'Ruiz', 43),('77777777', 'Pepa','March',65),('88888888', 'Francisco', 'Perez', 65),('99999999', 'Sabrina', 'Slay', 43),('10101010', 'Eva', 'Slay', 37);

--2.1.
SELECT apellidos FROM empleados;

--2.2.
SELECT DISTINCT apellidos FROM empleados;

--2.3.
SELECT * FROM empleados WHERE apellidos='Lopez';

--2.4.
SELECT * FROM empleados WHERE apellidos='Lopez' AND apellidos='Perez' ORDER BY apellidos;

--2.5.
SELECT * FROM empleados WHERE departamento=14;

--2.6.
SELECT * FROM empleados WHERE departamento=37 OR departamento=77;

--2.7.
SELECT * FROM empleados WHERE apellidos LIKE 'P%';

--2.8.
SELECT SUM(presupuesto) FROM departamentos;

--2.9.
SELECT departamento, COUNT(*) AS numero_empleados FROM empleados GROUP BY departamento;

--2.10.
SELECT empleados.*, departamentos.nombre FROM empleados JOIN departamentos ON empleados.departamento = departamentos.codigo;

--2.11.
SELECT empleados.dni, empleados.nombre, empleados.apellidos, departamentos.nombre, departamentos.presupuesto FROM empleados 
JOIN departamentos 
ON empleados.departamento = departamentos.codigo;

--2.12.
SELECT empleados.nombre, empleados.apellidos
FROM empleados
JOIN departamentos ON empleados.departamento = departamentos.codigo
WHERE departamentos.presupuesto > 60000;

--2.13.
SELECT * FROM departamentos
WHERE presupuesto > (SELECT AVG(presupuesto) FROM departamentos);

--2.14.
SELECT departamentos.nombre
FROM departamentos 
JOIN empleados ON departamentos.codigo = empleados.departamento
GROUP BY departamentos.nombre
HAVING COUNT(*) > 2;

--2.15.
INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (11, 'calidad', 40000);
INSERT INTO empleados (dni, nombre, apellidos, departamento) VALUES (89267109, 'Esther', 'Vazquez', 11);

--2.16.
SELECT departamentos.*, departamentos.presupuesto*0.90 AS nuevo_presupuesto FROM departamentos;

--2.17.
UPDATE empleados SET departamento = 77 WHERE empleados.dni = '99999999';

--2.18.
SELECT * FROM empleados WHERE departamento = 77;
DELETE FROM empleados WHERE departamento = 77;

--2.19.
SELECT empleados.nombre, empleados.apellidos
FROM empleados
JOIN departamentos ON empleados.departamento = departamentos.codigo
WHERE departamentos.presupuesto > 60000;

DELETE FROM empleados
WHERE departamento IN (
    SELECT empleados.departamento
    FROM empleados
    JOIN departamentos ON empleados.departamento = departamentos.codigo
    WHERE departamentos.presupuesto > 60000
);

--2.20.
SELECT * FROM empleados;
DELETE FROM empleados;