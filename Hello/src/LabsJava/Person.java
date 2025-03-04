package LabsJava;

enum Gender{
	M, F
}

public class Person {
	
	String firstName;
	String lastName;
	Gender gender;
	
	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	
	Person(String fname, String lName, Gender g){
		
		this.firstName = fname;
		this.lastName = lName;
		this.gender = g;
	}
	
	public String toString() {
		
		return  "Person Details: " + "\n-----------" +"\nFirst Name: " + 
		getFirstName() + "\nLast Name: " + 
		getLastName() + "\nGender: " + getGender();
	}



}
