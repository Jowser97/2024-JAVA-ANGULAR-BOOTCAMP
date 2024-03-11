package TA7;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ej03BaseDeDatosSupermercado {

	public static void main(String[] args) {

		HashMap<String, Double> productosPrecios = new HashMap<>();
		productosPrecios.put("Leche", 0.99);
		productosPrecios.put("Pan", 0.79);
		productosPrecios.put("Cerveza", 1.49);
		productosPrecios.put("Patatas", 1.29);
		productosPrecios.put("Galletas", 0.89);
		productosPrecios.put("Aceite", 2.49);
		productosPrecios.put("Huevos", 1.69);
		productosPrecios.put("Arroz", 1.19);
		productosPrecios.put("Papel higiénico", 0.99);
		productosPrecios.put("Zumo", 1.29);

		HashMap<String, Integer> productosStock = new HashMap<>();
		productosStock.put("Leche", 50);
		productosStock.put("Pan", 100);
		productosStock.put("Cerveza", 200);
		productosStock.put("Patatas", 150);
		productosStock.put("Galletas", 80);
		productosStock.put("Aceite", 60);
		productosStock.put("Huevos", 120);
		productosStock.put("Arroz", 90);
		productosStock.put("Papel higiénico", 70);
		productosStock.put("Zumo", 100);

		System.out.println("Productos:");
		mostrarHashMapPreciosPanel(productosPrecios, productosStock);

		Scanner sc = new Scanner(System.in);
		String respuesta;
		do {
			System.out.println("Desea añadir un articulo? (y/n)");
			respuesta = sc.nextLine();
			añadirArticulo(productosPrecios, productosStock, respuesta);
		} while (respuesta.equalsIgnoreCase("y"));

		mostrarHashMapPreciosPanel(productosPrecios, productosStock);

	}

	public static void mostrarHashMapPrecios(HashMap<String, Double> precio, HashMap<String, Integer> unidades) {
		for (String key : precio.keySet()) {
			double precioDeKey = precio.get(key);
			int unidadesDeKey = unidades.get(key);
			System.out.println(key + ": " + precioDeKey + "€" + " -> " + unidadesDeKey);
		}
	}

	public static void mostrarHashMapPreciosPanel(HashMap<String, Double> precio, HashMap<String, Integer> unidades) {
		// Sirve para concatenar diferentes elementos.
		StringBuilder stringBuilder = new StringBuilder();

		for (String key : precio.keySet()) {
			double precioDeKey = precio.get(key);
			int unidadesDeKey = unidades.get(key);
			stringBuilder.append(key).append(": ").append(precioDeKey).append("€").append(" -> ").append(unidadesDeKey)
					.append("\n");
		}

		JOptionPane.showMessageDialog(null, stringBuilder.toString());

	}

	public static void añadirArticulo(HashMap<String, Double> hashmapPrecio, HashMap<String, Integer> hashmapUnidades,
			String respuesta) {

		Scanner sc = new Scanner(System.in);

		if (respuesta.equalsIgnoreCase("y")) {
			System.out.println("Por favor introduzca articulo.");
			String articulo = sc.nextLine();

			System.out.println("Ahora el precio");
			double precio = Double.parseDouble(sc.nextLine());

			System.out.println("Cuantos desea añadir?");
			int cantidad = Integer.parseInt(sc.nextLine());

			hashmapPrecio.put(articulo, precio);
			hashmapUnidades.put(articulo, cantidad);
		}
	}
}
