package boletinJunit.Ejercicio02y03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class Ejercicio02Test {
//cobertura de caminos
	@Test
	void entraTodo() {
		assertEquals(Ejercicio02.contarVocales("Cuatro"),3);
	}
	@Test
	void noEntra() {
		assertEquals(Ejercicio02.contarVocales(""),0);
	}
	@Test
	void entraPocoAPoco(){
			assertEquals(Ejercicio02.contarVocales("ba"),1);
	}	
//cobertura de sentencias
	@Test
	void entraTodoDeUna() {
		assertEquals(Ejercicio02.contarVocales("Cuatrocientos"),6);
	}

}
