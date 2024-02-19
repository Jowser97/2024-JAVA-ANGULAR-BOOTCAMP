package TA5;

public class Ex01DOWHILE {

	public static void main(String[] args) {
		/*Ejercicio: escribe un programa que imprima toda la tabla de multiplicar del 5
		(desde 0 hasta 10). Con metodo while*/
		
		System.out.println("Tabla de multiplicar del 5.\n");
		
		int n = 0;
		
		do {
			int prod = 5;
			System.out.println(prod + " * " + n + " = " + (prod*n));
			++n;
		}while(n<=10);
		
	}

}
