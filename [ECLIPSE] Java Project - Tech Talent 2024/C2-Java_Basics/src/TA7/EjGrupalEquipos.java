package TA7;

import java.util.HashMap;
import java.util.Scanner;

public class EjGrupalEquipos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		//System.out.println("Cuantos alumnos ");
		
		HashMap<String, Integer> edadesAlumnos = new HashMap<>();
		System.out.println("Introduce la cantidad de alumnos totales.");
		int alumnosTotales = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= alumnosTotales; i++) {
			System.out.println("Introduce alumno " +i+ ":");
			String nombre = sc.nextLine();
			System.out.println("Introduce la edad.");
			int edad = sc.nextInt();
			sc.nextLine();
			edadesAlumnos.put(nombre, edad);
		}
		
		for (String name : edades) {
			
		}
			
//		for (String name : edadesAlumnos.keySet()) {
//			System.out.println(name);
//			
//			}	
//		for (int age : edadesAlumnos.values()) {
//			System.out.println(age);	
//		}
		
//estudiantesTechTalent.put("Laia", 23);
//estudiantesTechTalent.put("Aurora", 22);
//estudiantesTechTalent.put("Alexandre", 21);
//estudiantesTechTalent.put("Jose", 20);
//estudiantesTechTalent.put("Santos", 24);
//estudiantesTechTalent.put("Manel", 21);
//estudiantesTechTalent.put("Alejandro", 20);
//estudiantesTechTalent.put("Isabel", 22);
//estudiantesTechTalent.put("Toni", 21);
//estudiantesTechTalent.put("Diego", 22);
//estudiantesTechTalent.put("Sebas", 22);
//estudiantesTechTalent.put("Abdel", 21);
//estudiantesTechTalent.put("Joel", 20);
//estudiantesTechTalent.put("Jessica", 22);
//estudiantesTechTalent.put("Ana Maria", 29);
			
	}			
		
		
		
	}
