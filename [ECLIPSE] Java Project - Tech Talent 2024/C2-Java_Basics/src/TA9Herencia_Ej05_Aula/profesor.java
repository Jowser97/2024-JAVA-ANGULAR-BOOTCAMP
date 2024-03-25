package TA9Herencia_Ej05_Aula;

public class profesor extends persona {

	public String materia;

	public profesor() {
		super();
		this.materia = "";
	}

	public profesor(String nombre, int edad, String sexo, String materia) {
		super(nombre, edad, sexo);
		if (materia.equalsIgnoreCase("matematicas") || materia.equalsIgnoreCase("filosofia") ||
				materia.equalsIgnoreCase("fisica")) {
			this.materia = materia;
		}
		
	}
	

	
}
