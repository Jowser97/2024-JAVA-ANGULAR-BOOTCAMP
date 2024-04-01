package TA9Herencia_Ej05_Aula;

public class MainApp {

	public static void main(String[] args) {

		profesor prof1 = new profesor("Juan", 35, Sexo.H, Materia.matematicas);
		profesor prof2 = new profesor("Cristina", 50, Sexo.M, Materia.filosofia);
		profesor prof3 = new profesor("Luis", 45, Sexo.H, Materia.fisica);

		estudiante estudiante1 = new estudiante("Andrés", 20, Sexo.H);
		estudiante estudiante2 = new estudiante("Beatriz", 20, Sexo.M);
		estudiante estudiante3 = new estudiante("Crisian", 20, Sexo.H);
		estudiante estudiante4 = new estudiante("Dioinsia", 20, Sexo.M);
		estudiante estudiante5 = new estudiante("Eustaquio", 20, Sexo.H);
		estudiante estudiante6 = new estudiante("Fátima", 20, Sexo.M);
		estudiante estudiante7 = new estudiante("Gervasio", 20, Sexo.H);
		estudiante estudiante8 = new estudiante("Herminia", 20, Sexo.M);
		estudiante estudiante9 = new estudiante("Ismael", 20, Sexo.H);
		estudiante estudiante10 = new estudiante("Julia", 20, Sexo.M);

		estudiante[] estudiantes = { estudiante1, estudiante2, estudiante3, estudiante4, estudiante5, estudiante6, estudiante7, estudiante8, estudiante9,
				estudiante10 };

		aula aula1 = new aula(1, 10, Materia.matematicas,(estudiante[]) estudiantes, (profesor) prof1);
		aula aula2 = new aula(2, 10, Materia.filosofia,(estudiante[]) estudiantes, (profesor) prof2);
		aula aula3 = new aula(3, 10, Materia.fisica,(estudiante[]) estudiantes, (profesor) prof3);
		aula aula4 = new aula(4, 10, Materia.fisica,(estudiante[]) estudiantes, (profesor) prof1);
		
		aula1.entregarNotas();
		aula2.entregarNotas();
		aula3.entregarNotas();
		aula4.entregarNotas();
	}



}