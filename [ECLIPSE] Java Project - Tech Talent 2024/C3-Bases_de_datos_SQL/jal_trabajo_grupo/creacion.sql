CREATE DATABASE comercio_jalal;
USE comercio_jalal; 

CREATE TABLE proveedores(
    id_proveedor INT AUTO_INCREMENT, 
    PRIMARY KEY (id_proveedor), 
    nombre VARCHAR(200) NOT NULL
);

CREATE TABLE productos(
    id_producto INT, 
    PRIMARY KEY (id_producto), 
    nombre VARCHAR(80), 
    precio FLOAT(5,2), 
    IVA FLOAT(5,2) CHECK (IVA=0.04 OR IVA=0.21),
    id_proveedor INT, 
    FOREIGN KEY (id_proveedor) 
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE inventario(
    id_proveedor INT, 
    FOREIGN KEY (id_proveedor)
    REFERENCES proveedores (id_proveedor)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    cantidad INT NOT NULL, 
    id_producto INT, 
    FOREIGN KEY (id_producto)
    REFERENCES productos (id_producto)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

CREATE TABLE caja(
    num_caja INT AUTO_INCREMENT, 
    PRIMARY KEY (num_caja),
    id_producto INT, 
    FOREIGN KEY (id_producto)
    REFERENCES productos (id_producto)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    cantidad INT NOT NULL, 
    precio_producto FLOAT, 
    IVA FLOAT(5,2) CHECK (IVA=0.04 OR IVA=0.21)
    );

CREATE TABLE ticket(
    id_ticket INT AUTO_INCREMENT, 
    PRIMARY KEY (id_ticket), 
    num_caja INT, 
    FOREIGN KEY (num_caja)
    REFERENCES caja (num_caja)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
    precio_total FLOAT
    
);

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT, 
    PRIMARY KEY (id_cliente),
    nombre VARCHAR(80), 
    apellidos VARCHAR (80),
    e_mail VARCHAR(150) UNIQUE NOT NULL, 
    id_ticket INT, 
    FOREIGN KEY (id_ticket)
    REFERENCES ticket (id_ticket)
    ON DELETE CASCADE
    ON UPDATE CASCADE
); 
