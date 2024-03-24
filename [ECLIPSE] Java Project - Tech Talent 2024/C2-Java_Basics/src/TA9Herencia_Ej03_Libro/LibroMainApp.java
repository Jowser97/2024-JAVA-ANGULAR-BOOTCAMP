package TA9Herencia_Ej03_Libro;

//Crear dos libros, mostrarlos por pantalla e indicar cual de los dos tiene mas paginas.

public class LibroMainApp {

	public static void main(String[] args) {
		
		libro libro1 = new libro();
		libro libro2 = new libro();
		
		libro1.setAutor("Sarah J. Maas");
		libro1.setIsbn("9788408170006");
		libro1.setNumPaginas(592);
		libro1.setTitulo("Una corte de niebla y furia.");
		
		libro2.setAutor("Sarah J. Maas");
		libro2.setIsbn("9788408170006");
		libro2.setNumPaginas(592);
		libro2.setTitulo("Una corte de niebla y furia.");
		
		System.out.println(libro1.toString());

		

	}

}
