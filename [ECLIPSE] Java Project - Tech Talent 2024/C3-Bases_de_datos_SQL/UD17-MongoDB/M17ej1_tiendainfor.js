use tiendainformatica;

// Crear la colección "fabricantes" e insertar documentos con IDs explícitos
db.createCollection("fabricantes");
db.fabricantes.insertMany([
    { _id: 1, fabricante: "MSI" },
    { _id: 2, fabricante: "Corsair" },
    { _id: 3, fabricante: "Gigabyte" },
    { _id: 4, fabricante: "Kingston" },
    { _id: 5, fabricante: "AMD" },
    { _id: 6, fabricante: "Intel" },
    { _id: 7, fabricante: "MarsGaming" },
    { _id: 8, fabricante: "Asus" },
    { _id: 9, fabricante: "Fabricante9" },
    { _id: 10, fabricante: "Fabricante10" }
]);

db.createCollection("articulos");
db.articulos.insertMany([
    { _id: 1, articulo: "grafica 4060", precio: 899.99, id_fabricante: 1 },
    { _id: 2, articulo: "ram 32", precio: 119, id_fabricante: 2 },
    { _id: 3, articulo: "ram 16", precio: 50, id_fabricante: 2 },
    { _id: 4, articulo: "placa base", precio: 149, id_fabricante: 3 },
    { _id: 5, articulo: "fuente alimentacion", precio: 80, id_fabricante: 3 },
    { _id: 6, articulo: "procesador i7", precio: 600, id_fabricante: 6 },
    { _id: 7, articulo: "procesador i5", precio: 300, id_fabricante: 6 },
    { _id: 8, articulo: "procesador ryzen 7", precio: 409, id_fabricante: 5 },
    { _id: 9, articulo: "producto9", precio: 400, id_fabricante: 9 },
    { _id: 10, articulo: "producto10", precio: 800, id_fabricante: 10 }
]);

