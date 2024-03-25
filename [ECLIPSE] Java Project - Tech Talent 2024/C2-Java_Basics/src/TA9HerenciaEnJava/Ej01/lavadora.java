package TA9HerenciaEnJava.Ej01;

public class lavadora extends electrodomestico {

	final double cargaDefault = 5;

	private double carga = cargaDefault;

	//Constructor por defecto, herendando superclass
	public lavadora() {
		super();
		this.carga = cargaDefault;
	}
	
	//Constructor precio y peso heredado de superclass, y resto default
	public lavadora(double precio, double peso) {
		super();
		this.precioBase = precio;
		this.peso = peso;
	}
	
	//Constructor todos los parametros heredando superclass
	public lavadora(double precioBase, String color, char consEnerg, double peso, double carga) {
		super(precioBase, color, consEnerg, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	//Metodo añadido al de la superclass
	@Override
	public double precioFinal() {
		double precio = super.precioFinal();
		
		if (carga > 30) {
			precio += 50;
		}
		return precio;
	}
}
	
	

