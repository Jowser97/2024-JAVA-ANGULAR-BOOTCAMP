package TA9Herencia_Ej05_Aula;

public class persona {
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	public persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
	}

	public persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
