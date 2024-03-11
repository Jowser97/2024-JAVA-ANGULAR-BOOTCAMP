package TA7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ej01NotaMediaCursoProg {

	/*
	 * Primero crear un arraylist para cada alumno. Calcular la media de cada alumno
	 * Guardar cada nota media en un hashmap, donde este el alumno y la media.
	 * 
	 * Crea una aplicación que calcule la nota media de los alumnos pertenecientes
	 * al curso de programación. Una vez calculada la nota media se guardara esta
	 * información en un diccionario de datos que almacene la nota media de cada
	 * alumno. Todos estos datos se han de proporcionar por pantalla.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("--NOTAS DE ALUMNOS--");

		HashMap<String, Integer> alumnosNotaMedia = new HashMap<>();

		System.out.println("Cuantos alumnos quieres crear?");
		int alumnosTotales = sc.nextInt();

		int contador = 0;
		do {
			System.out.println("Persona numero " + (contador + 1) + ":");
			formulario(alumnosNotaMedia);
			contador++;
		} while (contador < (alumnosTotales));
		System.out.println("La media de cada alumnos es:");
		imprimirHashMapKeyValue(alumnosNotaMedia);
	}

	public static void formulario(HashMap<String, Integer> listadoHashMap) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nombre de alumno");
		String nombre = sc.nextLine();

		System.out.println("Introduce la nota del primer parcial.");
		int nota1 = Integer.parseInt(sc.nextLine());

		System.out.println("Introduce la nota del segundo parcial.");
		int nota2 = Integer.parseInt(sc.nextLine());

		int media = ((nota1 + nota2) / 2);
		listadoHashMap.put(nombre, media);

	}

	public static void imprimirHashMapKeyValue(HashMap<String, Integer> listadoHashmap) {
		for (String key : listadoHashmap.keySet()) {
			int valueDeKey = listadoHashmap.get(key);
			System.out.println(key + " / " + valueDeKey);

		}

	}

}
