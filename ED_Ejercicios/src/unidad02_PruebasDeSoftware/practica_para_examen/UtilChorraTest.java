package practica_para_examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilChorraTest {
//saludarPersona
	//Casos válidos
		@Test
		void testSaludarPersonaCasos1_7() {	
			assertEquals(utilChorra.saludarPersona(13,"Pepe"),"Buenas tardes Pepe");
		}
		@Test
		void testSaludarPersonaCasos2_7() {	
			assertEquals(utilChorra.saludarPersona(2,"Pepe"),"Hola Pepe");
		}
		@Test
		void testSaludarPersonaCasos3_7_Primero() {	
			assertEquals(utilChorra.saludarPersona(20,"Pepe"),"Hola Pepe");
		}
		@Test
		void testSaludarPersonaCasos3_7_Segundo() {	
			assertEquals(utilChorra.saludarPersona(23,"Pepe"),"Hola Pepe");
		}
		
	//Casos no válidos
		@Test
		void testSaludarPersonaCasos4_7() {	
			assertEquals(utilChorra.saludarPersona(-2,"Juan"),null);
		}
		@Test
		void testSaludarPersonaCasos5_7() {	
			assertEquals(utilChorra.saludarPersona(25,"Juan"),null);
		}
		@Test
		void testSaludarPersonaCasos2_6() {	
		assertEquals(utilChorra.saludarPersona(13, null),null);
	}

//potenciaConBucles
		@Test
		void testExponenteCero() {//No entra en nada
			assertEquals(utilChorra.potenciaConBucles(1, 0), 1);
			
		}
		@Test
		void testExponenteUno() { //Primer if
			assertEquals(utilChorra.potenciaConBucles(1, 1), 1);
			
		}
		@Test
		void testExponenteMayorQueUno() { //Primer if mas bucle
			assertEquals(utilChorra.potenciaConBucles(1, 2), 1);
			
		}
		@Test
		void testExponenteMenosUno() { //Segundo if
			assertEquals(utilChorra.potenciaConBucles(1, -1), 1);
			
		}
		@Test
		void testexponenteNegativoMenorQueMenosUno() { //Segundo if mas segundo bucle
			assertEquals(utilChorra.potenciaConBucles(1, -2), 1);
			
		}	
}
