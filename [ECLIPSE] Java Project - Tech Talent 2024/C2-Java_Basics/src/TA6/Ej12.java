package TA6;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
	
		/*12) Crea un array de números de un tamaño pasado por teclado, el 
		array contendrá números aleatorios entre 1 y 300 y mostrará aquellos 
		números que acaben en un dígito que nosotros le indiquemos por teclado 
		(debes controlar que se introduce un numero correcto), estos deben 
		guardarse en un nuevo array. Por ejemplo, en un array de 10 posiciones
	 	le indicamos mostrar los números acabados en 5, podría salir 155, 25, etc*/
		
    	Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingrese el tamaño del array: ");
	    

	    //Creo y genero arrays con el metodo crearYrellenarArrayRANDOM
	   
	    int lengthArray = scanner.nextInt();
	    int[] array = crearYrellenarArrayRANDOM(lengthArray);
//		for (int i = 0; i < lengthArray; i++) {
//			int randomNum = (int) (Math.random()*(300 - 1 + 1)) + 1;
//			array[i]=randomNum;
//	        }
		
		imprimirArray(array);
		System.out.println("\n");
	
		//Pide un numero entre 0 y 9 para 
		int digitoFiltrar;
		do {
			System.out.print("De los numeros generados, por que numero, entre 0 y 9,"
					+ " quieres que se muestren? ");
				digitoFiltrar = scanner.nextInt();
	        		} while (digitoFiltrar < 0 || digitoFiltrar > 9);
	
		//Guarda los numeros que terminan por el digito especificado 
		int contador = 0;
		for (int num : array) {
			if (num % 10 == digitoFiltrar) {
				contador++;
					}
				}
		
		//Se genera el array con los numeros guardados 
		int[] numerosFiltrados = new int[contador];
		int index = 0;
		for (int num : array) {
			if (num % 10 == digitoFiltrar) {
				numerosFiltrados[index] = num;
				index++;
				}
			}
	
		scanner.close();
		
		imprimirArray(numerosFiltrados);
		
	}
	
	public static void imprimirArray (int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length -1) {
                System.out.print(", ");
            }
        }
	}
	
	public static int[] crearYrellenarArrayRANDOM(int largoArray) {
        int array[]=new int [largoArray]; // {0,0,0,0,0} cuando tamaño es 5
       
        for (int i = 0; i <largoArray; i++) {
        	int randomNum = (int) (Math.random()*(300 + 1));
        	array[i]=randomNum;
        }
                     
        return array;
	
	}
}
