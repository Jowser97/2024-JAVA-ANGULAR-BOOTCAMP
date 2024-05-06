use grandes_almacenes;

db.createCollection("cajeros");
db.cajeros.insertMany([
    { _id: 1, nom_apels: "Juan Pérez" },
    { _id: 2, nom_apels: "María García" },
    { _id: 3, nom_apels: "Ana Martínez" },
    { _id: 4, nom_apels: "Luis Rodríguez" },
    { _id: 5, nom_apels: "Laura González" },
    { _id: 6, nom_apels: "Carlos Sánchez" },
    { _id: 7, nom_apels: "Elena Martín" },
    { _id: 8, nom_apels: "David López" },
    { _id: 9, nom_apels: "Sara Ruiz" },
    { _id: 10, nom_apels: "Pedro Fernández" }
]);

db.createCollection("productos");
db.productos.insertMany([
    { _id: 1, nombre: "Arroz", precio: 2.50 },
    { _id: 2, nombre: "Leche", precio: 1.20 },
    { _id: 3, nombre: "Pan", precio: 1.00 },
    { _id: 4, nombre: "Huevos", precio: 2.00 },
    { _id: 5, nombre: "Manzanas", precio: 3.50 },
    { _id: 6, nombre: "Pollo", precio: 5.00 },
    { _id: 7, nombre: "Pasta", precio: 1.50 },
    { _id: 8, nombre: "Aceite de Oliva", precio: 4.00 },
    { _id: 9, nombre: "Patatas", precio: 1.80 },
    { _id: 10, nombre: "Agua Mineral", precio: 0.80 }
]);

db.createCollection("maq_registradoras");
db.maq_registradoras.insertMany([
    { _id: 1, piso: 1 },
    { _id: 2, piso: 2 },
    { _id: 3, piso: 3 },
    { _id: 4, piso: 4 },
    { _id: 5, piso: 5 },
    { _id: 6, piso: 6 },
    { _id: 7, piso: 7 },
    { _id: 8, piso: 8 },
    { _id: 9, piso: 9 },
    { _id: 10, piso: 10 }
]);

db.createCollection("venta");
db.venta.insertMany([
    { _id: 1, id_producto: 3, id_cajero: 7, id_maquina: 2 },
    { _id: 2, id_producto: 9, id_cajero: 4, id_maquina: 6 },
    { _id: 3, id_producto: 1, id_cajero: 8, id_maquina: 5 },
    { _id: 4, id_producto: 10, id_cajero: 2, id_maquina: 4 },
    { _id: 5, id_producto: 6, id_cajero: 1, id_maquina: 9 },
    { _id: 6, id_producto: 5, id_cajero: 3, id_maquina: 7 },
    { _id: 7, id_producto: 8, id_cajero: 10, id_maquina: 1 },
    { _id: 8, id_producto: 2, id_cajero: 6, id_maquina: 8 },
    { _id: 9, id_producto: 7, id_cajero: 5, id_maquina: 3 },
    { _id: 10, id_producto: 4, id_cajero: 9, id_maquina: 10 }
]);