package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.result.ResultSetFactory;
import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class TestCrudDb {
	static Connection conn;
	static String sql;
	static Scanner sc = new Scanner(System.in);
	static ResultSet rs;

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		String user = "root";
		String password = "admin";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url , user, password);
			System.out.println("*** ACCESSO AL DB AVVENUTO CORRETTAMENTE ***");

			//Implementazione dei metodi CRUD

			// Inserimento 		(C-reate)
			insertUser(conn);
			// Lettura 			(R-ead)
			readUser(conn);
			// Aggiornamento 	(U-pdate)
			updateUser(conn);
			// Cancellazione 	(D-elete)
			deleteUser(conn);

		} catch (ClassNotFoundException e) {
			System.out.println("Si è verificato un problema durante il caricamento in "
					+ "memoria del Driver di connessione al DB: " + e.getMessage());
		} catch(SQLException e) {
			System.out.println("Si è verificato un problema durante la connessione al DB: " + e.getMessage());
		}

	}

	private static void deleteUser(Connection conn) {
		System.out.println("Inserisci l'id dell'utente da eliminare");
		int aggId = sc.nextInt();
		sc.nextLine();
		sql = "delete from users where id = " + aggId;
		try {

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {

			System.out.println("Errore nella esecuzione della query delete: " + e.getMessage());
		}

	}

	private static void updateUser(Connection conn) {
		System.out.println("Inserisci l'id dell'utente da modificare");
		int aggId = sc.nextInt();
		sc.nextLine();
		System.out.println("Inserisci nuovo nome: ");
		String aggNome = sc.nextLine();
		
		System.out.println("Inserisci nuovo indirizzo: ");
		String aggAddress = sc.nextLine();
		
		System.out.println("Inserisci nuovo email: ");
		String aggEmail = sc.nextLine();
		
		System.out.println("Inserisci nuovo telefono: ");
		String aggTelefono = sc.nextLine();
		sql = ("UPDATE users SET name = '" + aggNome + "', adress = '" + aggAddress + "', email = '" + aggEmail +
				"', phone = '" + aggTelefono + "' WHERE ID = " + aggId);
        
		try {

			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);

		} catch (SQLException e) {

			System.out.println("Errore nella esecuzione della query update: " + e.getMessage());
		}
	}

	private static void readUser(Connection conn) {
		sql = "select * from users";
		try {
			rs = conn.createStatement().executeQuery(sql);
			while(rs.next()) {
				System.out.println("___________________________________");
				System.out.println("id: " + rs.getString(1));
				System.out.println("name: " + rs.getString(2));
				System.out.println("address: " + rs.getString(3));
				System.out.println("email: " + rs.getString(4));
				System.out.println("phone: " + rs.getString(5));
				
			}
		} catch (SQLException e) {
			System.out.println("Errore nella esecuzione della query read: " + e.getMessage());
		}
		

	}

	private static void insertUser(Connection conn) {
		System.out.println("Inserire la chiave per il nuovo utente");

		sql = "Insert into users 	(id, 			name, 			adress, 				email, 					phone) "
				+ "values (" + sc.nextInt() + ", 'Michael', 'Caronno Pertusella'," + "'spinellomichael@yahoo.it', '320 6919711')";
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("+++ INSERIMENTO AVVENUTO CORRETTAMENTE ***");
		} catch (SQLException e) {
			System.out.println("Errore durante la creazione dello statement sql: " + e.getMessage());
		}

	}

}
