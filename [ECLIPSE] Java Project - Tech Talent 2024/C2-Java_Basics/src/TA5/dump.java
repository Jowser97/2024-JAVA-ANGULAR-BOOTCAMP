package TA5;

public class dump {

	    public static boolean esPrimo(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int numero = 29; // Puedes cambiar el número aquí para probar
	        if (esPrimo(numero)) {
	            System.out.println(numero + " es primo.");
	        } else {
	            System.out.println(numero + " no es primo.");
	        }
	    }
	}
