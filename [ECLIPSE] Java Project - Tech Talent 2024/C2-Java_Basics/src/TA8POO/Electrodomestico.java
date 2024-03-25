package TA8POO;

//Crear una clase llamada Electrodomesticos con atributos: precio base, color, consumo energetico

//y peso
//Los colores disponibles son blanco, negro, rojo, azul y gris
//Un constructor por defecto.
//Un constructor con el precio y peso. El resto por defecto.
//Un constructor con todos los atributos.

public class Electrodomestico {

	private double precioBase;
	private String color;
	private String consumoEnergetico;
	private int peso;

	public Electrodomestico(double precioBase, String color, String consumoEnergetico, int peso) {
		// constructor todos los atributos
		this.precioBase = precioBase;
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
				|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
			this.color = color;
		} else {
			this.color = "blanco";
		}
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public Electrodomestico(String color) {
		this.color = color;
	}

	public Electrodomestico() {
		// constructor por defecto
		this.precioBase = 100.00;
		this.color = "blanco";
		this.consumoEnergetico = "F";
		this.peso = 5;
	}

	public Electrodomestico(double precioBase, int peso) {
		// constructor precio y peso
		this.precioBase = precioBase;
		this.color = "blanco";
		this.consumoEnergetico = "F";
		this.peso = peso;
	}

}
