package boletinEjerciciosTesting.esPrimo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class esPrimoTest {
		@Test
		void esPrimo7() {
			assertEquals(esPrimo.esPrimo(7),true);
			
	}
		@Test
		void esPrimo1() {
			assertEquals(esPrimo.esPrimo(1),false);
			
	}	@Test
		void esPrimo6() {
		assertEquals(esPrimo.esPrimo(6),false);
		
}
	@Test
	void esPrimo0() {
	assertEquals(esPrimo.esPrimo(0),false);
	
}@Test
	void esPrimo4() {
	assertEquals(esPrimo.esPrimo(4),false);
	
}
}


