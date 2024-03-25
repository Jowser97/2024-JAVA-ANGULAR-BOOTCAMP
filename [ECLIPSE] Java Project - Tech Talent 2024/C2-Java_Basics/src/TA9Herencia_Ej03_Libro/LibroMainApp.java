package TA9Herencia_Ej03_Libro;

//Crear dos libros, mostrarlos por pantalla e indicar cual de los dos tiene mas paginas.

public class LibroMainApp {

	public static void main(String[] args) {

		libro libro1 = new libro();

		libro1.setAutor("Sarah J. Maas");
		libro1.setIsbn("978-8408170006");
		libro1.setNumPaginas(592);
		libro1.setTitulo("Una corte de niebla y furia");

		libro libro2 = new libro();

		libro2.setAutor("Douglas Stuart");
		libro2.setIsbn("978-843974143");
		libro2.setNumPaginas(440);
		libro2.setTitulo("Un lugar para mungo");

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas que " + libro2.getTitulo());
		} else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
			System.out.println(libro2.getTitulo() + " tiene más páginas que " + libro1.getTitulo());
		} else {
			System.out.println("Ambos libros tienen la misma cantidad de páginas.");
		}

	}

}
