package boletinJunit.Ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Ejercicio04Test {

	@Test
	void Ejercicio04() {
		//de camino
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(1,2),false);
		
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(1,6),true);
		//de sentencias
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(11,16),true);

		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(3,1),false);
	}

}
