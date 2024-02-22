package TA6;

import java.util.Scanner;

public class Ej01 {

	public static void main(String[] args) {
		/*1) Crea una aplicación que nos calcule el área de un circulo, cuadrado o 
		triangulo. Pediremos que figura queremos calcular su área y según lo 
		introducido pedirá los valores necesarios para calcular el área. 
		Crea un método por cada figura para calcular cada área, este devolverá
		un número real. Muestra el resultado por pantalla.*/

		System.out.println("Bienvenido a GEOMETRIA");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Calcula el area de una de las siguientes figuras: "
				+ "circulo, triangulo o cuadrado.");
		
			String figura = sc.nextLine();
				figura = figura.toUpperCase();
			
				switch (figura) {
					case "CIRCULO":
						System.out.println("Indique el radio: ");
							double r = Double.parseDouble(sc.nextLine());
						System.out.println("El area es: " + circulo(r));
								break;
								
					case "TRIANGULO":
						System.out.println("Indique la base: ");
							double b = Double.parseDouble(sc.nextLine());
						System.out.println("Indique la alura: ");
							double h = Double.parseDouble(sc.nextLine());
						System.out.println("El area es: " + );
								break;
					
					case "CUADRADO":
						System.out.println("Indique el lado: ");
							double l = Double.parseDouble(sc.nextLine());
							System.out.println("El area es: " + );
								break;
								
					default:
						System.out.println("No has especificado un figura disponible.");
				}
				
		sc.close();
		
		
		
		
	}
	
	public static int circulo(int radio) {
        return Math.pow(radio, 2)*Math.PI;
    }
	
	
}
