package TA6;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		
		/* 10)Crea un array de tamaño pedido por teclado.
	     * El array contendrá numeros aleatorios 
	     * primos entre un rango deseado.
	     * Devuelve por consola el numero primo mayor que se haya generado.
	     * Comprueba que el numero sea primo. */
	     
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entra un tamaño de array: ");
			int lengthIntro = Integer.parseInt(sc.nextLine());
			
		int [] arrayGenerado = crearYrellenarArrayRandomPrimo(lengthIntro);
		
		System.out.print("El array generado es: [");
		imprimirArray(arrayGenerado);
		System.out.print("]\n");
		System.out.println("El mayor numero generado del array es: " +mayorNum(arrayGenerado));
	}
	
	
	public static int[] crearYrellenarArrayRandomPrimo(int lengthArray) {
		
        Scanner sc = new Scanner(System.in);            
        int array[] = new int[lengthArray];
        System.out.println("Introduce el valor minimo del rango:");
        	int rangoMIN = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el valor maximo del rango:");
        	int rangoMAX = Integer.parseInt(sc.nextLine());
       
        for (int i = 0; i <lengthArray; i++) {
        	int randomNum = (int) (Math.random()*(rangoMAX - rangoMIN + 1)) + rangoMIN;
    		if (esPrimo(randomNum)) {
    			array[i] = randomNum;
    		}
                
        }
     
        return array;
	}
     
	public static void imprimirArray (int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]);
            if (i < lista.length -1) {
                System.out.print(", ");
            }
        }
   	}	
	
	public static boolean esPrimo (int numINTRO) {
        
        if (numINTRO <= 1) {
            return false;
        }
        for (int contador = 2; contador <=Math.sqrt(numINTRO); contador++) { 
            if (numINTRO % contador == 0) {
                return false;
                }
            }
        return true;
    }
	
	public static int mayorNum (int[] arrayEscogido) {
	        int maxValue = arrayEscogido[0];
	        for (int i = 1; i < arrayEscogido.length; i++) {
	            if (arrayEscogido[i] > maxValue) {
	                maxValue = arrayEscogido[i];
	            }
	        }
	    return maxValue;
	}
}


