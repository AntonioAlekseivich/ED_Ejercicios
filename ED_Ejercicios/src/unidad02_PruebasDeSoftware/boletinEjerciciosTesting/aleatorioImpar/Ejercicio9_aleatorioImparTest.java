package boletinEjerciciosTesting.aleatorioImpar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import boletinEjerciciosTesting.esPrimo.esPrimo;

class aleatorioImpar_metodo {

	@Test
	void aleatorioImpar() {
		assertEquals(esPrimo.esPrimo(7),true);
	}

}
