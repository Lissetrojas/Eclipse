package project01;

import java.util.LinkedList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Persona persona1 = new Persona("Lisset","Rojas");
	  Persona persona2 = new Persona("Edward","Sabogal");
	  Persona persona3 = new Persona("Annie","Rodriguez");
	  LinkedList<Persona> listaAuxiliar = new LinkedList<Persona>();
	  //LinkedList<Persona> listaPersonas = new LinkedList<Persona>();
	  
	  listaAuxiliar.add(persona1);
	  listaAuxiliar.add(persona2);
	  listaAuxiliar.add(persona3);
	  
	  Scanner sc = new Scanner(System.in);
	  
	  for(Persona p: listaAuxiliar){
		System.out.println("\n\rDe:");		  
	    System.out.println(p.getNombreCompleto());
	    System.out.println("Digite la direeción");
	    p.setDireccion(sc.nextLine());
	    System.out.println("Digite la telefono");
	    p.setTelefono(sc.nextLine());
	    System.out.println("Digite la correo");
	    p.setCorreo(sc.nextLine());
	  //  listaPersonas.add(p);
	  }
	  sc.close();
	  //for (Persona p: listaPersonas)
	  for (Persona p: listaAuxiliar)
	  System.out.println(p.getNombreCompleto()+" | "+p.getDireccion()+" | "+p.getTelefono()+" | "+p.getCorreo());
	}
}
