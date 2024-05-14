package TA10ej05password;

import java.util.Scanner;

class password {
	private int longitud;
	private String contraseña;

	// Constructor por defecto
	public password() {
		this.longitud = 8;
		generarPassword();
	}

	// Constructor con longitud especificada
	public password(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	// Verifica si la contraseña es fuerte
	public boolean esFuerte() {
		int mayusculas = 0, minusculas = 0, numeros = 0;
		for (char c : contraseña.toCharArray()) {
			if (Character.isUpperCase(c)) {
				mayusculas++;
			} else if (Character.isLowerCase(c)) {
				minusculas++;
			} else if (Character.isDigit(c)) {
				numeros++;
			}
		}
		return (mayusculas > 2 && minusculas > 1 && numeros > 5);
	}

	// Genera una contraseña aleatoria
	public void generarPassword() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < longitud; i++) {
			int tipo = (int) (Math.random() * 3);
			switch (tipo) {
			case 0: // mayúscula
				sb.append((char) ('A' + Math.random() * 26));
				break;
			case 1: // minúscula
				sb.append((char) ('a' + Math.random() * 26));
				break;
			case 2: // número
				sb.append((char) ('0' + Math.random() * 10));
				break;
			}
		}
		contraseña = sb.toString();
	}

	// Getter para contraseña
	public String getContraseña() {
		return contraseña;
	}

	// Getter para longitud
	public int getLongitud() {
		return longitud;
	}

	// Setter para longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
		generarPassword();
	}

	// Método main corregido
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int longitud;
			while (true) {
				// Pedir longitud de los passwords
				System.out.print("Introduce la longitud de la contraseña: ");
				String input = scanner.next();
				try {
					longitud = Integer.parseInt(input);
					if (longitud <= 0) {
						throw new IllegalArgumentException("La longitud debe ser mayor que 0.");
					}
					break; // Si la longitud es válida, salir del bucle
				} catch (NumberFormatException e) {
					System.out.println("Error: Introduce un número válido.");
				} catch (IllegalArgumentException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}

			// Crear array de Passwords
			System.out.print("¿Cuantas contraseñas quieres generar?\n");
			int tamañoArray = scanner.nextInt();
			if (tamañoArray <= 0) {
				throw new IllegalArgumentException("El tamaño del array debe ser mayor que 0.");
			}
			password[] passwords = new password[tamañoArray];

			// Crear los passwords
			for (int i = 0; i < tamañoArray; i++) {
				passwords[i] = new password(longitud);
			}

			// Array de booleanos para almacenar si es fuerte o no
			boolean[] esFuerteArray = new boolean[tamañoArray];

			// Verificar si los passwords son fuertes
			for (int i = 0; i < tamañoArray; i++) {
				esFuerteArray[i] = passwords[i].esFuerte();
			}

			// Mostrar las contraseñas y si son fuertes o no
			for (int i = 0; i < tamañoArray; i++) {
				System.out.println("La contraseña es: " + passwords[i].getContraseña() + " " + esFuerteArray[i]);
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}