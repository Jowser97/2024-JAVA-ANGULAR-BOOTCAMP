package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class Ej01_1NotaMediaMetodos {

	public static void main(String[] args) {

		HashMap<String, Double> notasPorAlumno = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos alumnos quiere introducir");
		int alumnosIntro = Integer.parseInt(sc.nextLine());

		for (int j = 0; j < alumnosIntro; j++) {
			System.out.println("Como se llama el alumno " + (j + 1) + "?");
			String nombre = pedirNombre();

			System.out.println("Cuantas notas quiere introducir?");
			int notasIntro = Integer.parseInt(sc.nextLine());
			double[] notas = new double[notasIntro];
			for (int i = 0; i < notasIntro; i++) {
				System.out.println("Por favor, introduzca la nota " + (i + 1) + ":");
				notas[i] = pedirNotas();
			}
			double media = notaMedia(notas);
			notasPorAlumno.put(nombre, media);

		}

		imprimirHashMap(notasPorAlumno);
	}

	public static String pedirNombre() {
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();

		return nombre;
	}

	public static double pedirNotas() {
		Scanner sc = new Scanner(System.in);
		double nota = Double.parseDouble(sc.nextLine());

		return nota;
	}

	public static double notaMedia(double[] notas) {
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}

		double media = suma / notas.length;

		return media;
	}

	public static void imprimirHashMap(HashMap<String, Double> HashMap) {
		System.out.println("Las notas medias son:");
		for (String key : HashMap.keySet()) {
			double valueKey = HashMap.get(key);
			System.out.println(key + " / " + valueKey);
		}

	}

}
