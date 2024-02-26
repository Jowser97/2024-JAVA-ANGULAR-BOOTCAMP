package TA6;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		/*11) Crea dos arrays de números con la dimensión pasada por teclado. 
		 *Uno de ellos estará rellenado con números aleatorios y el otro apuntara al array anterior,
		 *reasigna los valores del segundo array con valores aleatorios. Después, crea
		 *un método que tenga como parámetros, los dos arrays y devuelva uno nuevo con la 
		 *multiplicación de la posición 0 del array1 con el del array2 y así sucesivamente.
		 *Por último, muestra el contenido de cada array.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("De que tamaño quiere que sean los array?");
			int lengthIntro = Integer.parseInt(sc.nextLine());

			int[]array1=crearYrellenarArrayRANDOM(lengthIntro);
			int[]array2=crearYrellenarArrayRANDOM(lengthIntro);
			
		System.out.println("Los array generados son:");
			imprimirArray(array1);
		System.out.println("\n");
			imprimirArray(array2);
			
			int[]arrayMult = multiplicarArrays(lengthIntro, array1, array2);
			
		System.out.println("\nLa multiplicacion de los array es:");
			imprimirArray(arrayMult);
			
			
	}
	
	
	public static int[] crearYrellenarArrayRANDOM(int lengthArray) {
		
        Scanner sc = new Scanner(System.in);            

        System.out.println("Introduce el valor minimo del numero aleatorio:");
        	int rangoMIN = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el valor maximo del numero aleatorio:");
        	int rangoMAX = Integer.parseInt(sc.nextLine());
        	
        int array[]=new int [lengthArray];
       
        for (int i = 0; i <lengthArray; i++) {
        	int randomNum = (int) (Math.random()*(rangoMAX - rangoMIN + 1)) + rangoMIN;
        	array[i]=randomNum;
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
	
	public static int[] multiplicarArrays(int lengthArrays, int[] primerArray, int[] segundoArray) {
		int[] arrayMultiplicado = new int[lengthArrays];
		for (int i = 0; i < lengthArrays; i++) {
			arrayMultiplicado[i]= primerArray[i] * segundoArray[i];
		}
		return arrayMultiplicado;
	}
}
