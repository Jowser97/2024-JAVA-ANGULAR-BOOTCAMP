package TA6;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
    	
    	/*2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
    	nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
    	que números queremos que los genere, podemos pedirlas por teclado antes de generar los
    	números. Este método devolverá un número entero aleatorio. Muestra estos números por
    	pantalla.*/

    	Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el rango de números
        System.out.print("Introduce el valor mínimo: ");
        int min = scanner.nextInt();
        System.out.print("Introduce el valor máximo: ");
        int max = scanner.nextInt();

        // Pedir al usuario que introduzca la cantidad de números a generar
        System.out.print("Introduce la cantidad de números a generar: ");
        int cantidadNumeros = scanner.nextInt();

        // Generar y mostrar los números aleatorios
        System.out.println("Números aleatorios generados:");
        	for (int i = 0; i < cantidadNumeros; i++) {
        		int numeroAleatorio = generarNumeroAleatorio(min, max);
        		System.out.println(numeroAleatorio);
        }
        
        scanner.close();
    }

    // Método para generar un número aleatorio en el rango especificado
    public static int generarNumeroAleatorio(int min, int max) {
		return (int) (Math.random() * (max - min + 1)) + min;
    }
}
