package TA9HerenciaEnJava.Ej01;

import java.text.DecimalFormat;

public class ElectrodomesticoMainApp {

	public static void main(String[] args) {

		electrodomestico[] electrodomesticos = new electrodomestico[10];

		electrodomesticos[0] = new television(600.0, "rojo", 'F', 30, 55.0, true);
		electrodomesticos[1] = new television(350.99, 30);
		electrodomesticos[2] = new television(99.99, "azul", 'A', 10, 25, true);
		electrodomesticos[3] = new television(240, "negro", 'C', 24.7, 55.0, true);
		electrodomesticos[4] = new television();

		electrodomesticos[5] = new lavadora();
		electrodomesticos[6] = new lavadora(589.89, "blanco", 'A', 50, 10);
		electrodomesticos[7] = new lavadora(300, 30);
		electrodomesticos[8] = new lavadora(999.99, "gris", 'A', 100, 30);
		electrodomesticos[9] = new lavadora(1499.99, "blanco", 'B', 120, 50);

		double precioTotalTelevisiones = 0;
		double precioTotalLavadoras = 0;
		double precioTotalElectrodomesticos = 0;

		for (electrodomestico electrodomestico : electrodomesticos) {
			double precioFinal = electrodomestico.precioFinal();
			precioTotalElectrodomesticos += precioFinal;

			if (electrodomestico instanceof television) {
				precioTotalTelevisiones += precioFinal;
			} else if (electrodomestico instanceof lavadora) {
				precioTotalLavadoras += precioFinal;
			}
		}
		
		DecimalFormat formatoDecimal = new DecimalFormat("#.##");
		System.out.println("Precio total de las televisiones: " + precioTotalTelevisiones);
		System.out.println("Precio total de las lavadoras: " + precioTotalLavadoras);
		System.out.println("Precio total de todos los electrodomésticos: " 
		+ formatoDecimal.format(precioTotalElectrodomesticos));
	}

}
