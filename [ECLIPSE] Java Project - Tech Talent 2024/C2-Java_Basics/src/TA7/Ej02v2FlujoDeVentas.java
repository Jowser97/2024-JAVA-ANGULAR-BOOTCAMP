package TA7;

import java.text.*;
import java.util.*;

public class Ej02v2FlujoDeVentas {

	// Este lo he hecho solo a partir de un ejercicio sin
	// metodos de Isa, aunque ya no mantiene nada del original.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenido a -supermercado generico- ");

		HashMap<String, Double> carrito = new HashMap<>();
		ArrayList<Double> precioIVA = new ArrayList<>();

		preguntaAñadirCarrito(carrito, precioIVA);

		imprimirHashMap(carrito, precioIVA);
		
		tiquetCompra(precioIVA);

		System.out.println("Le esperamos pronto!");

	}

	public static String obtenerProducto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce producto.");
		String producto = sc.nextLine();
		return producto;
	}

	public static double obtenerPrecio() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el precio.");
		double precio = Double.parseDouble(sc.nextLine());
		return precio;
	}

	public static double obtenerPrecioConIva(double precio) {
		Scanner sc = new Scanner(System.in);

		double iva;
		System.out.println("Es un producto de primera necesidad?(si/no)");
		String respuesta = sc.nextLine();
		if (respuesta.equals("si")) {
			iva = 1.04;
		} else {
			iva = 1.21;
		}

		return precio * iva;
	}

	public static void imprimirHashMap(HashMap<String, Double> HashMap, ArrayList<Double> precioIVA) {
		int contador = 0;
		DecimalFormat formato = new DecimalFormat("#.##");
		for (String producto : HashMap.keySet()) {
			double precioBruto = HashMap.get(producto);
			double precioConIVA = precioIVA.get(contador);
			String ivaFormateado = formato.format(precioConIVA);
			System.out.println(producto + " -> " + precioBruto + "€, precio más IVA: " + ivaFormateado + "€");
			contador++;
		}
	}

	public static double totalCompra(ArrayList<Double> precioIVA) {
		double suma = 0;
		for (double precio : precioIVA) {
			suma += precio;
		}

		return suma;
	}

	public static void pagar(double totalapagar) {
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);

		System.out.println("Con cuanto desea pagar?");
		double dinero = Double.parseDouble(sc.nextLine());
		System.out.println("Ha pagado con: " + dinero + "€");
		double vuelta = dinero - totalapagar;
		String vueltaFormateado = formato.format(vuelta);
		System.out.println("Su cambio es de: " + vueltaFormateado + "€");

	}

	public static void preguntaAñadirCarrito(HashMap<String, Double> HashMap, ArrayList<Double> precioIVA) {
		String respuestaCarrito = "";
		do {
			System.out.println("Desea añadir elementos al carro?(y/n)");
			Scanner sc = new Scanner(System.in);
			respuestaCarrito = sc.nextLine();

			if (respuestaCarrito.equalsIgnoreCase("y")) {
				String producto = obtenerProducto();
				double precioBruto = obtenerPrecio();
				double precioConIVA = obtenerPrecioConIva(precioBruto);
				HashMap.put(producto, precioBruto);
				precioIVA.add(precioConIVA);
			}
		} while (respuestaCarrito.equalsIgnoreCase("y"));
	}

	public static void tiquetCompra(ArrayList<Double> precioIVA) {
		double totalPagar = totalCompra(precioIVA);
		DecimalFormat formato = new DecimalFormat("#.##");
		String totalPagarForm = formato.format(totalPagar);
		System.out.println("El total a pagar es: " + totalPagarForm + "€");

		pagar(totalPagar);
	}
}