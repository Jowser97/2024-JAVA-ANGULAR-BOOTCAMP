package TA8POO;

/*Crear una clase PERSONA, como atributos debe tener nombre, edad, DNI, sexo, peso y altura.
 *Que no se acceda directamente a ellos.
 *Implementar varios constructores:
 *	- por defecto
 *	- nombre, edad y sexo
 *	- uno con todos los atributos
 */

public class Persona {

	private String nombre;
	private int edad;
	private String dNI;
	private String sexo;
	private double peso;
	private double altura;

	public Persona() {
		// Constructor por defecto
		this.nombre = "";
		this.edad = 0;
		this.dNI = "";
		this.sexo = "hombre";
		this.peso = 0.0;
		this.altura = 0.00;
	}

	public Persona(String nombre, int edad, String sexo) {
		this();// Para rellenar desde el constructor por defecto automaticamente
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, String dNI, String sexo, double peso, double altura) {
		// Constructor con todos los atributos
		this.nombre = nombre;
		this.edad = edad;
		this.dNI = dNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDNI() {
		return dNI;
	}

	public void setDNI(String dNI) {
		this.dNI = dNI;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
