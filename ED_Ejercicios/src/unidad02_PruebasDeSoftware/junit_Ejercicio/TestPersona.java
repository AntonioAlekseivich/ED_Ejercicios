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

}
