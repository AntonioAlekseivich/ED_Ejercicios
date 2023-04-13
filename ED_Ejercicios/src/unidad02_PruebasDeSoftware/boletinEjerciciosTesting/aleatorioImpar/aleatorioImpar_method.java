package boletinEjerciciosTesting.aleatorioImpar;
import java.util.Random;

public class aleatorioImpar_method {
	
//comentario para subir commit y guardar el token, no lo guarde en secure store
private static int metodoAleatorioImpar(int numero1, int numero2) {

	

	Random numeroAleatorio = new Random();

	

	int numeroGenerado = 0;

	if (numero1 + 10 > numero2)

		numeroGenerado = -1;

	else {

		while (numeroGenerado % 2 == 0) {

		numeroGenerado = numeroAleatorio.nextInt((1 + numero1), numero2) + 1;

		}

	}

	return numeroGenerado;
}
}


