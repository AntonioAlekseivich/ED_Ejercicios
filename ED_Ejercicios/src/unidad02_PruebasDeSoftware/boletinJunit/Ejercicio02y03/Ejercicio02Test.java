package boletinJunit.Ejercicio02y03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



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
