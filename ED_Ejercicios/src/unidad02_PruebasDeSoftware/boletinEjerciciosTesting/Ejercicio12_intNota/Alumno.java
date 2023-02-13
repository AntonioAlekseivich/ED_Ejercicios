package boletinEjerciciosTesting.Ejercicio12_intNota;
/*
 * Metodo escrito por mi y probado
 * 
public class Alumno {
	
	public static boolean aprobado(int nota) {
		
		if (nota >=5 && nota <= 10) {
			return true;
		} else {
			return false;
		}
	}*/

public class Alumno {//Metodo escrito en clase
	
	/*Para testearlo he tenido que comentar una buena parte del codigo y modificar el metodo.
	 * 
    int nota;
	    

	    public Alumno(int nota) {
	        super();
	        this.nota = nota;
	    }

	    public int getNota() {
	        return nota;
	    }

	    public void setNota(int nota) {
	        this.nota = nota;
	    }
	    */
    
	    public static boolean estoyAprobado(int nota) {//agregado el receptor int nota y static a boolean
	        boolean aprobado=true;
	        if(nota<5)
	            aprobado=false;
	        return aprobado;
	    }
	}


