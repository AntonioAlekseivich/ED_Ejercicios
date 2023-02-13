package boletinJunit.Ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import boletinJunit.Ejercicio01.Ejercicio01;

class Ejercicio02Test {

	@Test
	void contarVocales() {
		assertEquals(Ejercicio02.contarVocales("Cuatrocientosveinte"),9);
		
		assertEquals(Ejercicio02.contarVocales(""),0);
		
		assertEquals(Ejercicio02.contarVocales("sdfrw"),0);
		
		assertEquals(Ejercicio02.contarVocales("329"),0);
		
		assertEquals(Ejercicio02.contarVocales("cuatro4"),3);
	}

}
