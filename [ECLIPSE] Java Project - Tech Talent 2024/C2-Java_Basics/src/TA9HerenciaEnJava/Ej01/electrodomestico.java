package TA9HerenciaEnJava.Ej01;

/* Atributos: precio base, color, consumo energetico (A-F) y peso. se podran heredar.
 * Por defecto: color, blanco; consumo energetico, F; precio base, 100€; y peso, 5. (constantes)
 * Colores disponibles: blanco, negro, rojo, azul y gris (ignoreç-.case)
 * Constructores: por defecto, precio y peso (resto por defecto) y todos los atributos.
 */

public class electrodomestico {

	protected final static double precioDefault = 100; //static, globaliza una variable
	protected final static String colorDefault = "blanco"; //se puede usar un arraylist (repoprofe)
	protected final static char consEnergiaDefault = 'F';
	protected final static double pesoDefault = 5;

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
	public electrodomestico(double precioBase, String color, char consEnerg, double peso) {
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consEnerg = comprobarConsumoEnergetico(consEnerg);
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

	//Metodo comprobar consumo energetico, se puede poner privado por que se instancia al 
	//constructor y este llama al metodo.
	private char comprobarConsumoEnergetico(char letra) {
	    if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return electrodomestico.consEnergiaDefault;
        }
    }

	// Metodo comprobar color, se le añade static para poder usarlo en otra clase
	protected static String comprobarColor(String color) {
		if (color.equals("blanco") || color.equals("negro") || color.equals("rojo")
				|| color.equals("azul") || color.equals("gris")) {
			return color;
		} else {
			return colorDefault;
		}
	}

	// Metodo precio final
	public double precioFinal() {
		double precio = precioBase;
		switch (consEnerg) { //no se le pone this, por que es un valor ya asignado
		case 'A':
			precio += 100;
			break;
		case 'B':
			precio += 80;
			break;
		case 'C':
			precio += 60;
			break;
		case 'D':
			precio += 50;
			break;
		case 'E':
			precio += 30;
			break;
		case 'F':
			precio += 10;
			break;
		default:
			break;
		}

		if (peso >= 0 && peso <= 19) {
			precio += 10;
		} else if (peso >= 20 && peso <= 49) {
			precio += 50;
		} else if (peso >= 50 && peso <= 79) {
			precio += 80;
		} else if (peso >= 80) {
			precio += 100;
		}
		
		return precio;
	}
}
