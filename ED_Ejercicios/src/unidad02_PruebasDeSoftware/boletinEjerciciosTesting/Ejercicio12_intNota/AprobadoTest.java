package boletinEjerciciosTesting.Ejercicio12_intNota;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class AprobadoTest {

	@Test
	void aprobado() {//Como en el metodo hecho en clase true esta por defecto, 11 lo devuelve como true, en el mio se devuelve false.
		assertEquals(Alumno.estoyAprobado(7),true);
		
		assertEquals(Alumno.estoyAprobado(10),true);
		
		assertEquals(Alumno.estoyAprobado(5),true);
		
		assertEquals(Alumno.estoyAprobado(4),false);
		
		assertEquals(Alumno.estoyAprobado(2),false);
		
		assertEquals(Alumno.estoyAprobado(11),true);
		
		assertEquals(Alumno.estoyAprobado(-1),false);
	}

}
