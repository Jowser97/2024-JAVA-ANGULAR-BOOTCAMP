use empleados;

db.createCollection("departamentos");
db.departamentos.insertMany([
    { codigo: 14, nombre: "compras", presupuesto: 500000 },
    { codigo: 37, nombre: "logistica", presupuesto: 200000 },
    { codigo: 77, nombre: "it", presupuesto: 400000 },
    { codigo: 22, nombre: "telares", presupuesto: 20000 },
    { codigo: 65, nombre: "acabados", presupuesto: 30000 },
    { codigo: 43, nombre: "laboratorio", presupuesto: 35000 },
    { codigo: 23, nombre: "catalogos", presupuesto: 10000 },
    { codigo: 31, nombre: "revision", presupuesto: 15000 },
    { codigo: 15, nombre: "ventas", presupuesto: 5000 },
    { codigo: 24, nombre: "marqueting", presupuesto: 50000 }
]);

use empleados;

db.createCollection("empleados");
db.empleados.insertMany([
    { dni: "11111111", nombre: "Fran", apellidos: "Lopez", departamento: 65 },
    { dni: "22222222", nombre: "Charo", apellidos: "Manzano", departamento: 14 },
    { dni: "33333333", nombre: "Nuria", apellidos: "Perez", departamento: 77 },
    { dni: "44444444", nombre: "Nuria", apellidos: "Lopez", departamento: 22 },
    { dni: "55555555", nombre: "Maria", apellidos: "Caparra", departamento: 24 },
    { dni: "66666666", nombre: "Jose", apellidos: "Ruiz", departamento: 43 },
    { dni: "77777777", nombre: "Pepa", apellidos: "March", departamento: 65 },
    { dni: "88888888", nombre: "Francisco", apellidos: "Perez", departamento: 65 },
    { dni: "99999999", nombre: "Sabrina", apellidos: "Slay", departamento: 43 },
    { dni: "10101010", nombre: "Eva", apellidos: "Slay", departamento: 37 }
]);