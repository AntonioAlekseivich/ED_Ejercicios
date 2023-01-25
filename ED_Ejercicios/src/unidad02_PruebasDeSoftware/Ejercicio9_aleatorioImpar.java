package unidad02_PruebasDeSoftware;
import java.util.Scanner;
public class Ejercicio9_aleatorioImpar {

	public static void main(String[] args) {
		
		/*Desarrolla en java un método estático llamado aleatorioImpar , que reciba como
		parámetros dos números enteros y cumpla los siguientes requisitos:
		Los parámetros recibidos deben ser enteros positivos.
		El primer parámetro debe ser como mínimo 10 unidades menor que el segundo.
		Debe devolver un número impar aleatorio comprendido entre los dos parámetros que se le pasan (ambos incluidos)
		Si los parámetros de entrada no cumplen los requisitos anteriores, se consideran datos de entrada inválidos, y el método debe devolver -1.*/
		
Scanner s = new Scanner(System.in);
	int numero1;
	int numero2;
	int numeroDevuelto;
	

System.out.println("Dime el primer numero");
numero1 = s.nextInt();
	if(numero1<0) {
		System.out.println("-1");

	}else {
		System.out.println("Introduzca el segundo numero");
		numero2 = s.nextInt();
		if(numero2-10 < numero1) {
			System.out.println("-1");
			
		} else {
			do{
				numeroDevuelto = (int)(Math.random()*(numero2-numero1)+numero1);
				
			} while (numeroDevuelto%2==0) ;
				System.out.println(numeroDevuelto);
			}
		}
	}

	
}

