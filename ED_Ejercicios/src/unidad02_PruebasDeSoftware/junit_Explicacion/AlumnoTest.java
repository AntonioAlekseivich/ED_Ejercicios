package junit_Explicacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlumnoTest {

	@Test
	void testNotaCualitativaPepe() {
		Alumno pepe = new Alumno(4);
		assertEquals(pepe.notaCualitativa(),"Suspenso");
		}
	
		@Test
		void testNotaCualitativaJaime() {
		
		Alumno jaime = new Alumno(5);
		assertEquals(jaime.notaCualitativa(),"Bien");
		}
		
		@Test
		void testNotaCualitativaJorge() {
		
		Alumno jorge = new Alumno(6);
		assertEquals(jorge.notaCualitativa(),"Bien");
		}
		@Test
		void testNotaCualitativaClaudio() {
		
		Alumno claudio = new Alumno(7);
		assertEquals(claudio.notaCualitativa(),"Notable");
		}
		@Test
		void testNotaCualitativaEustaquio() {
		
		Alumno eustaquio = new Alumno(9);
		assertEquals(eustaquio.notaCualitativa(),"Sobresaliente");
		}
		@Test
		void testNotaCualitativaFantasma() {
		
		Alumno fantasma = new Alumno(12);
		assertEquals(fantasma.notaCualitativa(),"Error");
		}
	}


