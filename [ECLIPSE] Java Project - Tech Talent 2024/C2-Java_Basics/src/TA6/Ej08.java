package TA6;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		
		/*8) Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por
		consola el indice y el valor al que corresponde. Haz dos métodos, uno para rellenar valores 
		y otro para mostrar.*/
		
		
		System.out.println("BIENVENIDO A LAS MATRICES");
		
		int matriz[] = new int[10];
		llenarArray(matriz);
		mostrarArray(matriz);
      
        }
        
        public static void llenarArray(int[] matriz) {
        	
        	
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Introduce por orden los 10 numeros que quieras "
        			+ "que compongan la matriz.");
        	for (int i=0; i<10; i++) {
                 int numero = sc.nextInt();
                 matriz[i]=numero;
             }
        
        	sc.close();
        }
        public static void mostrarArray(int[] matriz) {
            System.out.println("Contenido del array:");
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i] + " ");
                
        }
    }
}
