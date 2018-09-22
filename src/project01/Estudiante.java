package project01;

import java.util.LinkedList;

public class Estudiante extends Persona{
	LinkedList<String> Programas;
	public Estudiante(String nombre, String apellido) {
		super(nombre, apellido);
		this.Programas = new LinkedList<String>();
		
	}
	public LinkedList<String> getProgramas() {
		return Programas;
	}
	public void setProgramas(LinkedList<String> programas) {
		Programas = programas;
	}

}
