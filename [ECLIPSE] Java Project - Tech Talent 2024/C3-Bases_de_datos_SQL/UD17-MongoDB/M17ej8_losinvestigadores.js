use los_investigadores;

db.createCollection("facultad");
db.facultad.insertMany([
    { _id: 1, nombre: "Universidad Nacional Autónoma de México" },
    { _id: 2, nombre: "Universidad de Buenos Aires" },
    { _id: 3, nombre: "Universidad de São Paulo" },
    { _id: 4, nombre: "Universidad de Chile" },
    { _id: 5, nombre: "Universidad de Barcelona" },
    { _id: 6, nombre: "Universidad Nacional de Colombia" },
    { _id: 7, nombre: "Universidad de Santiago de Compostela" },
    { _id: 8, nombre: "Universidad Autónoma de Madrid" },
    { _id: 9, nombre: "Universidad de Costa Rica" },
    { _id: 10, nombre: "Universidad Nacional de Córdoba" }
]);

db.investigadores.insertMany([
    { _id: 39481723, nom_apels: 'María Fernández López', id_facultad: 3 },
    { _id: 57293648, nom_apels: 'Juan Martínez Rodríguez', id_facultad: 7 },
    { _id: 68932475, nom_apels: 'Ana García Pérez', id_facultad: 5 },
    { _id: 82147563, nom_apels: 'Carlos Sánchez Ruiz', id_facultad: 1 },
    { _id: 46821394, nom_apels: 'Laura González Martínez', id_facultad: 8 },
    { _id: 93572841, nom_apels: 'Javier Pérez Gómez', id_facultad: 6 },
    { _id: 57632189, nom_apels: 'Isabel Rodríguez García', id_facultad: 2 },
    { _id: 31259847, nom_apels: 'Daniel López Fernández', id_facultad: 4 },
    { _id: 69475218, nom_apels: 'Marta Martínez López', id_facultad: 9 },
    { _id: 87412365, nom_apels: 'Alejandro García Ruiz', id_facultad: 10 }
]);

db.equipos.insertMany([
    { _id: 1, nombre: 'Los Leones', id_facultad: 7 },
    { _id: 2, nombre: 'Los Tigres', id_facultad: 3 },
    { _id: 3, nombre: 'Los Águilas', id_facultad: 8 },
    { _id: 4, nombre: 'Los Lobos', id_facultad: 5 },
    { _id: 5, nombre: 'Los Panteras', id_facultad: 1 },
    { _id: 6, nombre: 'Los Osos', id_facultad: 10 },
    { _id: 7, nombre: 'Los Halcones', id_facultad: 2 },
    { _id: 8, nombre: 'Los Dragones', id_facultad: 6 },
    { _id: 9, nombre: 'Los Fénix', id_facultad: 4 },
    { _id: 10, nombre: 'Los Canguros', id_facultad: 9 }
]);

db.reserva.insertMany([
    { _id: 1, dni: 39481723, num_serie: 3, comienzo: ISODate("2024-04-20"), fin: ISODate("2024-04-25") },
    { _id: 2, dni: 57293648, num_serie: 7, comienzo: ISODate("2024-04-21"), fin: ISODate("2024-04-26") },
    { _id: 3, dni: 68932475, num_serie: 5, comienzo: ISODate("2024-04-22"), fin: ISODate("2024-04-27") },
    { _id: 4, dni: 82147563, num_serie: 1, comienzo: ISODate("2024-04-23"), fin: ISODate("2024-04-28") },
    { _id: 5, dni: 46821394, num_serie: 8, comienzo: ISODate("2024-04-24"), fin: ISODate("2024-04-29") },
    { _id: 6, dni: 93572841, num_serie: 6, comienzo: ISODate("2024-04-25"), fin: ISODate("2024-04-30") },
    { _id: 7, dni: 57632189, num_serie: 2, comienzo: ISODate("2024-04-26"), fin: ISODate("2024-05-01") },
    { _id: 8, dni: 31259847, num_serie: 4, comienzo: ISODate("2024-04-27"), fin: ISODate("2024-05-02") },
    { _id: 9, dni: 69475218, num_serie: 9, comienzo: ISODate("2024-04-28"), fin: ISODate("2024-05-03") },
    { _id: 10, dni: 87412365, num_serie: 10, comienzo: ISODate("2024-04-29"), fin: ISODate("2024-05-04") }
]);