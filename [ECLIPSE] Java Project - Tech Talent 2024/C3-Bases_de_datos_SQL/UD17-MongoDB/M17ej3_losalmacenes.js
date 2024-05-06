use losalmacenes;

db.createCollection("almacenes");
db.almacenes.insertMany([
    { lugar: "lugar 1", capacidad: 10 },
    { lugar: "lugar 2", capacidad: 10 },
    { lugar: "lugar 3", capacidad: 10 },
    { lugar: "lugar 4", capacidad: 15 },
    { lugar: "lugar 5", capacidad: 15 },
    { lugar: "lugar 6", capacidad: 15 },
    { lugar: "lugar 7", capacidad: 20 },
    { lugar: "lugar 8", capacidad: 20 },
    { lugar: "lugar 9", capacidad: 20 },
    { lugar: "lugar 10", capacidad: 20 }
]);

db.createCollection("cajas");
db.cajas.insertMany([
    { num_referencia: "REF01", contenido: "Electrónicos", valor: 500, almacen: 1 },
    { num_referencia: "REF02", contenido: "Ropa", valor: 200, almacen: 2 },
    { num_referencia: "REF03", contenido: "Libros", valor: 300, almacen: 3 },
    { num_referencia: "REF04", contenido: "Herramientas", valor: 400, almacen: 1 },
    { num_referencia: "REF05", contenido: "Alimentos", valor: 150, almacen: 4 },
    { num_referencia: "REF06", contenido: "Juguetes", valor: 250, almacen: 2 },
    { num_referencia: "REF07", contenido: "Artículos de cocina", valor: 600, almacen: 5 },
    { num_referencia: "REF08", contenido: "Equipamiento deportivo", valor: 350, almacen: 3 },
    { num_referencia: "REF09", contenido: "Muebles", valor: 700, almacen: 4 },
    { num_referencia: "REF10", contenido: "Artículos de papelería", valor: 180, almacen: 5 }
]);