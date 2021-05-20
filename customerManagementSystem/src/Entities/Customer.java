package Entities;

import java.time.LocalDate;
import java.util.Date;

public class Customer {
private int id;
private String firstName;
private String lastName;
private String nationalIdentity;
private LocalDate birthDate;

public Customer() {
	
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

public String getNationalIdentity() {
	return nationalIdentity;
}

public void setNationalIdentity(String nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
}

public LocalDate getBirthDate() {
	return birthDate;
}

public void setBirthDate(LocalDate birthDate) {
	this.birthDate = birthDate;
}

public Customer(int id, String firstName, String lastName, String nationalIdentity, LocalDate birthDate) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalIdentity = nationalIdentity;
	this.birthDate = birthDate;
}
}
