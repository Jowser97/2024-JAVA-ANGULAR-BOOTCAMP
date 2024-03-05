package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej01_1NotaMediaMetodos {

	public static void main(String[] args) {

		HashMap<String, Integer> notasPorAlumno = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos alumnos quiere introducir");
		int alumnosIntro = Integer.parseInt(sc.nextLine());

		for (int j = 0; j < alumnosIntro; j++) {
			System.out.println("Como se llama el alumno");
			String nombre = pedirNombre();

			System.out.println("Cuantas notas quiere introducir?");
			int notasIntro = Integer.parseInt(sc.nextLine());
			int[] notas = new int[notasIntro];
			for (int i = 0; i < notasIntro; i++) {
				System.out.println("Por favor, introduzca la nota " + (i + 1) + ":");
				notas[i] = pedirNotas();
			}
			int media = notaMedia(notas);
			notasPorAlumno.put(nombre, media);
		}

		imprimirHashMap(notasPorAlumno);
	}

	public static String pedirNombre() {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();

		return nombre;
	}

	public static int pedirNotas() {
		Scanner sc = new Scanner(System.in);
		int nota = Integer.parseInt(sc.nextLine());

		return nota;
	}

	public static int notaMedia(int[] notas) {
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}

		int media = suma / notas.length;

		return media;
	}

	public static void imprimirHashMap(HashMap<String, Integer> HashMap) {
		for (String key : HashMap.keySet()) {
			int valueKey = HashMap.get(key);
			System.out.println("Las notas medias son:\n" + key + " / " + valueKey);

		}

	}

}
