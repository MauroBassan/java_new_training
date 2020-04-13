package jdbc;

public class Users {
	private int id;
	private String name;
	private String address;
	private String email;
	private String phone;
	
	public Users(){
		
	}
	
	public Users(int id, String name, String address, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String nome) {
		this.name = nome;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void stampaUser() {
		System.out.println("id: " + id);
		System.out.println("nome: " + name);
		System.out.println("indirizzo: " + address);
		System.out.println("email: " + email);
		System.out.println("telefono: " + phone);
		System.out.println("--------------------------------");
	}

	

}
