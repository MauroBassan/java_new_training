package esercizio;

import java.io.EOFException;
import java.util.Scanner;

import eccezioni.AgeException;

public class Cinema2 extends Persona2{

	String message;
	boolean xxx;
	String cexit;
	Scanner sc = new Scanner(System.in);

	public void ControlloEt�() throws AgeException, EOFException  {

		
		if(getEt�() < 18) throw new AgeException(getNome() + " Sei troppo piccolo per entrare " + getEt�() 
		+ " In questo cinema "); 
		if(getEt�() > 90) throw new EOFException(getNome() + " Sei troppo grande per entrare " + getEt�() 
		+ " In questo cinema "); 

		else System.out.println(" Benvenuto!! Buon Divertimento");

	}

	public boolean tipocinema() {

		xxx= sc.nextBoolean();
		if (xxx==true){
			System.out.println("****BENVENUTO NEL CINEMA A LUCI ROSSE***");
		} else 
			System.out.println("***BENVENUTO NEL CINEMA***");
		return xxx;
	}
	
	public  void Modifica() {
		setNome(sc.nextLine());
		setEt�(sc.nextInt());
		
		
		
	}
	public  void Cancellazzione() {
		System.out.println("sono il metodo cancellazzione");
		
	}
	
	public void Controllouscit�() {
		System.out.println("Vuoi tornare al men� principale ? si / no");
		cexit= sc.nextLine();
		
				
	}
}
		
		
	



