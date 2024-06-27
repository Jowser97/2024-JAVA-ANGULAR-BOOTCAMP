// ejercicio discord

function generar() {
  document.getElementById("beyonce").innerHTML = "Beyoncé";
}

function esconder() {
  document.getElementById("beyonce").innerHTML = "HI!";
}

function ej01() {
  var ejer1 = 50;
  document.getElementById("ejer1").innerHTML = ejer1;
}

function ej03() {
  var temperatura = "Frio";
  document.getElementById("temp").innerHTML = temperatura;
}

function ej04() {
  var x = 2;
  var y = 3;
  document.getElementById("sum").innerHTML = x + y;
}

function ej05() {
  var x = 5;
  var y = 10;
  var z = x + y;
  document.getElementById("sum").innerHTML = z;
}

function ej06() {
  var nombre = "Cristina";
  var apellido = "Garcia";
  var edad = 39;

  document.getElementById("persona").innerHTML =
    nombre + " " + apellido + " tiene " + edad + " años";
}

function ej09() {
  var x = "6";
  var y = "9";
  document.getElementById("mult").innerHTML = x * y;
}

function saluda() {
  document.getElementById("demo").innerHTML = "Hola Mundo";
}
