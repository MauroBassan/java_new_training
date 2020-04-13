package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class TestAccessoADBDaTastiera {

	public static void main(String[] args) throws IOException {
		Scanner tastiera = new Scanner(System.in);
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(args[0]);
		prop.load(fis);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String root = prop.getProperty("user");
		String password = prop.getProperty("password");
		Connection conn = null;
		Statement stmt;
		ResultSet rs;
		
		
//		do {
//			System.out.println("LOGIN");
//			System.out.print("user: ");
//			root = tastiera.nextLine();
//			if(root.equalsIgnoreCase("exit"))
//				System.exit(0);
//			System.out.print("\npassword: ");
//			password = tastiera.nextLine();
//			System.out.println();
//			if(!(root.equals("root") && password.equals("admin")))
//				System.out.println("User o password errati (digitare exit per uscire)");
//		}while(!(root.equals("root") && password.equals("admin")));

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, root, password);
			System.out.println("*** DB CONNESSO CORRETTAMENTE ***");			
		}catch(ClassNotFoundException e) {
			System.out.println("Driver per la connessione al DB non trovato: " + e.getMessage());
		}catch(SQLException e) {
			System.out.println("Si è verificato un errore durante la connessione al DB: " + e.getMessage());
		}finally{
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println("Si è verificato un problema durante la chiusura della connessione: "
						+ e.getMessage());
				e.printStackTrace();
			}
		}
System.out.println("*** FINE PROGRAMMA ***");
	}

}
