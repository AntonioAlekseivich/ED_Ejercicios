package boletinEjerciciosTesting.esPrimo;

public class esPrimo {
	
	public static boolean esPrimo(int numero) {
		
		  // El 0, 1 y 4 no son primos
		  if (numero == 0 || numero == 1 || numero == 4) {
		    return false;
		  }
		  
		  for (int x = 2; x < numero / 2; x++) {
			  
		/*no entiendo el condicional;
		 * ¿Mientras 2 sea menor a la mitad del numero?
		 * ¿Solo prueba la mitad de los numeros?
		 */
			  
		/*Para hacer la cobertura de caminos son test que entran en todos los posibles ifs y else,
		 * y la de sentencias son todas las distintas partes del codigo; pero aplicado a este codigo como sería?
		 */
			  
		    // Si es divisible por cualquiera de estos números, no
		    // es primo
		    if (numero % x == 0)
		      return false;
		  }
		  
		  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
		  return true;
		}
	
}
