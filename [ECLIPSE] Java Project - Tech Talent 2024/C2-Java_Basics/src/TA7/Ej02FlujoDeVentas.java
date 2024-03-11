package TA7;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Ej02FlujoDeVentas {

	public static void main(String[] args) {
		/*
		 * 2) Crea una aplicación que gestione el flujo de ventas de una caja de
		 * supermercado. El programa guardara las cantidades del carrito de compra
		 * dentro de una lista. Mostrará por pantalla la siguiente informacion: • IVA
		 * aplicado (21% o 4%) • precio total bruto y precio mas IVA. • Numero de
		 * artículos comprados. • Cantidad pagada. • Cambio a devolver al cliente.
		 */
		// Hecho con ayuda de Alejandro

		HashMap<String, Double> carritoCompra = new HashMap<>();

		rellenarCarritoCompra(carritoCompra);

	}

	public static void rellenarCarritoCompra(HashMap<String, Double> listadoHashMap) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero total de productos a comprar.");
		int productosTotales = Integer.parseInt(sc.nextLine());
		double[] precioIVA = new double[productosTotales];
		double total = 0;
		int contador = 0;
		do {
			System.out.println("Producto " + (contador + 1));
			String producto = sc.nextLine();

			System.out.println("Precio:");
			double precio = Double.parseDouble(sc.nextLine());
			precioIVA[contador] = aplicarIVA(precio);
			listadoHashMap.put(producto, precio);
			contador++;
		} while (contador < productosTotales);

		mostrarHashMap(listadoHashMap, precioIVA);

		for (double elemento : precioIVA) {
			total += elemento;
		}

		System.out.println("El total a pagar es: " + total);
		System.out.println("El dinero a devolver es: " + pagar(total) + "€");

	}

	public static void mostrarHashMap(HashMap<String, Double> listadoHashMap, double[] precioIVA) {
		DecimalFormat formato = new DecimalFormat("#.##");
		int contador = 0;
		for (String key : listadoHashMap.keySet()) {
			Double valueDeKey = listadoHashMap.get(key);
			double precioConIVA = precioIVA[contador];
			String ivaFormateado = formato.format(precioConIVA);
			System.out.println(key + " / " + valueDeKey + " precio más IVA: " + ivaFormateado);
			contador++;
		}
	}

	public static Double aplicarIVA(double precio) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Es de primera necesidad?(s/n)");
		String esencial = sc.nextLine();
		double precioIVA;

		if (esencial.equals("s")) {
			precioIVA = precio * 1.04;

		} else {
			precioIVA = precio * 1.21;
		}

		return precioIVA;

	}

	public static String pagar(double totalapagar) {
		DecimalFormat formato = new DecimalFormat("#.##");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dinero:");
		double dinero = Double.parseDouble(sc.nextLine());
		System.out.println("Has pagado con: " + dinero + "€");
		double vuelta = dinero - totalapagar;
		String vueltaFormateado = formato.format(vuelta);
		return vueltaFormateado;

	}

}
