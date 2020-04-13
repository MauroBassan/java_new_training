package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class TestConnessioneDB {

	public static void main(String[] args) {
		//Connessione al DB MySql
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
		String user = "root";
		String password = "admin";
		ResultSet rs;
		Connection conn = ConnessioneDB.openConnect(driver, url, user, password);
		if(conn != null) {
			try {
				PreparedStatement ps;
				ps = conn.prepareStatement("select * from offices where country = ? and city = ?");
				ps.setString(1, "USA");
				ps.setString(2, "Boston");
				rs = ps.executeQuery();
				
				
				int conta = 0;
				while(rs.next()) {
					System.out.println("Dati...");
					conta++;
				}
				if(conta == 0)
					System.out.println("Non c'è niente da leggere o scrivere");
				
//				Statement stmt = conn.createStatement();
//				rs = stmt.executeQuery("select * from offices");
//				while(rs.next()) {
//					System.out.println("Office Code: " + rs.getString("officeCode"));
//					System.out.println("\tOffice Code: " + rs.getString(9));
//				}
			} catch (SQLException e1) {
				System.out.println("Si è verificato un errore durante la creazione di uno statement SQL"
						+ e1.getMessage());

				//
				//
				//
				//
				//
				//
				//
				try {
					conn.close();
				} catch (SQLException e) {
					System.out.println("si è verificato un errore durante la chiusura della connessione al DB: "
							+ e.getMessage());
				}
			}
		}
		else {
			System.out.println("Connessione non avvenuta");
		}
	}

}
