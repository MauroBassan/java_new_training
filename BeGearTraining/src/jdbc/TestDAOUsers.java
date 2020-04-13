package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class TestDAOUsers {
	static Scanner sc = new Scanner (System.in);
	static Users user;								//DTO
	static DAOUsers dui = new DAOUsersImpl();

	public static void main(String[] args) {		//DAO

		int scelta;

		do {
			stampaMenu();

			scelta = sc.nextInt();
			sc.nextLine();
			switch(scelta) {
			case 1: inserimento();
			break;
			case 2: modifica();
			break;
			case 3: lettura();
			break;
			case 4: letturaAll();
			break;
			case 5: cancellazione();
			break;
			case 9:{
				System.out.println("*** ARRIVEDERCI ***");
				System.exit(0);
			}
			default:
				System.out.println("Scelta effettuata non valida: riprovare.");;
			}

		}while (scelta != 9);
	}
	
	public static void stampaMenu() {

		System.out.println("*** GESTIONE UTENTI ***");
		System.out.println("Specificare una delle seguenti opzioni");
		System.out.println("1. Inserimento");
		System.out.println("2. Modifica");
		System.out.println("3. Lettura");
		System.out.println("4. Lettura di tutti gli utenti");
		System.out.println("5. Cancellazione");
		System.out.println("9. Uscita");
	}

	private static void cancellazione() {
		System.out.println("Inserisci l'id dell'utente da cancellare");
		int aggId = sc.nextInt();
		sc.nextLine();
		
		try {
			dui.deleteUser(aggId);
		} catch (SQLException e) {
			System.out.println("Errore nella cancellazione dell' utente: " + e.getMessage());
		}
		
	}

	private static void letturaAll() {
		// TODO Auto-generated method stub

	}

	private static void lettura() {
			try {
			System.out.println("Specificare l'id dello user di cui si vogliono vedere i dettagli: ");
			user = dui.getUser(sc.nextInt());
			sc.nextLine();
			if(user != null) {
				user.stampaUser();
			}
		} catch (SQLException e) {
			System.out.println("Si � verificato un errore durante la lettura dell' user: " + e.getMessage());
		}

	}

	private static void modifica() {
		user = new Users();
		
		System.out.println("Specificare l'id dell'utente da modificare: ");
		user.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Specificare il nome del nuovo utente: ");
		user.setName(sc.nextLine());
		System.out.println("Specificare l'indirizzo del nuovo utente: ");
		user.setAddress(sc.nextLine());
		System.out.println("Specificare l'email del nuovo utente: ");
		user.setEmail(sc.nextLine());
		System.out.println("Specificare il telefono del nuovo utente: ");
		user.setPhone(sc.nextLine());
		try {
			dui.updateUser(user);
		} catch (SQLException e) {
			System.out.println("Errore nella modifica del nuovo utente: " + e.getMessage());
		}
	}

	private static void inserimento() {
		
		user = new Users();

		System.out.println("Specificare l'id del nuovo utente: ");
		user.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Specificare il nome del nuovo utente: ");
		user.setName(sc.nextLine());
		System.out.println("Specificare l'indirizzo del nuovo utente: ");
		user.setAddress(sc.nextLine());
		System.out.println("Specificare l'email del nuovo utente: ");
		user.setEmail(sc.nextLine());
		System.out.println("Specificare il telefono del nuovo utente: ");
		user.setPhone(sc.nextLine());
		
		try {
			dui.addUser(user);
		} catch (SQLException e) {
			System.out.println("Errore nell'inserimento del nuovo utente: " + e.getMessage());
		}
	}



}


