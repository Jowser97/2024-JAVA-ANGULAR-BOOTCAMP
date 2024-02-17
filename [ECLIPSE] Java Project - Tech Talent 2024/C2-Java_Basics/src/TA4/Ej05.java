package TA4;

public class Ej05 {

	public static void main(String[] args) {
		/*Programa java que declare cuatro variables enteras A, B, C y D y
		asignale un valor a cada una.*/
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		/*A continuacion realiza las instrucciones necesarias para que:
		B tome el valor de C
		C tome el valor de A
		A tome el valor de D
		D tome el valor de B*/
		
		//ahora el orden seria a=1 b=2 c=3 d=4
		
		// b toma el valor de c (b = 3)
		b = c;

		//a=1 b=3 C=3 d=4
		
		// c toma el valor de a (c = 1)
		c = a;
		
		//a=1 b=3 c=1 d=4
		
		// a toma el valor de d (a = 4)
		a = d;
		
		//a=4 b=3 c=1 d=4
		
		// d toma el valor de b (d = 2)
		d = b;
		
		//a=4 b=3 c=1 d=3
		
		/*Aqui he intercambiado los valores, ahora voy a mostrarlos en consola y 
		el orden deberia ser 4 3 1 3*/
		System.out.println("Los nuevos datos son: \n" + a + "\n" +
		b + "\n" + c + "\n" + d);

		
		/*Hay que tener en cuenta que no se intercambian las variables, si no que,
		se transforman, y esta transformacion es secuencial*/
		
	}

}
