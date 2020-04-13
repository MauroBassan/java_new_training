package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAOUsersImpl implements DAOUsers {

	final String url = "jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC";
	final String userdb = "root";
	final String password = "admin";
	final String driver = "com.mysql.cj.jdbc.Driver";
	Connection conn;
	String sql;
	PreparedStatement pstmt;
	ResultSet rs;
	Users user;
	List<Users> listaUtenti;

	@Override
	public Users getUser(int id) throws SQLException{
		user = null;
		conn = ConnessioneDB.openConnect(driver, url, userdb, password);
		if(conn != null) {
			sql = "select * from users where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(!rs.isBeforeFirst())
				System.out.println("Attualmente non sono presenti dati nell'id specificato");
			else {
				while(rs.next()) {
					user = new Users();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("Name"));
					user.setAddress(rs.getString("Adress"));
					user.setEmail(rs.getString("Email"));
					user.setPhone(rs.getString("Phone"));

				}
			}
		}

		return user;
	}

	@Override
	public List<Users> getAllUsers() throws SQLException {
		user = null;
		listaUtenti = new ArrayList<Users>();
		conn = ConnessioneDB.openConnect(driver, url, userdb, password);
		if(conn != null) {
			sql = "select * from users";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(!rs.isBeforeFirst())
				System.out.println("Attualmente non sono presenti dati nell'id specificato");
			else {
				while(rs.next()) {
					user = new Users();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("Name"));
					user.setAddress(rs.getString("Adress"));
					user.setEmail(rs.getString("Email"));
					user.setPhone(rs.getString("Phone"));
					listaUtenti.add(user);

				}
			}
		}
		return listaUtenti;
	}

	@Override
	public void addUser(Users user) throws SQLException {

		if(user != null) {
			conn = ConnessioneDB.openConnect(driver, url, userdb, password);
			if(conn != null) {
				sql = "insert into users (id, name, adress, email, phone) value (?, ?, ?, ?, ?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, user.getId());
				pstmt.setString(2, user.getName());
				pstmt.setString(3, user.getAddress());
				pstmt.setString(4, user.getEmail());
				pstmt.setString(5, user.getPhone());
				pstmt.executeUpdate();
				System.out.println("*** Inserimento avvenuto correttamente ***");

			} else {
				System.out.println("Nessun riferimento è stato passato per elaborare i dati");
			}
		}



	}

	@Override
	public void updateUser(Users user) throws SQLException{
		if(user != null) {
			conn = ConnessioneDB.openConnect(driver, url, userdb, password);
			if(conn != null) {
				sql = "update users set name = ?, adress = ?, email = ?, phone = ? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getAddress());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPhone());
				pstmt.setInt(5, user.getId());
				pstmt.executeUpdate();
				System.out.println("*** Aggiornamento avvenuto correttamente ***");
			}
		}
	}


	@Override
	public void deleteUser(int id) throws SQLException {
		conn = ConnessioneDB.openConnect(driver, url, userdb, password);
		if(conn != null) {
			try {
				sql = "delete from users where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, id);
				pstmt.executeUpdate();
				System.out.println("*** Cancellazione avvenuta correttamente ***");
			} catch (SQLException e) {

				System.out.println("Errore nella esecuzione della query delete: " + e.getMessage());
				e.printStackTrace();
			}
		}

	}

}
