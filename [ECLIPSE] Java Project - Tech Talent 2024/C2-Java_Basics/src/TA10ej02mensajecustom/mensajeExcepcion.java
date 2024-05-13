package TA10ej02mensajecustom;

public class mensajeExcepcion extends Exception {

	public mensajeExcepcion() {
		super(); 
	}
	
	public String getMessage() {
		return "Esto es un obejeto Exception";
	}

}
