package TA5;

import java.util.Scanner;

public class EjTA5_Parte_1 {

	public static void main(String[] args) {
		
		//Ej01 Declara 2 variables numericas, e indica cual es mayor de los dos.
		
		int num1 = 1;
		int num2 = 2;
		
		//En consola imprimira un boolean segun si es verdadero o falso
		
		System.out.println(num1>num2);	//1 es mayor que 2: false
		System.out.println(num1<num2);	//1 es menor que 2: true
		System.out.println(num1!=num2); //1 es difente que 2: true
		System.out.println(num1==num2); //1 es igual a 2: false
		System.out.println(num1<=num2); //1 es inferior o igual a 2: true
		System.out.println(num1>=num2); //1 es superior o igula a 2: false
		
		/*Ej02 Declara un string que contenga tu nombre, despues muestra un mensaje
		de bienvenida por consola*/
		
		
		Scanner sc = new Scanner(System.in); //Abro el permiso para escribir en consola
		
		String nombre = "jose"; //Declaro string con mi nombre
		
		System.out.println("Bienvenido");
		
		
		sc.close();
		
		
		
		
	}

}
