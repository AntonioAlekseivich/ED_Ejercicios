package boletinJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Ejercicio01Test {

	@Test
	void test() {
		assertEquals(Ejercicio01.contar(7,9),"7,8,9");
		
		//No hay numeros entre 7 y 8, sin embargo devuelve "1,2" en vez de la cadena vacia
		//Arreglado añadiendo un if al codigo
		assertEquals(Ejercicio01.contar(7,8),"");
		
		assertEquals(Ejercicio01.contar(1,2),"");
		
		//Cuando el valor desde es mayor que hasta, si que devuelve la cadena vacia.
		assertEquals(Ejercicio01.contar(2,1),"");
		
		assertEquals(Ejercicio01.contar(10,1),"");
		
		assertEquals(Ejercicio01.contar(1,10),"1,2,3,4,5,6,7,8,9,10");
		
		assertEquals(Ejercicio01.contar(-5,3),"-5,-4,-3,-2,-1,0,1,2,3");
	}

}
