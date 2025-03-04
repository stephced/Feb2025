package LabsJava;

//opening scanner 
import java.util.Scanner; 

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create scanner 
		Scanner num = new Scanner(System.in);
		
		//ask for user input
		System.out.println("Enter a number: ");
		
		int x = num.nextInt();
		
		if(x> 0) 
		{
			System.out.println("Postivie Number !");
		}else {
			System.out.println("Negative Number !");
		}
		num.close();
	}

}
