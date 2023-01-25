package boletinEjerciciosTesting;

import java.util.Scanner;

public class Ejercicio9_aleatorioImpar {

	public static void main(String[] args) {

		/*
		 * Desarrolla en java un método estático llamado aleatorioImpar , que reciba
		 * como parámetros dos números enteros y cumpla los siguientes requisitos: Los
		 * parámetros recibidos deben ser enteros positivos. El primer parámetro debe
		 * ser como mínimo 10 unidades menor que el segundo. Debe devolver un número
		 * impar aleatorio comprendido entre los dos parámetros que se le pasan (ambos
		 * incluidos) Si los parámetros de entrada no cumplen los requisitos anteriores,
		 * se consideran datos de entrada inválidos, y el método debe devolver -1.
		 */

		Scanner s = new Scanner(System.in);
		int numero1;
		int numero2;
		int numeroDevuelto;

		while (true) {// abrimos un bucle para correr el codigo constantemente

			System.out.println("Dime el primer numero");// pedimos el primer numero
			numero1 = s.nextInt();

			if (numero1 < 0) {// comprobamos que no sea negativo
				System.out.println("-1");
				continue;

			} else {
				System.out.println("Introduzca el segundo numero");// pedimos el segundo numero
				numero2 = s.nextInt();

				if (numero2 - 10 < numero1 || numero2 < 0) {// comprobamos que sea como minimo 10 unidades mayor que el
															// 1
					System.out.println("-1"); // Y que sea positivo

				} else {// si se dan esas 2 condiciones:
					do {
						numeroDevuelto = (int) (Math.random() * (numero2 - numero1) + numero1);// atribuimos un numero
																								// aleatorio comprendido
																								// entre esos 2

					} while (numeroDevuelto % 2 == 0);// hasta que ese nº sea impar
					System.out.println("Un numero primo entre esos dos numeros es:" + numeroDevuelto);// entonces lo
																										// imprimimos
				}
			}
		}

	}
}
