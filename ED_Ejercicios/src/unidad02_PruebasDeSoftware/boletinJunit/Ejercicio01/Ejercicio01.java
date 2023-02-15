package boletinJunit.Ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {

		System.out.print(contar(1,1));//Queremos pintar un cuadrado de tamaño 5

	}

	/**
	 * El siguiente metodo devuelve un String con los numeros que hay entre el parametro desde y hasta,
	 * separados por comas, por ejemplo 2,3,4.
	 * Si no hay ningun número entre ambos números, devuelve la cadena vacía.
	 *
	 * @param desde indica el numero por el que se empieza a contar
	 * @param hasta indica el numero hasta el que se quiere contar
	 */

	public static String contar(int desde, int hasta) {
		String resultado="";
		
		if(desde != hasta-1) {//En caso de que no sean consecutivos
			
			for(int i=desde;i<=hasta-1;i++) {
				resultado+=i+",";
			}
			if(desde<=hasta)//En el caso de que hay numeros entre ambos parametros
				resultado+=hasta;
			return resultado;
		} else {
			return resultado;
		}
		//La cobertura de sentencias seria una prueba para cada return
		
		//La de caminos una para cada caso de equivalencia??
	}
}


