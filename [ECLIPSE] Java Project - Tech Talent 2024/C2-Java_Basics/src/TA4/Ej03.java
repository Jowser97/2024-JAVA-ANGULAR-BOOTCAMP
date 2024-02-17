package TA4;

public class Ej03 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		double m = 6.5;
		double n = 5.5;
		
		//Declaracion del valor de cada variable
		System.out.println("La variable x = " +x);
		System.out.println("La variable y = " +y);
		System.out.println("La variable n = " +n);
		System.out.println("La variable m = " +m);
		
		//Aqui he realizado la declaracion de cada varible en un solo sys.out
		System.out.println("\nLas variables x, y, n , m son "
				+ "respectivamente: \n" +x+ ", " + +y+", " + +n+ " y " + +m);
		
		//Anuncio que se van a realizar operaciones con las variables x,y
		System.out.println("\nA continuacion se realizan operaciones con x,y:");
		
		//Suma de variables x,y
		System.out.println("\nx + y = " + (x+y));
		
		//Diferencia de variables x,y
		System.out.println("x - y = " + (x-y));
		
		//Producto de variables x,y
		System.out.println("x * y = " + (x*y));
		
		//Cociente de variables x,y
		System.out.println("x / y = " + (x/y));
		
		//Resto de variables x,y
		System.out.println("x % y = " + (x%y));
		
		//Anuncio que se van a realizar operaciones con las variables n,m
		System.out.println("\nAhora se realizan operaciones con n,m:");
		
		//Suma de variables m,n
		System.out.println("\nLa suma de m y n = " + (n+m));
		
		//Diferencia de variables m,n
		System.out.println("La diferencia de m y n = " + (n-m));
		
		//El producto de m,n
		System.out.println("El producto de m y n = " + (n*m));
		
		//El cociente de m,n
		System.out.println("El cociente de m y = " + (n/m));
		
		//El resto de m,n
		System.out.println("El resto de m y n = " + (m%n));
		
		//Anuncio operaciones varias entre diferentes variables
		System.out.println("\nY para finalizar se realizaran operaciones "
				+ "varias entre difrentes variables:");
		
		//Suma de x,n
		System.out.println("\nSumatorio de x,n = " + (x+n));
		
		//Cociente de y,m
		System.out.println("Cociente de y,m = " + (y/m));
		
		//Resto de y,m 
		System.out.println("Resto de y,m = " + (y%m));
		
		//Doble de cada variable en una sola linea
		System.out.println("El doble de cada variable (x, y, m, n) es respectivamente: \n"
				+ (x*2) + ", " + (y*2) + ", " + (n*2) + " y " + (m*2));	
		
		//Sumatorio de todas las variables
		System.out.println("El sumatorio de todas las variables es: " + (x+y+m+n));
		
		//Producto de todas las variables
		System.out.println("El producto de todas las variables es: " + (x*y*m*n));
		
		System.out.println("\nFin del ejercicio 3");
			
		
	}

}
