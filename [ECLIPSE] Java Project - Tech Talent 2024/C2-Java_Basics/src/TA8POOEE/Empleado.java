package TA8POOEE;

/*Crea una clase llamada empleado con atributos: nombre, edad y salario
 * metodos para obtener y establecer estos atributos.
 * metodo para calcular salario anual (12 pagas)
 */

public class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado() {
		this.nombre = "";
		this.edad = 0;
		this.salario = 0.0;
	}
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Metodo para calcular salario anual
	public double salarioAnual (double salario) {
	return salario*12;	
	}
}
