package boletinEjerciciosTesting.esPrimo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class esPrimoTest {
		@Test
		void esPrimo() {
			assertEquals(esPrimo.esPrimo(7),true);
			assertEquals(esPrimo.esPrimo(8),false);
			assertEquals(esPrimo.esPrimo(0),false);
			assertEquals(esPrimo.esPrimo(1),false);
			assertEquals(esPrimo.esPrimo(4),false);
			assertEquals(esPrimo.esPrimo(245),false);
	}
}


