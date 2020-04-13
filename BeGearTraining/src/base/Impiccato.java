package base;

import java.util.Scanner;

public class Impiccato {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Giocatore 1, inserisci la parola che vuoi far indovinare: ");
		String parolaDaIndovinare = sc.nextLine();
		char[] array = new char [parolaDaIndovinare.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = parolaDaIndovinare.charAt(i);
		}
		char[] array2 = new char [parolaDaIndovinare.length()];
		char[] array3 = new char [parolaDaIndovinare.length()];
		String parola;
		
		for(int i = 0; i < array3.length; i++) {
			array3[i] = '_';
		}
		for(int i = 0; i < array2.length; i++) {
			array2[i] = '*';
		}
		do {
			System.out.println("Inserisci la parola che devi indovinare:");
			parola = sc.nextLine();
			for(int i = 0; i < parola.length(); i++) {
				array2[i] = parola.charAt(i);
				if(array2[i] == array[i]) {
					array3[i] = array[i];
				}
				
					
			}
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[j]);
			}
		}while(!parola.equalsIgnoreCase(parolaDaIndovinare));
		System.out.println("Hai indovinato!");
	}
	

}
