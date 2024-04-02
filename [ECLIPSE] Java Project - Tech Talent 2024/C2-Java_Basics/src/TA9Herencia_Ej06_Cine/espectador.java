package TA9Herencia_Ej06_Cine;

import java.util.ArrayList;
import java.util.Random;

public class espectador {

	public String nombre;
	public int edad;
	public double dinero;
	
	public espectador() {
		String[] nombres = {"Sofía","María","Valentina","Camila","Isabella","Ana","Gabriela",
				"Daniela","Laura","Paula","Natalia","Andrea","Adriana","Victoria","Clara",
				"Alejandra","Julia","Antonia","Carolina","Isabel","Santiago","Andrés",
				"Marcos","Gabriel","Mateo","Sebastián","Daniel","Juan","Alejandro",
				"Leonardo","Carlos","Diego","Luis","Javier","Ricardo","Emilio","Martín",
				"José","Alberto","David"};
		
		Random random = new Random();
    	int indiceNombre = random.nextInt(nombres.length);
    	
    	nombre = nombres[indiceNombre];
    	edad = random.nextInt(100);
    	dinero = random.nextDouble(30);
    	
	}
	
	public espectador(String nombre, int edad, double dinero) {
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
}
