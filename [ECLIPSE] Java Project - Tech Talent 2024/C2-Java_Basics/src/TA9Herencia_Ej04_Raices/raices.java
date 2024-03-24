package TA9Herencia_Ej04_Raices;

/*Crear clase raices (ecuacion de 2o grado) con atributos: a, b y c
 * se podran hacer las siguientes operaciones:
 * -getDiscrimante(), dobule (b^2)-4*a*c 
 * -tieneRaices(), booleano if discrimminante >= 0, tiene dos soluciones 
 * -tieneRaiz(), booleano if discriminante == 0, una unica solucion
 * -calcular(),  mostrara el resultado de la ecuacion
 * -obtenerRaices(), imprime las dos soluciones
 * -obtenerRaiz(), imprime una unica raiz
 */

public class raices {

	private double a;
	private double b;
	private double c;

	public raices() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}

	public raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getDiscriminante() {
		return (Math.pow(b, 2)-4*a*c);
	}
	
	public boolean tieneRaices() {
		return getDiscriminante() >= 0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminante() == 0;
	}
	
	public void calcular() {
		if (tieneRaiz()) {
			double discriminante = getDiscriminante();
			double raiz1 = (-b + Math.s)
		}
	}
	
	

}
