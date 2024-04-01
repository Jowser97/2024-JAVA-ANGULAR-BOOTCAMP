package TA9Herencia_Ej05_Aula;

public abstract class persona {
	
	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	
	public persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = Sexo.H;
	}

	public persona(String nombre, int edad, Sexo sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public abstract boolean estaAusente();

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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
}
