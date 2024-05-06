use los_cientificos;

db.cientificos.insertMany([
    { _id: 12345678, nom_apels: 'Juan Pérez' },
    { _id: 23456789, nom_apels: 'María García' },
    { _id: 34567890, nom_apels: 'Ana Martínez' },
    { _id: 45678901, nom_apels: 'Luis Rodríguez' },
    { _id: 56789012, nom_apels: 'Laura González' },
    { _id: 67890123, nom_apels: 'Carlos Sánchez' },
    { _id: 78901234, nom_apels: 'Elena Martín' },
    { _id: 89012345, nom_apels: 'David López' },
    { _id: 90123456, nom_apels: 'Sara Ruiz' },
    { _id: 01234567, nom_apels: 'Pedro Fernández' }
]);

db.proyecto.insertMany([
    { _id: 1, nombre: 'Proyecto Alpha', horas: 40 },
    { _id: 2, nombre: 'Proyecto Beta', horas: 30 },
    { _id: 3, nombre: 'Proyecto Gamma', horas: 35 },
    { _id: 4, nombre: 'Proyecto Delta', horas: 45 },
    { _id: 5, nombre: 'Proyecto Epsilon', horas: 50 },
    { _id: 6, nombre: 'Proyecto Zeta', horas: 25 },
    { _id: 7, nombre: 'Proyecto Eta', horas: 55 },
    { _id: 8, nombre: 'Proyecto Theta', horas: 20 },
    { _id: 9, nombre: 'Proyecto Iota', horas: 60 },
    { _id: 10, nombre: 'Proyecto Kappa', horas: 15 }
]);

db.asignacion.insertMany([
    { _id: 1, dni: 12345678, id_proyecto: 1 },
    { _id: 2, dni: 23456789, id_proyecto: 2 },
    { _id: 3, dni: 34567890, id_proyecto: 3 },
    { _id: 4, dni: 45678901, id_proyecto: 4 },
    { _id: 5, dni: 56789012, id_proyecto: 5 },
    { _id: 6, dni: 67890123, id_proyecto: 6 },
    { _id: 7, dni: 78901234, id_proyecto: 7 },
    { _id: 8, dni: 89012345, id_proyecto: 8 },
    { _id: 9, dni: 90123456, id_proyecto: 9 },
    { _id: 10, dni: 01234567, id_proyecto: 10 }
]);