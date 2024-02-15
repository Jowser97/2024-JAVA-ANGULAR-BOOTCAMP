package TA2;

public class Ej02ClaseInteger1 {

	public static void main(String[] args) {

		//Creación de un objeto Integer usando el segundo constructor
		//Integer num1=new Integer(125); //int

		//Cuando creamos una variable, según el tipo que sea
		//ponemos el comando tipo en MINUS

		//Creamos variable de tipo int, llamada num1, con valor de 125
		int num1 = 125; //Creada
		
		System.out.println("La primera variable vale: " +num1);
		
		num1 = 50; //Modificada
		
		System.out.println("Al modificarla, el nuevo valor es de: " +num1);

		//Creación de un objeto Integer usando el primer constructor 
		//Integer num2=new Integer(20); --> como está obsoleto, lo creamos a continuacion:
		
		int num2 = 20;
		System.out.println("El valor de la segunda variable es: " +num2);

		//Obtención del entero que almacena cada objeto Integer.
		//Si no se hace esto. las lineas siguientes causarian error de compilacion

		String n3 = "125";
		int num3=Integer.parseInt(n3); 
		//Hemos transformado el valor .txt 125 del string num3
		//a una variable tipo int, llamada n3, con el valor del string anterior.
		//Hemos cambiado el método por cuestiones de compatibilidad de Java

		//int n2=num2.intValue(); --> lo vamos a obviar, porque no aporta al ejericio;
		//la variable int num2 ya tiene un valor entero correcto

		System.out.println("\nSuma de " +num1+ " (primera variable) + "
                +num2+ " (segunda variable) = " +(num1+num2));

		/*if(n1+n2>130);
			n1++;
		else
			n1--;
			System.out.println(n1); --> de momento obviamos bucles*/
    }
	
}