package TA6;

import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
    	
    	/*2) Crea una aplicación que nos genere una cantidad de números enteros aleatorios que
    	nosotros le pasaremos por teclado. Crea un método donde pasamos como parámetros entre
    	que números queremos que los genere, podemos pedirlas por teclado antes de generar los
    	números. Este método devolverá un número entero aleatorio. Muestra estos números por
    	pantalla.*/

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Vamos a generar numeros aleatorios!");
    	System.out.println("Cuantos numeros aleatorios quieres generar?");
    		int n = Integer.parseInt(sc.nextLine());
    	
    	//Genero las variables llamando a los metodos minimo y maximo.	
    	int min = minimo();
    	int max = maximo();
     	
    	System.out.println("A GENERAR NUMEROS!");
    	randomGen(n, min, max);
    		
		} 
    
    //Genero metodos para el minimo, maximo y generador de num random
    public static int minimo() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cual es el valor minimo que quieres introducir?");
		int min = Integer.parseInt(sc.nextLine());
				return min;
    }
    
    public static int maximo() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Y el valor maximo?");
		int max = Integer.parseInt(sc.nextLine());
				return max;
    	
    }
    
    public static void randomGen(int totalNums, int minimo, int maximo ) {
    	for (int contador = 0; contador < totalNums; contador++) {
    		int randomNum = ((int) (Math.random()*(maximo - minimo + 1)) + minimo);
    		System.out.print(randomNum +" ");
			
    	}
    }
}

