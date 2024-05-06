use directivos;

db.createCollection("despachos");
db.despachos.insertMany([
    { _id: 1, capacidad: 10 },
    { _id: 2, capacidad: 10 },
    { _id: 3, capacidad: 10 },
    { _id: 4, capacidad: 15 },
    { _id: 5, capacidad: 15 },
    { _id: 6, capacidad: 15 },
    { _id: 7, capacidad: 20 },
    { _id: 8, capacidad: 20 },
    { _id: 9, capacidad: 20 },
    { _id: 10, capacidad: 25 }
]);

db.createCollection("directores");
db.directores.insertMany([
    { _id: 39481723, nom_apels: "María Fernández López", despacho: 4 },
    { _id: 57293648, nom_apels: "Juan Martínez Rodríguez", despacho: 7 },
    { _id: 68932475, nom_apels: "Ana García Pérez", despacho: 2 },
    { _id: 82147563, nom_apels: "Carlos Sánchez Ruiz", despacho: 6 },
    { _id: 46821394, nom_apels: "Laura González Martínez", despacho: 3 },
    { _id: 93572841, nom_apels: "Javier Pérez Gómez", despacho: 4, dni_jefe: 39481723 },
    { _id: 57632189, nom_apels: "Isabel Rodríguez García", despacho: 4, dni_jefe: 39481723 },
    { _id: 31259847, nom_apels: "Daniel López Fernández", despacho: 4, dni_jefe: 39481723 },
    { _id: 69475218, nom_apels: "Marta Martínez López", despacho: 2, dni_jefe: 68932475 },
    { _id: 87412365, nom_apels: "Alejandro García Ruiz", despacho: 2, dni_jefe: 68932475 }
]);