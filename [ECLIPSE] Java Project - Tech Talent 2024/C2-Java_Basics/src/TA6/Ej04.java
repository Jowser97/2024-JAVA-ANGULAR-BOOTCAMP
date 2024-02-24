package TA6;

import java.util.Scanner;

public class Ej04 {
		
		/*4) Crea una aplicación que nos calcule el factorial de un número pedido 
		por teclado, lo realizara mediante un método al que le pasamos el número 
		como parámetro. Para calcular el factorial, se multiplica los números 
		anteriores hasta llegar a uno. Por ejemplo, si 
		introducimos un 5, realizara esta operación 5*4*3*2*1=120.*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Bienvenido. \nIntroduzca el numero entero deseado"
				+ " a factorizar:");
			
		int num = Integer.parseInt(sc.nextLine());
		sc.close();
					
		System.out.println("El factorial es: " +factorizar(num));
	}
	
	public static int factorizar (int numINTRO) {
		int prod = 1; //1 para no multiplicar por cero y fastidiar el cálculo
		
		do {
			 prod = prod * numINTRO--;
			}while(numINTRO >= 1);
		return prod;
	}
}
