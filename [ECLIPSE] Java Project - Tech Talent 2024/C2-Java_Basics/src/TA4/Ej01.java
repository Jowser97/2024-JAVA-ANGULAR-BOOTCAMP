package TA4;

public class Ej01 {

	public static void main(String[] args) {
		
		/*Declara dos variables numericas y mostrar en consola suma, resta, multiplicación,
		division y modulo.*/
		
		int v = 10;
		int v2 = 20;
		
		System.out.println(v+v2);
		System.out.println(v-v2);
		System.out.println(v*v2);
		System.out.println(v/v2);//no se resuelve por que el valor es 0.5, la variable tendria que ser double
		System.out.println(v%v2);
	}

}
