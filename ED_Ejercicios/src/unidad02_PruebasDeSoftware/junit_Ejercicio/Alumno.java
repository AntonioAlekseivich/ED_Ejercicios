package junit_Ejercicio;



	public class Alumno {

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
	    
	    public boolean estoyAprobado() {
	        boolean aprobado=true;
	        if(nota<5)
	            aprobado=false;
	        return aprobado;
	    }
	    
	    public String notaCualitativa() {
	        String calificacion;
	        if (nota<5) {
	            calificacion="Suspenso";
	        } else if (nota>=5 && nota <=6) {
	            calificacion="Bien";
	        } else if (nota>6 && nota <=8) {
	            calificacion="Notable";
	        } else if (nota<=10) {
	            calificacion="Sobresaliente";
	        } else {
	            calificacion="Error";
	        }
	        return calificacion;
	    }
	}

	
