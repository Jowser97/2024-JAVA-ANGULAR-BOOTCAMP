package TA9Herencia_Ej05_Aula;

public class estudiante extends persona {
	
	public double calificacion;

	public estudiante() {
		super();
		this.calificacion = 0;
	}

	public estudiante(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}
	
	

}
