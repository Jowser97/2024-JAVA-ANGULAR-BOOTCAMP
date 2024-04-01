package TA9Herencia_Ej05_Aula;

public class profesor extends persona {

	public Materia materia;

	public profesor() {
		super();
		this.materia = Materia.matematicas;
	}

	public profesor(String nombre, int edad, Sexo sexo, Materia materia) {
		super(nombre, edad, sexo);
		this.materia = materia;
	}

	@Override
	public boolean estaAusente() {
		int random = (int) (Math.random() * 2);
		return (random == 0);
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

}
