package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej02FlujoDeVentas {

	public static void main(String[] args) {
		/*2) Crea una aplicación que gestione el flujo de ventas de una caja 
		de supermercado. El programa guardara las cantidades del carrito 
		de compra dentro de una lista. Mostrará por pantalla la	siguiente 
		informacion:
			• IVA aplicado (21% o 4%)
			• precio total bruto y precio mas IVA.
			• Numero de artículos comprados.
			• Cantidad pagada.
			• Cambio a devolver al cliente.*/
		
		HashMap<String, Double> carritoCompra = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero total de productos a comprar.");
		int productosTotales = Integer.parseInt(sc.nextLine());
		
		int contador = 0;
		do {
			System.out.println("Producto " + (contador + 1));
			rellenarCarritoCompra(carritoCompra);
			contador++;
		}while (contador<productosTotales);
		
		mostrarHashMap(carritoCompra);
		
		

	}
	
	public static void rellenarCarritoCompra (HashMap<String, Double> listadoHashMap) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Producto:");
		String producto = sc.nextLine();
		
		System.out.println("Precio:");
		double precio = Double.parseDouble(sc.nextLine());
		
		listadoHashMap.put(producto, precio);
		
	}
	
	public static void mostrarHashMap (HashMap<String, Double> listadoHashMap) {
		
		for (String key : listadoHashMap.keySet()) {
			Double valueDeKey = listadoHashMap.get(key);
			System.out.println(key+ " / "+valueDeKey);
		}
	}

}
