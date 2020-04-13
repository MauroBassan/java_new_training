package eccezioni;

import java.io.EOFException;
import java.util.Scanner;

public class TestCinema {
	
	public static void main(String[]args) throws AgeException {
		
		Scanner sc = new Scanner(System.in);
		
		Cinema p = new Cinema();
		
		int[] ep = new int[10];
		
		
		int npe = 0;
		int npm = 0;
		int npo = 0;
		
		System.out.println("*********************");
		System.out.println("***REGISTRO CINEMA***");
		System.out.println("*********************");
		
		System.out.println("Vuoi entrare nel cinema a luci rosse ?(yes/no) " );
		p.tipocinema();
			
		
		do { System.out.println("Come ti chiami? Se nessun altro deve entrare digita stop " );
		p.nome = sc.nextLine();
		npe++;
		if(p.getNome().equalsIgnoreCase("Stop")) {
			System.out.println(" Buona Visione!!");
			break;
		}
		if (p.scelta.equalsIgnoreCase("yes")) {
		System.out.println("Quanti anni hai? ");
		p.et� = sc.nextInt();
		if(p.et� < 18)
			npm++;
		if(p.et� > 90)
			npo++;
		sc.nextLine();
		try {
		p.ControlloEt�();
		}catch(AgeException e) {
			System.out.println(" Accesso negato perche sei under 18 " + e.getMessage());
		}catch(EOFException e) {
			System.out.println(" Accesso negato perch� sei over 90 " + e.getMessage());
		}
		
		}
		
			
		
		}while(true);
		
		System.out.println("Numero di persone nel cinema : " + (npe -1));
		System.out.println("Numero di persone minorenni : " + npm);
		System.out.println("Numero di persone over 90 : " + npo);
	}


}
