package TA9HerenciaEnJava.Ej01;

public class television extends electrodomestico {

	private final double resolucionDefault = 20.0;
	private final boolean sintonizadorTdtDefault = false;

	private double resolucion = resolucionDefault;
	private boolean sintonizadorTdt = sintonizadorTdtDefault;

	// Constructor por defecto
	public television() {
		super();
		this.resolucion = resolucionDefault;
		this.sintonizadorTdt = sintonizadorTdtDefault;
	}

	// Constructor precio y peso, resto por defecto
	public television(double precioBase, double peso) {
		super(precioBase, peso);
		this.color = colorDefault;
		this.consEnerg = consEnergiaDefault;
		this.resolucion = resolucionDefault;
		this.sintonizadorTdt = sintonizadorTdtDefault;
		// TODO Auto-generated constructor stub
	}

	// Constructor con resolucion, sintonizador tdt y los heredados de superclass
	public television(double precioBase, String color, char consEnerg, double peso, double resolucion,
			boolean sintonizadortdt) {
		super(precioBase, color, consEnerg, peso);
		this.sintonizadorTdt = sintonizadortdt;
		this.resolucion = resolucion;
		// TODO Auto-generated constructor stub
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}

	public void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}

	@Override
	public double precioFinal() {
		double precio = super.precioFinal();

		if (this.sintonizadorTdt = true) {
			precio += 50;
		}

		if (this.resolucion > 40) {
			precio *= 1.30;
		}

		return precio;

	}
}
