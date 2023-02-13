package junit_Explicacion;

public class Persona {
	//Atributos
	private int edad;
	
	public Persona(){
		edad=0;
	}
	
	public void cumplirAnio() {
		edad++;
	}
	
	public int getEdad() {
		return edad;
	}
	
}
