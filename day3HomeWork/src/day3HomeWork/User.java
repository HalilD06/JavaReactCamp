package day3HomeWork;

public class User {
	int id;
	String firtName;
	String lastName;
	String Password;
	
	
	public User(int id, String firtName, String lastName, String password) {
		super();
		this.id = id;
		this.firtName = firtName;
		this.lastName = lastName;
		Password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirtName() {
		return firtName;
	}


	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	

}
