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

	// Constructor default
	public electrodomestico() {
		this.precioBase = precioDefault;
		this.color = colorDefault;
		this.consEnerg = consEnergiaDefault;
		this.peso = pesoDefault;
	}

	// Constructor precio y peso, resto default
	public electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.consEnerg = consEnergiaDefault;
		this.color = colorDefault;
	}

	// Constructor todos los atributos
	public electrodomestico(double precioBase, String color, char consEnerg, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consEnerg = consEnerg;
		this.peso = peso;
	}

	// Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsEnerg() {
		return consEnerg;
	}

	public void setConsEnerg(char consEnerg) {
		this.consEnerg = consEnerg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// Metodo comprobar consumo energetico
	public char comprobarConsumoEnergetico(char letra) {
	    if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return this.consEnergiaDefault;
        }
    }

	// Metodo comprobar color
	public String comprobarColor(String color) {
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo")
				|| color.equals("azul") || color.equals("gris")) {
			return color;
		} else {
			return this.colorDefault;
		}
	}

	// Metodo precio final
	public void precioFinal() {
		switch (this.consEnerg) {
		case 'A':
			this.precioBase += 100;
			break;
		case 'B':
			this.precioBase += 80;
			break;
		case 'C':
			this.precioBase += 60;
			break;
		case 'D':
			this.precioBase += 50;
			break;
		case 'E':
			this.precioBase += 30;
			break;
		case 'F':
			this.precioBase += 10;
			break;
		default:
			break;
		}

		if (this.peso >= 0 && this.peso <= 19) {
			this.precioBase += 10;
		} else if (this.peso >= 20 && this.peso <= 49) {
			this.precioBase += 50;
		} else if (this.peso >= 50 && this.peso <= 79) {
			this.precioBase += 80;
		} else if (this.peso >= 80) {
			this.precioBase += 100;
		}
	}
}
