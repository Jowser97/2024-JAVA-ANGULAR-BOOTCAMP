--altero la tabla para que departamento no tenga autoincrement, para que tenga algo de sentido los ejercicios que me pide.
ALTER TABLE departamentos CHANGE codigo codigo INT(11) NOT NULL;


INSERT INTO departamentos (codigo, nombre, presupuesto) VALUES (14, 'compras', 500000),(37, 'logistica', 200000),(77, 'it', 400000),(22, 'telares', 20000),(65, 'acabados', 30000),(43, 'laboratorio', 35000),(23, 'catalogos', 10000),(31, 'revision', 15000),(15, 'ventas', 5000),(24, 'marqueting', 50000);

INSERT INTO departamentos (dni, nombre, apellidos, departamento) VALUES (11111111, 'Fran', 'Lopez', 65),(22222222, 'Charo', 'Manzano', 14),(33333333, 'Nuria', 'Perez', 77),(44444444, 'Nuria', 'Lopez', 22),(55555555, 'Maria', 'Caparra', 24),(66666666, 'Jose', 'Ruiz', 43),(77777777, 'Pepa','March',65)