package com.jose.C4_backend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcSumaRestaMult {

	static double op1;
	static double op2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		op1 = 3;
		op2 = 2;

	}

	@Test
	void testSuma() {

		double esperado = 5;
		double calculado = op1 + op2;
		assertEquals(esperado, calculado);
	}
	
	@Test
	void testResta() {
		
		double esperado = 1;
		double calculado = op1 - op2;
		assertEquals(esperado, calculado);
	}
	
	@Test
	void testMultiplicacion() {
		double esperado = 6;
		double calculado = op1 * op2;
		assertEquals(esperado, calculado);
		
	}
}
