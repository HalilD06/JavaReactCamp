package Entities;

import Abstract.IEntiti;

public class Customer implements IEntiti {
	private int id;
	private String firstName;
	private String lastName;
	private int dateofBirth;
	private String nationalId;
	
	
	public Customer(int id, String firstName, String lastName, int dateofBirth, String nationalId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.nationalId = nationalId;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(int dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
}
