package TA9Herencia_Ej05_Aula;

import java.util.Arrays;

public class aula {

	private int id;
	private int maxEstudiantes;
	private Materia materia;
	private estudiante[] alumnos;
	private profesor profesor;

	public aula() {
		this.id = 0;
		this.maxEstudiantes = 10;
		this.materia = Materia.matematicas;
		this.alumnos = new estudiante[this.maxEstudiantes];
		this.profesor = null;
	}

	public aula(int id, int maxEstudiantes, Materia materia, profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.alumnos = new estudiante[maxEstudiantes];
		this.profesor = profesor;
	}

	public aula(int id, int maxEstudiantes, Materia materia,
					estudiante[] alumnos, profesor profesor) {
		this.id = id;
		this.maxEstudiantes = maxEstudiantes;
		this.materia = materia;
		this.alumnos = alumnos;
		this.profesor = profesor;
	}

	public boolean darClase() {
		return ((!this.profesor.estaAusente()) && (this.profesor.getMateria() == this.materia)
				&& (alumnosDisponibles()));
	}

	public boolean alumnosDisponibles() {
		int count = 0;
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i].estaAusente()) {
				count++;
			}
		}

		return (count < (this.alumnos.length / 2));
	}

	public void entregarNotas() {
		if (darClase()) {
			int hombresAprobados = 0, mujeresAprobadas = 0;
			for (int i = 0; i < this.alumnos.length; i++) {
				if (this.alumnos[i].getSexo() == Sexo.H) {
					if (this.alumnos[i].getNota() >= 5) {
						hombresAprobados++;
					}
				} else {
					if (this.alumnos[i].getNota() >= 5) {
						mujeresAprobadas++;
					}
				}

			}
			System.out.println("Hombres aprobados: " + hombresAprobados);
			System.out.println("Mujeres aprobadas: " + mujeresAprobadas + "\n");
		} else {
			System.out.println("No se ha podido dar clase\n");
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMaxEstudiantes() {
		return maxEstudiantes;
	}

	public void setMaxEstudiantes(int maxEstudiantes) {
		this.maxEstudiantes = maxEstudiantes;
	}

	public Materia materia() {
		return materia;
	}

	public void materia(Materia materia) {
		this.materia = materia;
	}

	public estudiante[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(estudiante[] alumnos) {
		this.alumnos = alumnos;
	}

	public profesor profesor() {
		return profesor;
	}

	public void profesor(profesor profesor) {
		this.profesor = profesor;
	}

	@Override
		public String toString() {
			return "Aula [id=" + id + ", maxEstudiantes=" + maxEstudiantes +
					", materia=" + materia + ", alumnos=" + Arrays.toString(alumnos) +
					", profesor=" + profesor + "]";
	}
	
}
