	package TA9Herencia_Ej05_Aula;

public class estudiante extends persona {
	
	public int calificacion;

	public estudiante() {
		super();
		this.calificacion = generarCalificacion();
	}

	public estudiante(String nombre, int edad, Sexo sexo, int calificacion) {
		super(nombre, edad, sexo);
		if (calificacion < 0) {
			this.calificacion = 0;
		} else if (calificacion > 10) {
			this.calificacion = 10;
		} else {
			this.calificacion = calificacion;
		}
	}

	public estudiante(String nombre, int edad, Sexo sexo) {
		super(nombre, edad, sexo);
		this.calificacion = generarCalificacion();
	}

	public int generarCalificacion() {
		return (int) (1 + Math.random() * 10);
	}

	@Override
	public boolean estaAusente() {
		int random = (int) (Math.random() * 5);
		return (random == 0);
	}

	public int getNota() {
		return calificacion;
	}

	public void setNota(int nota) {
		this.calificacion = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nota=" + calificacion + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}