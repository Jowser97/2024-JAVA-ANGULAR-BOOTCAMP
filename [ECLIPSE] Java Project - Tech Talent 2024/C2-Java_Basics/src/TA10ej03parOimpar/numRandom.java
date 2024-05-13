package TA10ej03parOimpar;

import java.util.*;

public class numRandom extends Exception {

	private int numero;
	
	public numRandom() {
		Random random = new Random();
		this.numero = random.nextInt(1000); 
	}
	

	
	public void determinarParImpar(int numero) throws NumeroParImparException {
        if (numero % 2 == 0) {
            throw new NumeroParException("El número generado es par.");
        } else {
            throw new NumeroImparException("El número generado es impar.");
        }
    }
	
	try {
		
	} catch (NumeroParException e) {
		System.out.println("El número generado es par.");
	}catch (NumeroImparException e) {
		// TODO: handle exception
	}
	
}
