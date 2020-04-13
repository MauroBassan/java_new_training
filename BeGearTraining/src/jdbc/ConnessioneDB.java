package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnessioneDB {
	
	public static Connection openConnect(String driver, String url, String user, String password) {
		Connection connection = null;
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		System.out.println("*** CONNESSIONE AL DATABASE AVVENUTA CORRETTAMENTE ***");
		} catch (ClassNotFoundException e) {
			System.out.println("Si è verificato un errore durante il caricamento del "
					+ "driver per la lettura del DB: " + e.getMessage());
		}catch(SQLException e) {
			System.out.println("Si è verificato un errore durante l'apertura della connessione al"
					+ " DB" + e.getMessage());
		}finally {
			return connection;
		}
		
	}
	

}
