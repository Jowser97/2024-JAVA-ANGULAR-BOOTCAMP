package TA4;

public class Ej02 {

	public static void main(String[] args) {
		int n = 20;
		double a = 15.5;
		char c = '2';
		
		System.out.println("El valor de n es igual a " +n);//valor de la variable n
		System.out.println("El valor de a es igual a " +a);//valor de la variable a 
		System.out.println("EL caracter de la variable c es " +c);
		
		double sumaNA=n+a;//invoco una variable nueva para la suma de n+a
		double diferenciaNA=n-a;//invoco una variable nueva para la resta de n-a
		
		System.out.println("La suma de los valores n y a es igual a " +sumaNA);//suma de n+a
		System.out.println("La diferencia de los valores n y a es igual a " +diferenciaNA);//diferencia de n-a
		
		int valorNumC=(int)c;//convierto el caracter c en un valor numerico o int
		
		System.out.println("El caracter de c es " +c+ ", expresado anteriormente, "
				+ "y su valor numerico es " +valorNumC);//aqui indico cual es el caracter de c y su valor numerico
	}

}
