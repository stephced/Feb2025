package LabsJava;

public class lab7Phone extends Person {
	
	String phoneNum;
	
	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	lab7Phone(String fname, String lname, Gender g, String pNum){
		
		super(fname, lname,g);
		this.phoneNum = pNum;
		
	}
	
	public String toString() {
		
		return "Person Details: " + "\n------------"+ "\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() +
				"\nGender: " + getGender() + "\nPhone Number: " + getPhoneNum();
	}
	}
	


