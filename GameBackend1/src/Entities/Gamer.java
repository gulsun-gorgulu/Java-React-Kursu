package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	private int id;
	private int gamerNumber;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	
	public Gamer(int id, int gamerNumber, String firstName, String lastName, int yearOfBirth, String nationalityId) {
		this.id = id;
		this.gamerNumber = gamerNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGamerNumber() {
		return this.gamerNumber;
	}

	public void setGamerNumber(int gamerNumber) {
		this.gamerNumber = gamerNumber;
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

	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return this.nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}

