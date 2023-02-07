package junit_Ejercicio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestPersona {

	@Test
	void cumplirAnio() {
		Persona española = new Persona();
		española.cumplirAnio();
		assertEquals(española.getEdad(),1);
	}

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
}
