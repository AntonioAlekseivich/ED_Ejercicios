package practica_para_examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepasoExamenTest {

	@Test
	void caso1() {	
		assertEquals(RepasoExamen.precioProducto(-1,false),null);
	}
	@Test
	void caso2() {	
		assertEquals(RepasoExamen.precioProducto(0,true),0);
	}
	@Test
	void caso3() {	
		assertEquals(RepasoExamen.precioProducto(1000,true),900);
	}
	@Test
	void caso4() {	
		assertEquals(RepasoExamen.precioProducto(2000,false),1800);
	}
	

}
