package TA6;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		
		/*9) Crea un array de números donde le indicamos por teclado el tamaño del 
		array, rellenaremos el array con números aleatorios entre 0 y 9. Al final 
		muestra por pantalla el	valor de cada posición y la suma de todos los valores.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entra un tamaño de array: ");
			int lengthIntro = Integer.parseInt(sc.nextLine());
			
		int [] arrayGenerado = crearYrellenarArrayRandom(lengthIntro);
		
		System.out.print("El array generado es:");
		imprimirArray(arrayGenerado);
	
	}
	
	
	public static int[] crearYrellenarArrayRandom(int lengthArray) {
        Scanner sc = new Scanner(System.in);            
        int array[] = new int[lengthArray];
        
       
        for (int i = 0; i <lengthArray; i++) {
        	System.out.println("Introduce el valor minimo del rango:");
        	 	int rangoMIN = Integer.parseInt(sc.nextLine());
        	System.out.println("Introduce el valor minimo del rango:");
          		int rangoMAX = Integer.parseInt(sc.nextLine());
        	
        	int randomNum = ((int) (Math.random()*(rangoMAX - rangoMIN + 1)) + rangoMIN);
    		
                array[i] = randomNum;
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
}
