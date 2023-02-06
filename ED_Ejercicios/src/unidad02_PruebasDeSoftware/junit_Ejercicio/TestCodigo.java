package junit_Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCodigo {

	@Test
	void testSumarPositivos() {
		assertEquals(Codigo.resta(10,4),5);
	}
	@Test
	void edad() {
		assertEquals(Codigo.mayorDeEdad(21),true);
	}

}
