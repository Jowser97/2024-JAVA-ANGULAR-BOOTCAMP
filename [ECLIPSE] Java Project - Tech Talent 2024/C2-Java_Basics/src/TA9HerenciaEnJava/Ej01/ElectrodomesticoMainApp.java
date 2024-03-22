package TA9HerenciaEnJava.Ej01;

import UD8.Persona;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) {
		
	electrodomestico[] electrodomesticos = new electrodomestico[10];
	
	electrodomesticos [0] = new television(600.0, "rojo", 'F', 30, 55.0, true);
	electrodomesticos [1] = new television(350.99, 30);
	electrodomesticos [2] = new television(99.99, "azul", 'A',  10, 25, true);
	electrodomesticos [3] = new television(240, "negro", 'C', 24.7, 55.0, true);
	electrodomesticos [4] = new television();
	
	electrodomesticos [5] = new lavadora();
	electrodomesticos [6] = new lavadora(589.89, "blanco", 'A', 50, 10);
	electrodomesticos [7] = new lavadora(300, 30);
	electrodomesticos [8] = new lavadora(999.99, "gris", 'A', 100, 30);
	electrodomesticos [9] = new lavadora(1499.99, "blanco", 'B', 120, 50);
							
	for (electrodomestico item : electrodomesticos) {
		item.precioFinal(item.getPrecioBase()), );
	}
	
	
	
	}

}
