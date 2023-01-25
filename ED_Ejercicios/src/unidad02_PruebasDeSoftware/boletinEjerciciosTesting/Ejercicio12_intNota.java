package boletinEjerciciosTesting;
import java.util.Scanner;

public class Ejercicio12_intNota {

	public static void main(String[] args) {
		/*Tenemos un método public static void aprobado(int nota)
Que recibe una nota de un alumno, e imprime por pantalla si el alumno 
ha aprobado o no. Escribir las clases de equivalencia de dicho método,
 teniendo en cuenta que las notas de los alumnos en FP van desde el 1 al 10, 
 incluyendo ambos números. Elabora el Junit los test para 
 probar dichas clases de equivalencia.*/

Scanner s = new Scanner(System.in);
int nota;
System.out.println("¿Qué nota has sacado?");
nota = s.nextInt();
	if(nota<5 && nota >= 0 ){
		System.out.println("Has suspendido.");
	}else {
		switch (nota) {
		case 5:
			System.out.println("Tienes un suficiente.");
		break;
		case 6:
			System.out.println("Tienes un bien.");
		break;
		case 7:
			System.out.println("Tienes un notable");
			break;
		case 8:
			System.out.println("Tienes un notable casi alto.");
			break;
		case 9: 
			System.out.println("Tienes un notable alto.");
			break;
		case 10:
			System.out.println("¡Has sacado un sobresaliente!");
			break;
			default:
				System.out.println("Valor no valido.");
				break;
				
		}
	
		
		
		
	}
	}

}
