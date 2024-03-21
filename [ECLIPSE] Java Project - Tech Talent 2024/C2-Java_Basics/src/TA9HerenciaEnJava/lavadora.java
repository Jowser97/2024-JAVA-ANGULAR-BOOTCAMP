package TA9HerenciaEnJava;

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
	public lavadora(double precioBase, String color, char consEnerg, int peso, double carga) {
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
	public void precioFinal() {

		if (this.carga > 30) {
			this.precioBase += 50;
		}
		
		super.precioFinal();
	}
}
	
	

