package boletinJunit.Ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Ejercicio04Test {

	@Test
	void Ejercicio04() {
		//es falso seguro
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(7,8),false);
		//es true seguro
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(1,6),true);
		//valor limite false
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(1,5),false);
		//el segundo es menor que el primero y es true
		//Si el primero es mayor da error, se puede corregir poniendo un (|| -5)
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(10,5),true);
		//si el primero es negativo
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(-3,2),true);
		//si el segundo es negativo
		assertEquals(Ejercicio04.siHayDiferenciaDeCincoEntre(3,-2),true);
		//
	}

}
