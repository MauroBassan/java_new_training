package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class TestDBConnection {

	public static void main(String[] args)  {
		Connection conn = null;
		Statement stmt;
		ResultSet rs; //prende la forma del risultato
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		String root = "root";
		String password = "admin";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, root, password);
			System.out.println("*** DB CONNESSO CORRETTAMENTE ***");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from offices");
			while(rs.next()) {
				System.out.println("Office Code: " + rs.getString("officeCode"));
				System.out.println("\tOffice Code: " + rs.getString(9));
			}
			
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

	}

}
