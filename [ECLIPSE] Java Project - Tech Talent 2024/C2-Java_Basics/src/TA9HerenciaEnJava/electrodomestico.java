package TA9HerenciaEnJava;

/* Atributos: precio base, color, consumo energetico (A-F) y peso. se podran heredar.
 * Por defecto: color, blanco; consumo energetico, F; precio base, 100€; y peso, 5. (constantes)
 * Colores disponibles: blanco, negro, rojo, azul y gris (ignoreç-.case)
 * Constructores: por defecto, precio y peso (resto por defecto) y todos los atributos.
 */

public class electrodomestico {

	protected final double precioDefault = 100;
	protected final String colorDefault = "blanco";
	protected final char consEnergiaDefault = 'F';
	protected final double pesoDefault = 5;
	
	protected double precioBase = precioDefault;
	protected String color = colorDefault;
	protected char consEnerg = consEnergiaDefault;
	protected double peso = pesoDefault;
	
	
	//Constructor default
	public electrodomestico() {
		this.precioBase = precioDefault;
		this.color = colorDefault;
		this.consEnerg = consEnergiaDefault;
		this.peso = pesoDefault;
	}
	
	//Constructor precio y peso, resto default
	public electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consEnerg = consEnergiaDefault;
		this.color = colorDefault;
	}
		
	//Constructor todos los atributos
	public electrodomestico(double precioBase, String color, char consEnerg, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consEnerg = consEnerg;
		this.peso = peso;
	}

}
