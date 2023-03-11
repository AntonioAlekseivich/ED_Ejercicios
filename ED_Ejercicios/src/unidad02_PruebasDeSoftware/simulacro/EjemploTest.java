package simulacro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import boletinEjerciciosTesting.esPrimo.esPrimo;

class EjemploTest {

@Test	
void noEntraEnNada() {
		assertEquals(Ejemplo.printFactor(2, 0, 1),"");
	}

@Test	
void entraSoloEnElPrimero() {
		assertEquals(Ejemplo.printFactor(2, 1, 1),"2");
	}

@Test
void entraEnElSegundo() {
	assertEquals(Ejemplo.printFactor(2, 2, 1),"2^2");
}
@Test
void entraEnElTerceroPeroNoEnElSegundo() {
	assertEquals(Ejemplo.printFactor(2, 1, 2),"2*");
}

@Test
void entraEnTodo() {
	assertEquals(Ejemplo.printFactor(2, 2, 2),"2^2*");
}
}
