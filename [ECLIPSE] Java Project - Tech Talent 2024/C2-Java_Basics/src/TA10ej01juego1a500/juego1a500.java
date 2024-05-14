package TA10ej01juego1a500;

import java.util.*;

public class juego1a500 {
	
	private Random random;
	public int numeroAdivinar;
	public int intentos;
	
	public juego1a500() {

		Random random = new Random();
		numeroAdivinar = random.nextInt(500) + 1;
		intentos = 0;

	}
	
	public void jugar() {
		System.out.println("Intenta adivinar el numero secreto.");
		
		Scanner sc = new Scanner(System.in);
		int intento;
		boolean adivinado = false;
		
		while (!adivinado) {
			
			System.out.println("Introduce un numero del 1 al 500.");
			try {
				intento = sc.nextInt();
				intentos++;
				
				if (intento < 1 || intento > 500) {
                    System.out.println("El número debe estar entre 1 y 500.");
                    continue;
                }

				if (intento > numeroAdivinar) {
					System.out.println("El numero a adivinar es más pequeño.");
				} else if (intento < numeroAdivinar) {
					System.out.println("El numero a adivinar es más grande.");
				} else {
					adivinado = true;
					System.out.println(
							"¡Felicides has acertado el numero " + numeroAdivinar + " en " + 
					intentos + " intentos!");
				}

			} catch (InputMismatchException e) {
				System.out.println("Entrada invalida, debes introducir un numero del 1 al 100");
				sc.next();
				intentos++;
			}
		}
		sc.close();
	}
}
