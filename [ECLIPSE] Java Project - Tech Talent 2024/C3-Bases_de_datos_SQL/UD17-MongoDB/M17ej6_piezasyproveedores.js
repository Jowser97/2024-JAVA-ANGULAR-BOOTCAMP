use piezas_y_proveedores;

db.createCollection("piezas");
db.piezas.insertMany([
    { _id: 1, nombre: "procesador" },
    { _id: 2, nombre: "tarjeta gráfica" },
    { _id: 3, nombre: "placa base" },
    { _id: 4, nombre: "memoria RAM" },
    { _id: 5, nombre: "disco duro" },
    { _id: 6, nombre: "fuente de alimentación" },
    { _id: 7, nombre: "ventilador de CPU" },
    { _id: 8, nombre: "SSD" },
    { _id: 9, nombre: "caja de la computadora" },
    { _id: 10, nombre: "teclado" }
]);

db.createCollection("proveedores");
db.proveedores.insertMany([
    { _id: 1, nombre: "PCComponentes" },
    { _id: 2, nombre: "Coolmod" },
    { _id: 3, nombre: "Amazon" },
    { _id: 4, nombre: "Proveedor D" },
    { _id: 5, nombre: "Proveedor E" },
    { _id: 6, nombre: "Proveedor F" },
    { _id: 7, nombre: "Proveedor G" },
    { _id: 8, nombre: "Proveedor H" },
    { _id: 9, nombre: "Proveedor I" },
    { _id: 10, nombre: "Proveedor J" }
]);

db.createCollection("suministra");
db.suministra.insertMany([
    { _id: 1, id_pieza: 1, id_proveedor: 1, precio: 899.99 },
    { _id: 2, id_pieza: 2, id_proveedor: 1, precio: 1499.99 },
    { _id: 3, id_pieza: 3, id_proveedor: 1, precio: 200 },
    { _id: 4, id_pieza: 4, id_proveedor: 1, precio: 249.99 },
    { _id: 5, id_pieza: 5, id_proveedor: 1, precio: 100.75 },
    { _id: 6, id_pieza: 6, id_proveedor: 2, precio: 89.99 },
    { _id: 7, id_pieza: 7, id_proveedor: 2, precio: 19.99 },
    { _id: 8, id_pieza: 8, id_proveedor: 2, precio: 149.99 },
    { _id: 9, id_pieza: 9, id_proveedor: 3, precio: 60 },
    { _id: 10, id_pieza: 10, id_proveedor: 3, precio: 47.34 }
]);