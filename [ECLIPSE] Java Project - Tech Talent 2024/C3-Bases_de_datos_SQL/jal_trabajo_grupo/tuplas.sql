
--INSERTS
-- Datos para la tabla proveedores
INSERT INTO proveedores (nombre) VALUES
('Samsung Electronics'),
('Apple Inc.'),
('Sony Corporation'),
('LG Electronics'),
('Microsoft Corporation');

-- Datos para la tabla productos
INSERT INTO productos (id_producto, nombre, precio, IVA, id_proveedor) VALUES
('001', 'Samsung Galaxy S21', 999.99, 0.21, 1),
('002', 'iPhone 13', 1099.00, 0.21, 2),
('003', 'PlayStation 5', 499.99, 0.21, 3),
('004', 'LG OLED TV', 1599.00, 0.21, 4),
('005', 'Microsoft Surface Laptop 4', 1299.99, 0.21, 5);

-- Datos para la tabla inventario
INSERT INTO inventario (id_proveedor, cantidad, id_producto) VALUES
(1, 50, '001'),
(2, 40, '002'),
(3, 30, '003'),
(4, 20, '004'),
(5, 35, '005');

-- Datos para la tabla caja
INSERT INTO caja (id_producto, cantidad, precio_producto, IVA) VALUES
('001', 5, 999.99, 0.21),
('002', 7, 1099.00, 0.21),
('003', 3, 499.99, 0.21),
('004', 2, 1599.00, 0.21),
('005', 4, 1299.99, 0.21);

-- Datos para la tabla ticket
INSERT INTO ticket (num_caja, precio_total) VALUES
(1, 5049.94),
(2, 7693.93),
(3, 1549.97),
(4, 3298.00),
(5, 5199.96);

-- Datos para la tabla clientes
INSERT INTO clientes (nombre, apellidos, e_mail, id_ticket) VALUES
('Roberto', 'Fernández', 'roberto.fernandez@example.com', 1),
('Laura', 'Gómez', 'laura.gomez@example.com', 2),
('Miguel', 'Ramírez', 'miguel.ramirez@example.com', 3),
('Isabel', 'Pérez', 'isabel.perez@example.com', 4),
('Carlos', 'Torres', 'carlos.torres@example.com', 5);